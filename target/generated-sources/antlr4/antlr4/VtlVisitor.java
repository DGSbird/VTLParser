// Generated from Vtl.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VtlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VtlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(VtlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(VtlParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VtlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(VtlParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCallBody(VtlParser.ProcedureCallBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOrExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrExpr(VtlParser.ExprOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprConcatExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcatExpr(VtlParser.ExprConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(VtlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseExpr(VtlParser.IfThenElseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(VtlParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfExpr(VtlParser.ElseIfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpr(VtlParser.ElseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(VtlParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(VtlParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(VtlParser.ExprEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExists(VtlParser.ExprExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(VtlParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompBetween}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompBetween(VtlParser.ExprCompBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompIn}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompIn(VtlParser.ExprCompInContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(VtlParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiply(VtlParser.ExprMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactor(VtlParser.ExprFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMember(VtlParser.ExprMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefMapping(VtlParser.DefMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionClause(VtlParser.ConditionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapTo(VtlParser.MapToContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFrom(VtlParser.MapFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseMapping(VtlParser.RuleClauseMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemMapping(VtlParser.RuleItemMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefHierarchical(VtlParser.DefHierarchicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseHierarchical(VtlParser.RuleClauseHierarchicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemHierarchical(VtlParser.RuleItemHierarchicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierRuleSignature(VtlParser.HierRuleSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntecedentItem(VtlParser.AntecedentItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelationSignature(VtlParser.CodeItemRelationSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelation(VtlParser.CodeItemRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelationClause(VtlParser.CodeItemRelationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRef(VtlParser.CodeItemRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDatapoint(VtlParser.DefDatapointContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetBody(VtlParser.RulesetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetruleList(VtlParser.SetruleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetrule(VtlParser.SetruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleID(VtlParser.RuleIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseDatapoint(VtlParser.RuleClauseDatapointContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemDatapoint(VtlParser.RuleItemDatapointContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetSignature(VtlParser.RulesetSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSignature(VtlParser.VarSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDataset(VtlParser.DefDatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDataStructure(VtlParser.DefDataStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureClause(VtlParser.DataStructureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureItem(VtlParser.DataStructureItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVariable(VtlParser.DefVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefValueDomainSubset(VtlParser.DefValueDomainSubsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefValueDomain(VtlParser.DefValueDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(VtlParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefProcedure(VtlParser.DefProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(VtlParser.ProcedureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionTypeClause(VtlParser.DimensionTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeListClause(VtlParser.CodeListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeRestrictionClause(VtlParser.DataTypeRestrictionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrictClause(VtlParser.RestrictClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberClause(VtlParser.NumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringClause(VtlParser.StringClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateClause(VtlParser.DateClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundAtom(VtlParser.RoundAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ceilAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilAtom(VtlParser.CeilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floorAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorAtom(VtlParser.FloorAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinAtom(VtlParser.MinAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxAtom(VtlParser.MaxAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtom(VtlParser.ExpAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lnAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLnAtom(VtlParser.LnAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAtom(VtlParser.LogAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerAtom(VtlParser.PowerAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtAtom(VtlParser.SqrtAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nrootAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNrootAtom(VtlParser.NrootAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lenAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenAtom(VtlParser.LenAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimAtom(VtlParser.TrimAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtrimAtom(VtlParser.LtrimAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rtrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtrimAtom(VtlParser.RtrimAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ucaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcaseAtom(VtlParser.UcaseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lcaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcaseAtom(VtlParser.LcaseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrAtom(VtlParser.SubstrAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrAtom(VtlParser.InstrAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date_from_stringAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_from_stringAtom(VtlParser.Date_from_stringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_from_dateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_from_dateAtom(VtlParser.String_from_dateAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceAtom(VtlParser.ReplaceAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexofAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexofAtom(VtlParser.IndexofAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingAtom(VtlParser.MissingAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charsetMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetMatchAtom(VtlParser.CharsetMatchAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codelistMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodelistMatchAtom(VtlParser.CodelistMatchAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLengthAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLengthAtom(VtlParser.CharLengthAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtom(VtlParser.TypeAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersectAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectAtom(VtlParser.IntersectAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionAtom(VtlParser.UnionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diffAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffAtom(VtlParser.DiffAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notInAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInAtom(VtlParser.NotInAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInAtom(VtlParser.InAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullAtom(VtlParser.IsNullAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nvlAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlAtom(VtlParser.NvlAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAtom(VtlParser.ModAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listsumAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListsumAtom(VtlParser.ListsumAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllAtom(VtlParser.AllAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyAtom(VtlParser.AnyAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueAtom(VtlParser.UniqueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_depAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_depAtom(VtlParser.Func_depAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extractAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractAtom(VtlParser.ExtractAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentDateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDateAtom(VtlParser.CurrentDateAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExprAtom(VtlParser.GetExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefAtom(VtlParser.RefAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutExprAtom(VtlParser.PutExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExprAtom(VtlParser.EvalExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hierarchyExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExprAtom(VtlParser.HierarchyExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transcodeExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeExprAtom(VtlParser.TranscodeExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flowToStockAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowToStockAtom(VtlParser.FlowToStockAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stockToFlowAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStockToFlowAtom(VtlParser.StockToFlowAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAtom(VtlParser.JoinAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprAtom(VtlParser.SetExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExprAtom(VtlParser.ExprExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCountAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCountAtom(VtlParser.ExprCountAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIfExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIfExpr(VtlParser.ExprIfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprValidationExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValidationExpr(VtlParser.ExprValidationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(VtlParser.ExprFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExprAtom(VtlParser.SumExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExprParam(VtlParser.StrExprParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExpr(VtlParser.AlterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExprRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExprRef(VtlParser.ParenthesisExprRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIdRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdRef(VtlParser.VarIdRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantRef(VtlParser.ConstantRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRef(VtlParser.ListRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(VtlParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListofCompList(VtlParser.ListofCompListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentList(VtlParser.ComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedupList(VtlParser.DedupListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(VtlParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(VtlParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainList(VtlParser.ValueDomainListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpr(VtlParser.GetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutExpr(VtlParser.PutExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutInputParameters(VtlParser.PutInputParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExpr(VtlParser.EvalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpr(VtlParser.ConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeShiftExpr(VtlParser.TimeShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesExpr(VtlParser.TimeSeriesExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationExpr(VtlParser.ValidationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationExprContent(VtlParser.ValidationExprContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationDatapoint(VtlParser.ValidationDatapointContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationHierarchical(VtlParser.ValidationHierarchicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationValueDoman(VtlParser.ValidationValueDomanContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErCode(VtlParser.ErCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErLevel(VtlParser.ErLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExpr(VtlParser.HierarchyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyInputParameters(VtlParser.HierarchyInputParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeExpr(VtlParser.TranscodeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeInputParameters(VtlParser.TranscodeInputParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingExpr(VtlParser.MappingExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrParam(VtlParser.AggrParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetClause(VtlParser.DatasetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunctionClause(VtlParser.AnFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(VtlParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(VtlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(VtlParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenRowsClauseItem(VtlParser.BetweenRowsClauseItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpr(VtlParser.JoinExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(VtlParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBody(VtlParser.JoinBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(VtlParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcClause(VtlParser.JoinCalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDropClause(VtlParser.JoinDropClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeepClause(VtlParser.JoinKeepClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterClause(VtlParser.JoinFilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameClause(VtlParser.JoinRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinUnfoldClause(VtlParser.JoinUnfoldClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFoldClause(VtlParser.JoinFoldClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunction(VtlParser.AnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregategetClause(VtlParser.AggregategetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateClause(VtlParser.AggregateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunctionClause(VtlParser.AggrFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedupClause(VtlParser.DedupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFiltersClause(VtlParser.GetFiltersClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFilterClause(VtlParser.GetFilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrClause(VtlParser.AggrClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(VtlParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameClause(VtlParser.RenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunction(VtlParser.AggrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClause(VtlParser.CalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrCalcClause(VtlParser.AttrCalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClauseItem(VtlParser.CalcClauseItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(VtlParser.CalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClause(VtlParser.DropClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClauseItem(VtlParser.DropClauseItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClause(VtlParser.KeepClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClauseItem(VtlParser.KeepClauseItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareClause(VtlParser.CompareClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBetweenClause(VtlParser.InBetweenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimClause(VtlParser.DimClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(VtlParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(VtlParser.SubscriptExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapItemClause(VtlParser.MapItemClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAgg(VtlParser.ReturnAggContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAll(VtlParser.ReturnAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleID(VtlParser.RoleIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionType(VtlParser.DimensionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogBase(VtlParser.LogBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(VtlParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersistentDatasetID(VtlParser.PersistentDatasetIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetID(VtlParser.RulesetIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainID(VtlParser.ValueDomainIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(VtlParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentID(VtlParser.ComponentIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionID(VtlParser.FunctionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureID(VtlParser.ProcedureIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingID(VtlParser.MappingIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(VtlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDatapointRuleset(VtlParser.DefineDatapointRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineHierarchicalRuleset(VtlParser.DefineHierarchicalRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineMapping(VtlParser.DefineMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDatapointRuleset(VtlParser.EndDatapointRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndHierarchicalRuleset(VtlParser.EndHierarchicalRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndMappingRuleset(VtlParser.EndMappingRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(VtlParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArgList(VtlParser.ProcedureArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArg(VtlParser.ProcedureArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprListRestricted(VtlParser.SetExprListRestrictedContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetList(VtlParser.DatasetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(VtlParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetAlias(VtlParser.DatasetAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMemberListAlias(VtlParser.SetMemberListAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMemberList(VtlParser.SetMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMember(VtlParser.SetMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMembers(VtlParser.SetMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringC(VtlParser.StringCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInputList(VtlParser.ProcedureInputListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInput(VtlParser.ProcedureInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerC(VtlParser.IntegerCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegIntegerC(VtlParser.NegIntegerCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatC(VtlParser.FloatCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullC(VtlParser.NullCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanC(VtlParser.BooleanCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberC(VtlParser.NumberCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIDList(VtlParser.VarIDListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameArgList(VtlParser.JoinRenameArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameArg(VtlParser.JoinRenameArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameArgList(VtlParser.RenameArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameArg(VtlParser.RenameArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetArgList(VtlParser.RulesetArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetArg(VtlParser.RulesetArgContext ctx);
}