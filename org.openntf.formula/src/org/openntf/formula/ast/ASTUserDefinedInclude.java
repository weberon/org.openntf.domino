/* Generated By:JJTree: Do not edit this line. ASTUserDefinedInclude.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.openntf.formula.ast;

import org.openntf.formula.EvaluateException;
import org.openntf.formula.FormulaContext;
import org.openntf.formula.FormulaParseException;
import org.openntf.formula.FormulaReturnException;
import org.openntf.formula.ValueHolder;
import org.openntf.formula.parse.AtFormulaParserImpl;

public class ASTUserDefinedInclude extends SimpleNode {

	private Node staticInc;

	public ASTUserDefinedInclude(final AtFormulaParserImpl p, final int id) {
		super(p, id);
	}

	public void init() throws FormulaParseException {
		// Is this a static or a dynamic import
		if (children[0] instanceof ASTValueString) {
			ASTValueString child = (ASTValueString) children[0];
			String key = child.evaluate(null).getString(0);
			staticInc = (Node) parser.getInclude(key);

		}

	}

	@Override
	public ValueHolder evaluate(final FormulaContext ctx) throws FormulaReturnException {
		if (staticInc != null)
			return staticInc.evaluate(ctx);

		// TODO RPR: This is not yet implemented!
		ValueHolder vh = children[0].evaluate(ctx);
		String key = vh.getString(0);
		Node inc = (Node) ctx.getParser().getInclude(key);

		if (inc == null) {
			return ValueHolder.valueOf(new EvaluateException(codeLine, codeColumn, new IllegalArgumentException("'" + key
					+ "' could not be included")));
		}
		return inc.evaluate(ctx);
	}

}
/* JavaCC - OriginalChecksum=df1231d5cd4699152b313be5d9bef577 (do not edit this line) */
