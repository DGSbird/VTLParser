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

/**
 * Compiler class allows for extracting tree structures from a given VTL
 * expression. The result of the {@link #compile(String)} method is a parse tree
 * while the result of the {@link #extractTree(String)} method is a tree
 * structure reflecting the BIRD interpretation of the SDMX information model
 * for transformations.
 * 
 * @author Dominik Lin
 *
 */
@SuppressWarnings("unchecked")
public class Compiler extends AbstractCompiler {

    private static List<String> tokens = new ArrayList<>();

    /**
     * Sets up the list of tokens
     */
    private void setup() {
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

    /**
     * 
     * @param a
     *            VTL expression
     * @return the ParseTree corresponding to the given expression
     */
    @Override
    public ParseTree compile(String expression) {
	ANTLRInputStream input = new ANTLRInputStream(expression.replace("\n", " "));
	VtlLexer lexer = new VtlLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	VtlParser parser = new VtlParser(tokens);
	ParseTree tree = parser.start();
	return tree;
    }

    /**
     * Given a VTL expression this method extracts a parse tree and transforms
     * this parse tree into a tree structure that reflects the BIRD
     * interpretation of the SDMX information model for transformations. Please
     * note that in case the parse tree contains any errors (e.g. the given
     * expression is no valid VTL expression) null will be returned.
     * 
     * @param expression
     *            a VTL expression
     * @return a tree structure reflecting the BIRD interpretation of the SDMX
     *         information model for transformations
     */
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
		// there is an error in the generated tree structure
		tree = null;
	    } else {
		// manipulate tree structure in order to comply with the sdmx
		// information model for transformations
		tree.transform();
	    }
	}
	return tree;
    }

    /**
     * Transports the information from a parse tree into a tree structure with
     * the input node as it's root.
     * 
     * @param inputTree
     *            a parse tree
     * @param node
     *            an object extending the transformation node class
     */
    private static <S extends TNode<S, V> & Node<S, V>, V extends TComponent> void visit(ParseTree inputTree, S node) {
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
