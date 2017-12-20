// Generated from Vtl.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VtlParser}.
 */
public interface VtlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(VtlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(VtlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(VtlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(VtlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VtlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VtlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(VtlParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(VtlParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallBody(VtlParser.ProcedureCallBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallBody(VtlParser.ProcedureCallBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOrExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOrExpr(VtlParser.ExprOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOrExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOrExpr(VtlParser.ExprOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprConcatExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcatExpr(VtlParser.ExprConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprConcatExpr}
	 * labeled alternative in {@link VtlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcatExpr(VtlParser.ExprConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(VtlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(VtlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseExpr(VtlParser.IfThenElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseExpr(VtlParser.IfThenElseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(VtlParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(VtlParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseIfExpr(VtlParser.ElseIfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseIfExpr(VtlParser.ElseIfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(VtlParser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(VtlParser.ElseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(VtlParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(VtlParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(VtlParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(VtlParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void enterExprEq(VtlParser.ExprEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void exitExprEq(VtlParser.ExprEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void enterExprExists(VtlParser.ExprExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void exitExprExists(VtlParser.ExprExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(VtlParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(VtlParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompBetween}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 */
	void enterExprCompBetween(VtlParser.ExprCompBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompBetween}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 */
	void exitExprCompBetween(VtlParser.ExprCompBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompIn}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 */
	void enterExprCompIn(VtlParser.ExprCompInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompIn}
	 * labeled alternative in {@link VtlParser#exprCompExt}.
	 * @param ctx the parse tree
	 */
	void exitExprCompIn(VtlParser.ExprCompInContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(VtlParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(VtlParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiply(VtlParser.ExprMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiply(VtlParser.ExprMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 */
	void enterExprFactor(VtlParser.ExprFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 */
	void exitExprFactor(VtlParser.ExprFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 */
	void enterExprMember(VtlParser.ExprMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 */
	void exitExprMember(VtlParser.ExprMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 */
	void enterDefMapping(VtlParser.DefMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 */
	void exitDefMapping(VtlParser.DefMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void enterConditionClause(VtlParser.ConditionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void exitConditionClause(VtlParser.ConditionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 */
	void enterMapTo(VtlParser.MapToContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 */
	void exitMapTo(VtlParser.MapToContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 */
	void enterMapFrom(VtlParser.MapFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 */
	void exitMapFrom(VtlParser.MapFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseMapping(VtlParser.RuleClauseMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseMapping(VtlParser.RuleClauseMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemMapping(VtlParser.RuleItemMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemMapping(VtlParser.RuleItemMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterDefHierarchical(VtlParser.DefHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitDefHierarchical(VtlParser.DefHierarchicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseHierarchical(VtlParser.RuleClauseHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseHierarchical(VtlParser.RuleClauseHierarchicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemHierarchical(VtlParser.RuleItemHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemHierarchical(VtlParser.RuleItemHierarchicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void enterHierRuleSignature(VtlParser.HierRuleSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void exitHierRuleSignature(VtlParser.HierRuleSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 */
	void enterAntecedentItem(VtlParser.AntecedentItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 */
	void exitAntecedentItem(VtlParser.AntecedentItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelationSignature(VtlParser.CodeItemRelationSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelationSignature(VtlParser.CodeItemRelationSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelation(VtlParser.CodeItemRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelation(VtlParser.CodeItemRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelationClause(VtlParser.CodeItemRelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelationClause(VtlParser.CodeItemRelationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRef(VtlParser.CodeItemRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRef(VtlParser.CodeItemRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterDefDatapoint(VtlParser.DefDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitDefDatapoint(VtlParser.DefDatapointContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 */
	void enterRulesetBody(VtlParser.RulesetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 */
	void exitRulesetBody(VtlParser.RulesetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 */
	void enterSetruleList(VtlParser.SetruleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 */
	void exitSetruleList(VtlParser.SetruleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 */
	void enterSetrule(VtlParser.SetruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 */
	void exitSetrule(VtlParser.SetruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 */
	void enterRuleID(VtlParser.RuleIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 */
	void exitRuleID(VtlParser.RuleIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseDatapoint(VtlParser.RuleClauseDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseDatapoint(VtlParser.RuleClauseDatapointContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemDatapoint(VtlParser.RuleItemDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemDatapoint(VtlParser.RuleItemDatapointContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void enterRulesetSignature(VtlParser.RulesetSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void exitRulesetSignature(VtlParser.RulesetSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 */
	void enterVarSignature(VtlParser.VarSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 */
	void exitVarSignature(VtlParser.VarSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 */
	void enterDefDataset(VtlParser.DefDatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 */
	void exitDefDataset(VtlParser.DefDatasetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDefDataStructure(VtlParser.DefDataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDefDataStructure(VtlParser.DefDataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureClause(VtlParser.DataStructureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureClause(VtlParser.DataStructureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureItem(VtlParser.DataStructureItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureItem(VtlParser.DataStructureItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefVariable(VtlParser.DefVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefVariable(VtlParser.DefVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 */
	void enterDefValueDomainSubset(VtlParser.DefValueDomainSubsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 */
	void exitDefValueDomainSubset(VtlParser.DefValueDomainSubsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 */
	void enterDefValueDomain(VtlParser.DefValueDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 */
	void exitDefValueDomain(VtlParser.DefValueDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(VtlParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(VtlParser.DefFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDefProcedure(VtlParser.DefProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDefProcedure(VtlParser.DefProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(VtlParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(VtlParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterDimensionTypeClause(VtlParser.DimensionTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitDimensionTypeClause(VtlParser.DimensionTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeListClause(VtlParser.CodeListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeListClause(VtlParser.CodeListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeRestrictionClause(VtlParser.DataTypeRestrictionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeRestrictionClause(VtlParser.DataTypeRestrictionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 */
	void enterRestrictClause(VtlParser.RestrictClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 */
	void exitRestrictClause(VtlParser.RestrictClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 */
	void enterNumberClause(VtlParser.NumberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 */
	void exitNumberClause(VtlParser.NumberClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 */
	void enterStringClause(VtlParser.StringClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 */
	void exitStringClause(VtlParser.StringClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void enterDateClause(VtlParser.DateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void exitDateClause(VtlParser.DateClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterRoundAtom(VtlParser.RoundAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitRoundAtom(VtlParser.RoundAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ceilAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCeilAtom(VtlParser.CeilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ceilAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCeilAtom(VtlParser.CeilAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floorAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterFloorAtom(VtlParser.FloorAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floorAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitFloorAtom(VtlParser.FloorAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterMinAtom(VtlParser.MinAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitMinAtom(VtlParser.MinAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterMaxAtom(VtlParser.MaxAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitMaxAtom(VtlParser.MaxAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpAtom(VtlParser.ExpAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpAtom(VtlParser.ExpAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lnAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLnAtom(VtlParser.LnAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lnAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLnAtom(VtlParser.LnAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLogAtom(VtlParser.LogAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLogAtom(VtlParser.LogAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterPowerAtom(VtlParser.PowerAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitPowerAtom(VtlParser.PowerAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSqrtAtom(VtlParser.SqrtAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSqrtAtom(VtlParser.SqrtAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nrootAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNrootAtom(VtlParser.NrootAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nrootAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNrootAtom(VtlParser.NrootAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lenAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLenAtom(VtlParser.LenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lenAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLenAtom(VtlParser.LenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrimAtom(VtlParser.TrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrimAtom(VtlParser.TrimAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLtrimAtom(VtlParser.LtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLtrimAtom(VtlParser.LtrimAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rtrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterRtrimAtom(VtlParser.RtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rtrimAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitRtrimAtom(VtlParser.RtrimAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ucaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterUcaseAtom(VtlParser.UcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ucaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitUcaseAtom(VtlParser.UcaseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lcaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLcaseAtom(VtlParser.LcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lcaseAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLcaseAtom(VtlParser.LcaseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubstrAtom(VtlParser.SubstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubstrAtom(VtlParser.SubstrAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterInstrAtom(VtlParser.InstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitInstrAtom(VtlParser.InstrAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date_from_stringAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterDate_from_stringAtom(VtlParser.Date_from_stringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date_from_stringAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitDate_from_stringAtom(VtlParser.Date_from_stringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_from_dateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterString_from_dateAtom(VtlParser.String_from_dateAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_from_dateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitString_from_dateAtom(VtlParser.String_from_dateAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterReplaceAtom(VtlParser.ReplaceAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitReplaceAtom(VtlParser.ReplaceAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexofAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIndexofAtom(VtlParser.IndexofAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexofAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIndexofAtom(VtlParser.IndexofAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code missingAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterMissingAtom(VtlParser.MissingAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code missingAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitMissingAtom(VtlParser.MissingAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charsetMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCharsetMatchAtom(VtlParser.CharsetMatchAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charsetMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCharsetMatchAtom(VtlParser.CharsetMatchAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codelistMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCodelistMatchAtom(VtlParser.CodelistMatchAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codelistMatchAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCodelistMatchAtom(VtlParser.CodelistMatchAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charLengthAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCharLengthAtom(VtlParser.CharLengthAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charLengthAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCharLengthAtom(VtlParser.CharLengthAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtom(VtlParser.TypeAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtom(VtlParser.TypeAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersectAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntersectAtom(VtlParser.IntersectAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersectAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntersectAtom(VtlParser.IntersectAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnionAtom(VtlParser.UnionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnionAtom(VtlParser.UnionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diffAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterDiffAtom(VtlParser.DiffAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diffAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitDiffAtom(VtlParser.DiffAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNotInAtom(VtlParser.NotInAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNotInAtom(VtlParser.NotInAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterInAtom(VtlParser.InAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitInAtom(VtlParser.InAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIsNullAtom(VtlParser.IsNullAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIsNullAtom(VtlParser.IsNullAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nvlAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNvlAtom(VtlParser.NvlAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nvlAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNvlAtom(VtlParser.NvlAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterModAtom(VtlParser.ModAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitModAtom(VtlParser.ModAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listsumAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterListsumAtom(VtlParser.ListsumAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listsumAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitListsumAtom(VtlParser.ListsumAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAllAtom(VtlParser.AllAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAllAtom(VtlParser.AllAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAnyAtom(VtlParser.AnyAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAnyAtom(VtlParser.AnyAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterUniqueAtom(VtlParser.UniqueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitUniqueAtom(VtlParser.UniqueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_depAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunc_depAtom(VtlParser.Func_depAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_depAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunc_depAtom(VtlParser.Func_depAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExtractAtom(VtlParser.ExtractAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExtractAtom(VtlParser.ExtractAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDateAtom(VtlParser.CurrentDateAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDateAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDateAtom(VtlParser.CurrentDateAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterGetExprAtom(VtlParser.GetExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitGetExprAtom(VtlParser.GetExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterRefAtom(VtlParser.RefAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitRefAtom(VtlParser.RefAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterPutExprAtom(VtlParser.PutExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitPutExprAtom(VtlParser.PutExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evalExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterEvalExprAtom(VtlParser.EvalExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evalExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitEvalExprAtom(VtlParser.EvalExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hierarchyExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExprAtom(VtlParser.HierarchyExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hierarchyExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExprAtom(VtlParser.HierarchyExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transcodeExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeExprAtom(VtlParser.TranscodeExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transcodeExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeExprAtom(VtlParser.TranscodeExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flowToStockAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterFlowToStockAtom(VtlParser.FlowToStockAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flowToStockAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitFlowToStockAtom(VtlParser.FlowToStockAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stockToFlowAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterStockToFlowAtom(VtlParser.StockToFlowAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stockToFlowAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitStockToFlowAtom(VtlParser.StockToFlowAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterJoinAtom(VtlParser.JoinAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitJoinAtom(VtlParser.JoinAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSetExprAtom(VtlParser.SetExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSetExprAtom(VtlParser.SetExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprExprAtom(VtlParser.ExprExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprExprAtom(VtlParser.ExprExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCountAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprCountAtom(VtlParser.ExprCountAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCountAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprCountAtom(VtlParser.ExprCountAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIfExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprIfExpr(VtlParser.ExprIfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIfExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprIfExpr(VtlParser.ExprIfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprValidationExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprValidationExpr(VtlParser.ExprValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprValidationExpr}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprValidationExpr(VtlParser.ExprValidationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(VtlParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(VtlParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSumExprAtom(VtlParser.SumExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumExprAtom}
	 * labeled alternative in {@link VtlParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSumExprAtom(VtlParser.SumExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 */
	void enterStrExprParam(VtlParser.StrExprParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 */
	void exitStrExprParam(VtlParser.StrExprParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 */
	void enterAlterExpr(VtlParser.AlterExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 */
	void exitAlterExpr(VtlParser.AlterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExprRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExprRef(VtlParser.ParenthesisExprRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExprRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExprRef(VtlParser.ParenthesisExprRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIdRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterVarIdRef(VtlParser.VarIdRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIdRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitVarIdRef(VtlParser.VarIdRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterConstantRef(VtlParser.ConstantRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitConstantRef(VtlParser.ConstantRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterListRef(VtlParser.ListRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listRef}
	 * labeled alternative in {@link VtlParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitListRef(VtlParser.ListRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(VtlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(VtlParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 */
	void enterListofCompList(VtlParser.ListofCompListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 */
	void exitListofCompList(VtlParser.ListofCompListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 */
	void enterComponentList(VtlParser.ComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 */
	void exitComponentList(VtlParser.ComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 */
	void enterDedupList(VtlParser.DedupListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 */
	void exitDedupList(VtlParser.DedupListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VtlParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VtlParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(VtlParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(VtlParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainList(VtlParser.ValueDomainListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainList(VtlParser.ValueDomainListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void enterGetExpr(VtlParser.GetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void exitGetExpr(VtlParser.GetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 */
	void enterPutExpr(VtlParser.PutExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 */
	void exitPutExpr(VtlParser.PutExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterPutInputParameters(VtlParser.PutInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitPutInputParameters(VtlParser.PutInputParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpr(VtlParser.EvalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpr(VtlParser.EvalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(VtlParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(VtlParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeShiftExpr(VtlParser.TimeShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeShiftExpr(VtlParser.TimeShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesExpr(VtlParser.TimeSeriesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesExpr(VtlParser.TimeSeriesExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void enterValidationExpr(VtlParser.ValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void exitValidationExpr(VtlParser.ValidationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 */
	void enterValidationExprContent(VtlParser.ValidationExprContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 */
	void exitValidationExprContent(VtlParser.ValidationExprContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterValidationDatapoint(VtlParser.ValidationDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitValidationDatapoint(VtlParser.ValidationDatapointContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterValidationHierarchical(VtlParser.ValidationHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitValidationHierarchical(VtlParser.ValidationHierarchicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 */
	void enterValidationValueDoman(VtlParser.ValidationValueDomanContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 */
	void exitValidationValueDoman(VtlParser.ValidationValueDomanContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 */
	void enterErCode(VtlParser.ErCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 */
	void exitErCode(VtlParser.ErCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 */
	void enterErLevel(VtlParser.ErLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 */
	void exitErLevel(VtlParser.ErLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExpr(VtlParser.HierarchyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExpr(VtlParser.HierarchyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyInputParameters(VtlParser.HierarchyInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyInputParameters(VtlParser.HierarchyInputParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeExpr(VtlParser.TranscodeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeExpr(VtlParser.TranscodeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeInputParameters(VtlParser.TranscodeInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeInputParameters(VtlParser.TranscodeInputParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void enterMappingExpr(VtlParser.MappingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void exitMappingExpr(VtlParser.MappingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 */
	void enterAggrParam(VtlParser.AggrParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 */
	void exitAggrParam(VtlParser.AggrParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(VtlParser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(VtlParser.DatasetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAnFunctionClause(VtlParser.AnFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAnFunctionClause(VtlParser.AnFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(VtlParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(VtlParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(VtlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(VtlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(VtlParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(VtlParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterBetweenRowsClauseItem(VtlParser.BetweenRowsClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitBetweenRowsClauseItem(VtlParser.BetweenRowsClauseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpr(VtlParser.JoinExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpr(VtlParser.JoinExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(VtlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(VtlParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void enterJoinBody(VtlParser.JoinBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void exitJoinBody(VtlParser.JoinBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(VtlParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(VtlParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcClause(VtlParser.JoinCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcClause(VtlParser.JoinCalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDropClause(VtlParser.JoinDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDropClause(VtlParser.JoinDropClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeepClause(VtlParser.JoinKeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeepClause(VtlParser.JoinKeepClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterClause(VtlParser.JoinFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterClause(VtlParser.JoinFilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameClause(VtlParser.JoinRenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameClause(VtlParser.JoinRenameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinUnfoldClause(VtlParser.JoinUnfoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinUnfoldClause(VtlParser.JoinUnfoldClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFoldClause(VtlParser.JoinFoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFoldClause(VtlParser.JoinFoldClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnFunction(VtlParser.AnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnFunction(VtlParser.AnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregategetClause(VtlParser.AggregategetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregategetClause(VtlParser.AggregategetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateClause(VtlParser.AggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateClause(VtlParser.AggregateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunctionClause(VtlParser.AggrFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunctionClause(VtlParser.AggrFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 */
	void enterDedupClause(VtlParser.DedupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 */
	void exitDedupClause(VtlParser.DedupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFiltersClause(VtlParser.GetFiltersClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFiltersClause(VtlParser.GetFiltersClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFilterClause(VtlParser.GetFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFilterClause(VtlParser.GetFilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrClause(VtlParser.AggrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrClause(VtlParser.AggrClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(VtlParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(VtlParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameClause(VtlParser.RenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameClause(VtlParser.RenameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunction(VtlParser.AggrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunction(VtlParser.AggrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 */
	void enterCalcClause(VtlParser.CalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 */
	void exitCalcClause(VtlParser.CalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 */
	void enterAttrCalcClause(VtlParser.AttrCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 */
	void exitAttrCalcClause(VtlParser.AttrCalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterCalcClauseItem(VtlParser.CalcClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitCalcClauseItem(VtlParser.CalcClauseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(VtlParser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(VtlParser.CalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 */
	void enterDropClause(VtlParser.DropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 */
	void exitDropClause(VtlParser.DropClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterDropClauseItem(VtlParser.DropClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitDropClauseItem(VtlParser.DropClauseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 */
	void enterKeepClause(VtlParser.KeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 */
	void exitKeepClause(VtlParser.KeepClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterKeepClauseItem(VtlParser.KeepClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitKeepClauseItem(VtlParser.KeepClauseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 */
	void enterCompareClause(VtlParser.CompareClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 */
	void exitCompareClause(VtlParser.CompareClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void enterInBetweenClause(VtlParser.InBetweenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void exitInBetweenClause(VtlParser.InBetweenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 */
	void enterDimClause(VtlParser.DimClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 */
	void exitDimClause(VtlParser.DimClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(VtlParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(VtlParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(VtlParser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(VtlParser.SubscriptExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 */
	void enterMapItemClause(VtlParser.MapItemClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 */
	void exitMapItemClause(VtlParser.MapItemClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 */
	void enterReturnAgg(VtlParser.ReturnAggContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 */
	void exitReturnAgg(VtlParser.ReturnAggContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void enterReturnAll(VtlParser.ReturnAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void exitReturnAll(VtlParser.ReturnAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 */
	void enterRoleID(VtlParser.RoleIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 */
	void exitRoleID(VtlParser.RoleIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionType(VtlParser.DimensionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionType(VtlParser.DimensionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 */
	void enterLogBase(VtlParser.LogBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 */
	void exitLogBase(VtlParser.LogBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(VtlParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(VtlParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void enterPersistentDatasetID(VtlParser.PersistentDatasetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void exitPersistentDatasetID(VtlParser.PersistentDatasetIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void enterRulesetID(VtlParser.RulesetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void exitRulesetID(VtlParser.RulesetIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainID(VtlParser.ValueDomainIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainID(VtlParser.ValueDomainIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(VtlParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(VtlParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 */
	void enterComponentID(VtlParser.ComponentIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 */
	void exitComponentID(VtlParser.ComponentIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionID(VtlParser.FunctionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionID(VtlParser.FunctionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 */
	void enterProcedureID(VtlParser.ProcedureIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 */
	void exitProcedureID(VtlParser.ProcedureIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 */
	void enterMappingID(VtlParser.MappingIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 */
	void exitMappingID(VtlParser.MappingIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(VtlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(VtlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineDatapointRuleset(VtlParser.DefineDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineDatapointRuleset(VtlParser.DefineDatapointRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineHierarchicalRuleset(VtlParser.DefineHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineHierarchicalRuleset(VtlParser.DefineHierarchicalRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 */
	void enterDefineMapping(VtlParser.DefineMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 */
	void exitDefineMapping(VtlParser.DefineMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndDatapointRuleset(VtlParser.EndDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndDatapointRuleset(VtlParser.EndDatapointRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndHierarchicalRuleset(VtlParser.EndHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndHierarchicalRuleset(VtlParser.EndHierarchicalRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndMappingRuleset(VtlParser.EndMappingRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndMappingRuleset(VtlParser.EndMappingRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(VtlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(VtlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArgList(VtlParser.ProcedureArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArgList(VtlParser.ProcedureArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArg(VtlParser.ProcedureArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArg(VtlParser.ProcedureArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 */
	void enterSetExprListRestricted(VtlParser.SetExprListRestrictedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 */
	void exitSetExprListRestricted(VtlParser.SetExprListRestrictedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 */
	void enterDatasetList(VtlParser.DatasetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 */
	void exitDatasetList(VtlParser.DatasetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void enterDataset(VtlParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void exitDataset(VtlParser.DatasetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 */
	void enterDatasetAlias(VtlParser.DatasetAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 */
	void exitDatasetAlias(VtlParser.DatasetAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 */
	void enterSetMemberListAlias(VtlParser.SetMemberListAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 */
	void exitSetMemberListAlias(VtlParser.SetMemberListAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 */
	void enterSetMemberList(VtlParser.SetMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 */
	void exitSetMemberList(VtlParser.SetMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 */
	void enterSetMember(VtlParser.SetMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 */
	void exitSetMember(VtlParser.SetMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 */
	void enterSetMembers(VtlParser.SetMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 */
	void exitSetMembers(VtlParser.SetMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 */
	void enterStringC(VtlParser.StringCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 */
	void exitStringC(VtlParser.StringCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInputList(VtlParser.ProcedureInputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInputList(VtlParser.ProcedureInputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInput(VtlParser.ProcedureInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInput(VtlParser.ProcedureInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 */
	void enterIntegerC(VtlParser.IntegerCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 */
	void exitIntegerC(VtlParser.IntegerCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 */
	void enterNegIntegerC(VtlParser.NegIntegerCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 */
	void exitNegIntegerC(VtlParser.NegIntegerCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 */
	void enterFloatC(VtlParser.FloatCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 */
	void exitFloatC(VtlParser.FloatCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 */
	void enterNullC(VtlParser.NullCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 */
	void exitNullC(VtlParser.NullCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 */
	void enterBooleanC(VtlParser.BooleanCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 */
	void exitBooleanC(VtlParser.BooleanCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 */
	void enterNumberC(VtlParser.NumberCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 */
	void exitNumberC(VtlParser.NumberCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 */
	void enterVarIDList(VtlParser.VarIDListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 */
	void exitVarIDList(VtlParser.VarIDListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameArgList(VtlParser.JoinRenameArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameArgList(VtlParser.JoinRenameArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameArg(VtlParser.JoinRenameArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameArg(VtlParser.JoinRenameArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 */
	void enterRenameArgList(VtlParser.RenameArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 */
	void exitRenameArgList(VtlParser.RenameArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 */
	void enterRenameArg(VtlParser.RenameArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 */
	void exitRenameArg(VtlParser.RenameArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 */
	void enterRulesetArgList(VtlParser.RulesetArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 */
	void exitRulesetArgList(VtlParser.RulesetArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 */
	void enterRulesetArg(VtlParser.RulesetArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 */
	void exitRulesetArg(VtlParser.RulesetArgContext ctx);
}