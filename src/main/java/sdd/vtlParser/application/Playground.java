package sdd.vtlParser.application;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ecb.codeBuilder.VtlBuilder;
import ecb.technical.interfaces.treeStructure.Tree;
import ecb.transformations.treeStructure.TNode;
import ecb.transformations.treeStructure.TTree;
import sdd.vtlParser.components.AST;
import sdd.vtlParser.components.Compiler;
import ecb.transformations.enums.Representation;
import ecb.transformations.metadata.TContext;
import ecb.transformations.treeStructure.TComponent;

/**
 * Playground in order to illustrate the utility of the parser.
 * 
 * @author Dominik Lin
 *
 */
public class Playground {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T extends TTree<V, S> & Tree<V, S>, V extends TNode<V, S>, S extends TComponent> void main(
	    String[] args) {
	Compiler compiler = new Compiler();
//	String query = "/*Pythagorean theorem*/ z := sqrt(x * x + y * y)";
	String query = "result := coordinates [calc sqrt(x * x + y * y) as \"distance\"];";

	System.out.println("----------------------------------");
	AST ast = new AST(compiler.compile(query));
	// show the abstract syntax tree in the console
	System.out.println("* Tree structure of the abstract syntax tree:");
	System.out.println(ast.toString());
	System.out.println("----------------------------------");

	// extract a (transformation) tree structure
	TTree tree = compiler.extractTree(query);
	if (!tree.isEmpty()) {
	    // show the resulting tree structure in the console
	    System.out
		    .println("* tree structure compliant with the BIRD interpretation of the SDMX information model:");
	    System.out.println(tree.toStringWithDepth());
	    System.out.println("----------------------------------");

	    // extract all nodes from the tree
	    Set<V> nodes = tree.getAllNodes();
	    EntityManager entityManager = null;
	    
	    // create a new transformation context
	    TContext context = new TContext();
	    try {
		entityManager = context.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
		    // begin the transaction and persist all nodes to the data
		    // base
		    transaction.begin();
		    Iterator<V> it = nodes.iterator();
		    while (it.hasNext()) {
			V node = it.next();
			entityManager.persist(node);
		    }
		    transaction.commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}

		// extract all nodes from the persistence context
		List<V> persistedNodes = entityManager.createNamedQuery(TNode.QUERY_GET_ALL).getResultList();
		System.out.println("* nodes stored in the persistence context:");
		if (persistedNodes != null && !persistedNodes.isEmpty()) {
		    for (V node : persistedNodes) {
			// show each individual node from the persistence
			// context in the console
			System.out.println("\t** " + node.toString() + " [" + node.getNodeId() + "]");
		    }
		}

	    } catch (Exception e) {
		e.printStackTrace();
	    } finally {
	    }

	    // trivial map creating vtl code from the (manipulated) tree
	    // create a builder
	    VtlBuilder builder = new VtlBuilder();
	    int maxDistance = tree.getMaximumDistance();
	    // iteration of the tree structure starting from the leafs to the
	    // root
	    for (int distance = maxDistance; distance >= 0; distance--) {
		Set<V> allNodes = tree.getAllNodesWithDistance(distance);
		for (V node : allNodes) {
		    builder.setTypeOfNode(node.getTypeOfNOde());
		    String vtlCode = builder.generateCode(node, Representation.STANDARD);
		    node.setVtlCode(vtlCode);
		}
	    }
	    // show the generated vtl code of the tree's root
	    System.out.println("----------------------------------");
	    System.out.println("* vtl code created by the builder:");
	    System.out.println(tree.getRoot().getVtlCode());
	    System.out.println("----------------------------------");
	    // close the transformation context
	    context.close();
	}
    }

}
