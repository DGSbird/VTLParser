package sdd.vtlParser.components;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.tree.ParseTree;

public abstract class AbstractCompiler {

	public AbstractCompiler() {
		super();
	}

	public abstract ParseTree compile(String expression);

	protected void printTree(CommonTree ast) {
		print(ast, 0);
	}

	private void print(CommonTree tree, int level) {
		//indent level
		for (int i = 0; i < level; i++)
			System.out.print("--");

		if (tree==null) {
			System.out.println(" null tree.");
			return ;
		}

		//print node description: type code followed by token text
		System.out.println(" " + tree.getType() + " " + tree.getText());
		
		//print all children
		if (tree.getChildren() != null)
			for (Object ie : tree.getChildren()) {
				print((CommonTree) ie, level + 1);
			}
	}

}