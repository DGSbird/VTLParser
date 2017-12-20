package sdd.vtlParser.components;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
public abstract class AbstractCompiler {

    public AbstractCompiler() {
	super();
    }

    public abstract ParseTree compile(String expression);

    protected void printTree(CommonTree ast) {
	print(ast, 0);
    }

    private void print(CommonTree tree, int level) {
	// indent level
	for (int i = 0; i < level; i++)
	    System.out.print("--");

	if (tree == null) {
	    System.out.println(" null tree.");
	    return;
	}

	// print node description: type code followed by token text
	System.out.println(" " + tree.getType() + " " + tree.getText());

	// print all children
	if (tree.getChildren() != null)
	    for (Object ie : tree.getChildren()) {
		print((CommonTree) ie, level + 1);
	    }
    }

}