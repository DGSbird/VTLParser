package sdd.vtlParser.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.VtlLexer;
import antlr4.VtlParser;
import ecb.technical.interfaces.treeStructure.Node;
import ecb.technical.interfaces.treeStructure.Tree;
import ecb.transformations.metadata.TContext;
import ecb.transformations.treeStructure.TComponent;
import ecb.transformations.treeStructure.TNode;
import ecb.transformations.treeStructure.TTree;

@SuppressWarnings("unchecked")
public class Compiler extends AbstractCompiler {

    public static List<String> tokens = new ArrayList<>();

    public void setup() {
	Vocabulary voc = VtlParser.VOCABULARY;
	try {
	    for (int i = 0; i < voc.getMaxTokenType(); i++) {
		if (voc.getLiteralName(i) != null) {
		    tokens.add(voc.getLiteralName(i));
		}
	    }
	} catch (Exception e) {
	}
    }

    @Override
    public ParseTree compile(String expression) {
	ANTLRInputStream input = new ANTLRInputStream(expression.replace("\n", " "));
	VtlLexer lexer = new VtlLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	VtlParser parser = new VtlParser(tokens);
	ParseTree tree = parser.start();
	return tree;
    }

    public <T extends TTree<S, V> & Tree<S, V>, S extends TNode<S, V>, V extends TComponent> T extractTree(
	    String expression) {
	T tree = null;
	ParseTree parseTree = compile(expression);
	if (parseTree != null) {
	    setup();
	    tree = (T) new TTree<S, V>();
	    S origin = (S) new TNode<>((V) new TComponent(TContext.CONST_ORIGIN, TContext.CONST_ORIGIN));
	    visit(parseTree, origin);
	    tree.setRoot(origin);
	    if (tree.findAllByType(TContext.CONST_ERROR_NODE_IMPL) != null) {
		tree = null;
	    } else {
		// manipulate tree structure to fit the sdmx information model
		// for transformations

	    }
	}
	return tree;
    }

    public static <S extends TNode<S, V> & Node<S, V>, V extends TComponent> void visit(ParseTree inputTree, S node) {
	if (inputTree.getChildCount() > 0) {
	    for (int i = 0; i < inputTree.getChildCount(); i++) {
		ParseTree child = inputTree.getChild(i);

		String type = child.getClass().getSimpleName().replaceAll("Context", "");
		String expression = child.getText();

		V component = (V) new TComponent(expression, type);
		if (type.equals(TContext.CONST_TERMINAL_NODE_IMPL)) {
		    if (tokens.contains("'" + expression + "'")) {
			component.setType(expression);
		    }
		}

		S childNode = (S) new TNode<>((V) component);
		node.addChild(childNode);
		visit(child, childNode);
	    }
	} else {
	    // a leaf of the tree
	    String type = inputTree.getClass().getSimpleName().replaceAll("Context", "");
	    String expression = inputTree.getText();
	    V component = (V) new TComponent(expression, type);
	    S childNode = (S) new TNode<>(component);
	    node.addChild(childNode);

	}
    }

}
