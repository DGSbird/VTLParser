grammar Vtl;
import VtlTokens;

// rename start --> parse; adjustment of structure
start: 
  //(statement? EOL? NL?)* statement? EOF
  statements
  ;

// added statements
statements
 :
 comment? statement EOL? NL? (comment? statement EOL? NL?)*
 ;


/* Assignment */
statement: varID ASSIGN expr
// adjustment in order to parse function / data point definitions
| defFunction
| defDatapoint
| defProcedure
| procedureCall
;


/* procedure call */
procedureCall
:
//CALL procedureID '(' procedureInputList ')'
CALL procedureCallBody
;

procedureCallBody
:
procedureID '(' procedureInputList ')'
;

/* Conditional */
expr: exprOr															# exprOrExpr 
//| IF exprOr THEN exprOr (ELSEIF exprOr THEN exprOr)* (ELSE exprOr)*		# exprIfExpr
// adjust if-then-else structure in order to allow nested if-then-else structures, additionally decompose if-then-else structure in order to support content extraction
//| ifThenElseExpr														# exprIfExpr
//| validationExpr 														# exprValidationExpr
//| functionCall															#exprFunctionCall
//dirty workaround for concat
| expr CONCAT expr #exprConcatExpr
;
// add function call
functionCall
:
functionID '(' setMemberList? ')'
;


ifThenElseExpr
  :
  ifExpr (elseIfExpr)* elseExpr
  ;

ifExpr
  :
  comment? IF expr THEN expr
  ;

elseIfExpr
  :
  comment? ELSEIF expr THEN expr
  ;

elseExpr
  :
  comment? ELSE expr
  ;


/* Logical OR */
exprOr: exprAnd ( op=(OR|XOR) exprAnd )*;

/* Logical AND */
exprAnd: exprEq ( AND exprEq)*;

/* Equality, inequality */
// adjustment in order to tread <, >, <=, >= similar to = and <>
exprEq: exprExists (op=('='|'<>'|'>'|'<'|'<='|'>=') exprExists )*
// added another representation
|exprExists ((NOT_IN | IN)  '(' setMemberList ')')
;

/* Matching */
exprExists: exprComp (op=(EXISTS_IN | EXISTS_IN_ALL | NOT_EXISTS_IN | NOT_EXISTS_IN_ALL) exprComp)*
;

/* Comparison, range */

exprComp: 
		// adjustment in order to make grammar work!
		//exprAdd exprCompExt*
		exprAdd
		;
		
exprCompExt: 
		//(NOT)? IN setExpr #exprCompSet
		//| 
		//opComp=('>'|'<'|'<='|'>=') exprAdd #exprCompComp
		//| 
		(NOT)? BETWEEN exprAdd AND exprAdd #exprCompBetween
		// added correction of in / not in 
		| (IN | NOT_IN) '(' setMemberList ')'	#exprCompIn
		;	

/* Addition, subtraction */
exprAdd: exprMultiply (opAdd=('++'|'--'|'+'|'-') exprMultiply)*;

/* Multiplication, division */
exprMultiply: exprFactor (opMult=('**'|'//'|'*'|'/') exprFactor)*;

/* Unary plus, unary minus, not */
exprFactor: 
// adjustment in order to support extraction of information of the parse tree (i.e. mathematical structure for *, /, +, -)
	//(opUnary=('+'|'-'|NOT)? exprMember)*
	opUnary=('+'|'-'|NOT)? exprMember
	| '(' opUnary=('+'|'-'|NOT)? exprMember ')'
	// workaround for (-1)
	| '(-1)'
	;

/* Membership and clauses */
exprMember : exprAtom ('[' datasetClause ']')*(MEMBERSHIP componentID)?
			|exprAtom ('[' datasetClause ']')*(MEMBERSHIP_ALT componentID)?
			// adjustment to official vtl
			|exprAtom ('[' datasetClause (',' datasetClause)* ']')*(MEMBERSHIP componentID)?
			|exprAtom ('[' datasetClause (',' datasetClause)* ']')*(MEMBERSHIP_ALT componentID)? (GROUP_BY setMemberList)?
			;

/* Rulesets Definition */

defMapping
  :
  defineMapping rulesetID '(' conditionClause? mapTo mapFrom ')' IS ruleClauseMapping endMappingRuleset
  ;

conditionClause
  :
  CONDITION '(' IDENTIFIER IDENTIFIER (',' IDENTIFIER IDENTIFIER)* ')'
  ;

mapTo
  :
  MAP_TO '(' IDENTIFIER IDENTIFIER ')'
  ;

mapFrom
  :
  MAP_FROM '(' IDENTIFIER IDENTIFIER ')'
  ;

ruleClauseMapping
  :
  (ruleItemMapping ';')+
  ;

ruleItemMapping
  :
  (IDENTIFIER ':')? ( WHEN expr THEN )? IDENTIFIER STRING_CONSTANT '=' IDENTIFIER STRING_CONSTANT
  ;

defHierarchical
  :
  defineHierarchicalRuleset rulesetID '(' hierRuleSignature ')' IS ruleClauseHierarchical endHierarchicalRuleset
  ;

ruleClauseHierarchical
  :
  ruleItemHierarchical (';' ruleItemHierarchical)*
  ;

ruleItemHierarchical
  :
  (IDENTIFIER ':')? ( WHEN expr THEN )? codeItemRelation (erCode)? (erLevel)?
  ;

hierRuleSignature
  :
  (antecedentItem)? codeItemRelationSignature
  ;

antecedentItem
  :
  ANTECEDENTVARIABLES rulesetSignature
  ;

codeItemRelationSignature
  :
  VARIABLE varID
  | VALUEDOMAIN valueDomainID
  ;

codeItemRelation
  :
  codeItemRef opComp=('='|'>'|'<'|'>='|'<=') codeItemRelationClause (codeItemRelationClause)*
  ;

codeItemRelationClause
  :
  (opAdd=('+'|'-'))? codeItemRef
  ;

codeItemRef
  :
  IDENTIFIER (FROM TIME)? (TO TIME)?
  ;

defDatapoint
  :
  defineDatapointRuleset rulesetID '(' rulesetSignature ')' IS ruleClauseDatapoint endDatapointRuleset
  // add alternative rule set definition structre
  | defineDatapointRuleset rulesetID '(' rulesetArgList ')' rulesetBody
  ;

// add ruleset body
rulesetBody
  :
  '{' setruleList '}'
  ;
// added list of set rules
setruleList
  :
  setrule (setrule)*
  ;

// added setrule
setrule
  :
  comment? ruleID (':')? WHEN expr THEN expr erCode? NL
  ;


// added rule identifier
ruleID
  :
  IDENTIFIER
  ;


ruleClauseDatapoint
  :
  ruleItemDatapoint (';' ruleItemDatapoint)*
  ;

ruleItemDatapoint
  :
  (IDENTIFIER ':')? ( WHEN expr THEN )? expr (erCode)? (erLevel)?
  ;
  
rulesetSignature
  :
  varSignature (',' varSignature)*
  ;

varSignature
  :
  // adjustment in order to support extraction of information from the parse tree
  //varID (AS STRING_CONSTANT)?
  varID (AS stringC)?
  ;  

/* Artefacts Definition */
defDataset
  :
  DEFINE_DATASET persistentDatasetID '(' (STRING_CONSTANT)? (IS_COLLECTED)? IDENTIFIER | dataStructureClause ')'
  ; 

defDataStructure
  :
  DEFINE_DATA_STRUCTURE IDENTIFIER '(' ( STRING_CONSTANT )? dataStructureClause
  ;

dataStructureClause
  :
  (dimensionType | valueDomainID dataStructureItem ';')+ ')'
  ; 
  									 
dataStructureItem
  :
  '(' IDENTIFIER roleID ')'
  ;

defVariable
  :
  DEFINE_VARIABLE varID
  ;

defValueDomainSubset
  :
  DEFINE_VALUE_DOMAIN_SUBSET valueDomainID '(' (STRING_CONSTANT ',' BOOLEAN_CONSTANT)?
  valueDomainID dimensionTypeClause ')'
  ;

defValueDomain
  :
  DEFINE_VALUE_DOMAIN valueDomainID '(' (STRING_CONSTANT ',' BOOLEAN_CONSTANT)? dimensionTypeClause ')'
  ;  
  
defFunction
  :
  CREATE_FUNCTION functionID '(' argList ')' RETURNS dimensionType AS expr
  // utility of brackets to cover the body of a function
  | CREATE_FUNCTION functionID '(' argList ')' '{' RETURNS dimensionType AS expr '}'
  // adjustment to official grammar in order to handle "as" nodes in a harmonized way (e.g. RETURNS dimensionType AS expr vs. RENAME expr AS IDENTIFIER)
  | CREATE_FUNCTION functionID '(' argList ')' '{' RETURNS expr AS dimensionType'}'
  ;  

// added procedure definition
defProcedure
  :
  DEFINE_PROCEDURE procedureID '(' procedureArgList ')' procedureBody
  ;

procedureBody
  :
  '{' statements '}'
  ;


dimensionTypeClause
  :
  dimensionType (codeListClause | dataTypeRestrictionClause)
  ;
  
codeListClause
  :
  LIST '(' (RECORD '(' '{' '@' IDENTIFIER AS IDENTIFIER ';' 
  ('#' constant AS constant ';')? '}' ')' )* ')'
  ;

dataTypeRestrictionClause
  :
  RESTRICT restrictClause
  ;

restrictClause
  :
  dateClause
  | stringClause
  | numberClause
  ;
  
numberClause
  :
//  BETWEEN INTEGER_CONSTANT AND INTEGER_CONSTANT
//  | COMPARISON_OP INTEGER_CONSTANT
  BETWEEN integerC AND integerC
  | COMPARISON_OP integerC
  ;

stringClause
  : 
//  MAX_LENGTH INTEGER_CONSTANT
//  | REGEXP STRING_CONSTANT
  MAX_LENGTH integerC
  | REGEXP integerC
  ;
  
dateClause
  :
  YYYY
  | MM
  | DD
  | YYYY '-' MM
  | COMPARISON_OP YYYY '-' MM '-' DD
  ;

/* Functions */
exprAtom
  :
  //ROUND '(' expr ',' INTEGER_CONSTANT ')'							# roundAtom
    ROUND '(' expr ',' integerC')'							# roundAtom
  | CEIL '(' expr ')'												# ceilAtom
  | FLOOR '(' expr ')'												# floorAtom
  | MIN '(' expr ')'												# minAtom
  | MAX '(' expr ')'												# maxAtom
  | ABS '(' expr ')'												# minAtom
  | EXP '(' expr ')'												# expAtom
  | LN '(' expr ')'													# lnAtom
  | LOG '(' expr ',' logBase ')'									# logAtom
//  | TRUNC '(' expr ',' INTEGER_CONSTANT ')'							# lnAtom
  | TRUNC '(' expr ',' integerC')'							# lnAtom
  | POWER '(' expr ',' exponent ')'									# powerAtom
  | SQRT '(' expr ')'												# sqrtAtom
//  | NROOT '(' expr ',' INTEGER_CONSTANT ')'							# nrootAtom
  | NROOT '(' expr ',' integerC ')'							# nrootAtom
  | LEN '(' expr ')'												# lenAtom
  | TRIM '(' expr ')'												# trimAtom
  | LTRIM '(' expr ')'												# ltrimAtom
  | RTRIM '(' expr ')'												# rtrimAtom
  | UCASE '(' expr ')'												# ucaseAtom
  | LCASE '(' expr ')'												# lcaseAtom
  //| SUBSTR '(' expr ',' expr (',' expr)? ')'						# substrAtom
  //adjustment of substr expr atom for easier information extraction
  | SUBSTR '(' strExprParam ')'						# substrAtom
  | INSTR '(' expr ',' expr ( ',' expr)? (',' expr)? ')'			# instrAtom
  | DATE_FROM_STRING '(' expr ',' DATE_FORMAT ')'					# date_from_stringAtom
  | STRING_FROM_DATE '(' DATE_FORMAT ',' expr ')'					# string_from_dateAtom
//  | REPLACE '(' expr ',' expr ( ',' expr)? ')'						# replaceAtom
  //adjustment of replace expr atom for easier information extraction
  | REPLACE '(' strExprParam ')'						# replaceAtom
  | INDEXOF '(' expr ',' STRING_CONSTANT ')'						# indexofAtom
  | MISSING '(' expr ')'											# missingAtom
  | CHARSET_MATCH '(' expr ',' IDENTIFIER ',' STRING_CONSTANT (',' ALL)? ')'	# charsetMatchAtom
  | CODELIST_MATCH '(' expr ',' setExpr (',' ALL)? ')'				# codelistMatchAtom
  | CHARLENGTH '(' expr ')'											# charLengthAtom
  | TYPE '(' expr ')' '=' STRING_CONSTANT							# typeAtom
  | INTERSECT '(' datasetList ')'									# intersectAtom
  // adjustment of union exceeding the number of input datasets
//  | UNION '(' expr ',' expr ')'										# unionAtom
  | UNION '(' datasetList')'										# unionAtom
  | DIFF '(' expr ',' expr ')'										# diffAtom
  // adjustment of not in
  //| NOT_IN '(' expr ',' expr ')'									# notInAtom
  | NOT_IN '(' expr ')'									# notInAtom
  // added in
  | IN '(' expr ')'									# inAtom
  | ISNULL '(' expr ')'												# isNullAtom
  | NVL '(' expr ',' constant ')'									# nvlAtom
  | MOD '(' expr ',' expr ')'										# modAtom
  | LISTSUM '(' expr (',' expr)? ')'								# listsumAtom
  | ALL '(' expr ')'												# allAtom
  | ANY '(' expr ')'												# anyAtom
  | UNIQUE '(' expr ')'												# uniqueAtom
  | FUNC_DEP '(' expr ',' expr ',' expr ')'							# func_depAtom
  | EXTRACT '(' expr ',' STRING_CONSTANT ')'						# extractAtom
  | CURRENT_DATE '(' ')'										    # currentDateAtom
  | getExpr															# getExprAtom
  | ref																# refAtom
  | putExpr															# putExprAtom
  | evalExpr														# evalExprAtom
//  | mergeExpr														# mergeExprAtom
  | hierarchyExpr													# hierarchyExprAtom
  // added transcodeExpr
  | transcodeExpr													#transcodeExprAtom
  | FLOW_TO_STOCK '(' expr ')'										# flowToStockAtom
  | STOCK_TO_FLOW '(' expr ')'										# stockToFlowAtom
  // added join expression
  | joinExpr														#joinAtom
  // added set expression
  | setExpr															#setExprAtom
  // added expression
  | '('expr')'														#exprExprAtom  
  // added count expression
  | COUNT '(' expr')'													#exprCountAtom
  //added methods
  | ifThenElseExpr														# exprIfExpr
| validationExpr 														# exprValidationExpr
| functionCall															#exprFunctionCall
  | SUM '('  expr ')' 															#sumExprAtom
  
  ;


// added string expression parameters for easier extraction of information
strExprParam
:
  expr ',' expr (',' expr)?
;

/* alterDataset */
alterExpr
  :
  ALTER_DATASET '(' expr (componentList)? (ALL)? ')'
  ;

/* Parentheses */
ref: '(' exprOr ')'													# parenthesisExprRef
  | varID															# varIdRef
  | constant														# constantRef
  | list															# listRef
  ; 

/* list, component list, dedupList, argList, valueDomainList */
list:
	'[' (constant (',' constant)*)? ']'; 	

listofCompList
  :
  componentList (',' componentList)*
  ;

componentList
  :
  ','? constant (',' constant)*
  ;						
  
dedupList
  :
  constant '*' constant (',' constant '*' constant)*
  ;  

argList
  : arg (',' arg)* 
  ;

arg
  :
  IDENTIFIER (AS dimensionType)? (ASSIGN constant)?
  ;
  
valueDomainList
  :
  dimensionType (',' dimensionType)*
  ;

/* get */
getExpr
  : 
  GET '(' persistentDatasetID (',' persistentDatasetID)* (',' keepClause)? (',' dedupClause)? (',' filterClause)? (',' aggregategetClause)? ')'
  ;

/* put */
putExpr
  : 
  PUT '(' putInputParameters ')'
  ;

putInputParameters
:
expr ',' persistentDatasetID
;


/* eval */
evalExpr
  : 
  EVAL '(' STRING_CONSTANT (',' ref)* ',' persistentDatasetID ')'
  ;

/* concatenation */
concatExpr
  :
  expr CONCAT expr
  ;

/* timeshift */
timeShiftExpr
  :
  TIMESHIFT '(' expr ',' componentID ',' TIME_UNIT ',' INTEGER_CONSTANT ')'
  ;

/* fill time series */
timeSeriesExpr
  :
  FILL_TIME_SERIES '(' expr ',' FREQUENCY (',' STRING_CONSTANT)? (',' TIME_FORMAT)? ')'
  ;

/* check */
validationExpr
  : 
  CHECK '(' exprOr (',' THRESHOLD '(' constant ')')? (',' NOT_VALID|VALID|ALL)? (',' MEASURES | CONDITION )? (',' IMBALANCE '(' exprOr ')')? (',' erCode)? (',' erLevel )? ')'
  // added in order to process syntax like "result := check(ds, rulesetID)"
  |CHECK '(' validationExprContent ')'
  ;

validationExprContent
: exprOr ',' rulesetID (',' NOT_VALID|VALID|ALL)? (',' MEASURES | CONDITION )? (',' IMBALANCE '(' exprOr ')')? (',' erCode)? (',' erLevel )?
;
validationDatapoint
  :
  CHECK '(' persistentDatasetID ',' rulesetID (',' NOT_VALID|VALID|ALL)? (',' CONDITION|MEASURES)? ')'
  ;
  
validationHierarchical
  :
  CHECK '(' persistentDatasetID ',' rulesetID (',' THRESHOLD '(' INTEGER_CONSTANT ')' )? 
  (',' NOT_VALID|VALID|ALL)? (',' MEASURES|CONDITION)? ')'
  ;
  
validationValueDoman
  :
  CHECK_VALUE_DOMAIN_SUBSET '(' expr ',' componentList | (listofCompList '(' (componentList)+')' ',' valueDomainList)? ',' IDENTIFIER ')'
  ;

erCode
  :
//  ERRORCODE '(' STRING_CONSTANT ')'
  // adjustment to support extraction of information from the parse tree
  ERRORCODE '(' stringC ')'
  ;
  
erLevel
  :
  ERRORLEVEL '(' constant ')'
  ;

// excluded merge from grammar due to the fact that in version 1.1 merge is not present
/* merge */
//mergeExpr : MERGE '(' expr AS? STRING_CONSTANT (',' expr AS? STRING_CONSTANT)+ ',' ON '(' expr ')' ',' RETURN '(' (expr AS? STRING_CONSTANT) (',' expr AS? STRING_CONSTANT)+ ')' ')' ;

/* hierarchy */
hierarchyExpr
  : 
  // adjustment in order to support information extraction from the parse tree
  //HIERARCHY '(' expr ',' IDENTIFIER ',' ( STRING_CONSTANT | (mappingExpr (',' mappingExpr)* AS STRING_CONSTANT)) ',' BOOLEAN_CONSTANT (',' aggrParam)? ')'
  //HIERARCHY '(' expr ',' IDENTIFIER ',' ( STRING_CONSTANT | (mappingExpr (',' mappingExpr)* AS stringC)) ',' BOOLEAN_CONSTANT (',' aggrParam)? ')'
  HIERARCHY '(' hierarchyInputParameters ')'
  ;

hierarchyInputParameters
  :
  expr ',' componentID ','( stringC | (mappingExpr (',' mappingExpr)* AS stringC)) ',' booleanC (',' aggrParam)?
  ;

/* transcode */
transcodeExpr
  :
  TRANSCODE '(' transcodeInputParameters ')'
  ;

transcodeInputParameters
  :
  expr ',' mappingID
  ;
  


mappingExpr
  :
//  '(' constant ',' INTEGER_CONSTANT ',' ('+' | '-')')' TO constant
  '(' constant ',' integerC ',' ('+' | '-')')' TO constant
  ;

aggrParam
  :
  'sum'
  | 'prod'
  ;

/* Clauses. */
datasetClause
  :
  renameClause
  | aggrClause
  | filterClause
  | calcClause
  | attrCalcClause
  | keepClause
  | dropClause
  | compareClause
  ;

anFunctionClause
  :
  anFunction OVER '(' (partitionByClause)? (orderByClause)? (windowingClause)? ')'
  ;  

partitionByClause
  :
  PARTITION BY IDENTIFIER (',' IDENTIFIER)+
  ;
  
orderByClause
  :
  ORDER BY componentID (',' componentID)+ (ASC|DESC)?
  ;
  
windowingClause
  :
  ROWS|RANGE betweenRowsClauseItem AND betweenRowsClauseItem
  ;
  
betweenRowsClauseItem
  :
//  INTEGER_CONSTANT PRECEDING
//  | INTEGER_CONSTANT FOLLOWING
  integerC PRECEDING
  | integerC FOLLOWING
  | CURRENT_ROW
  | UNBOUNDED_PRECEDING 
  | UNBOUNDED_FOLLOWING
  ;   

/* Join Expressions*/

joinExpr
  :
  //('[' joinClause ']')? joinBody?
  ('[' joinClause ']') joinBody?
  ;

joinClause
  :
  // adjustment to official grammar in order to omit possible empty element
  //(INNER|OUTER|CROSS)? (expr (',' expr)*)? ON IDENTIFIER (',' IDENTIFIER)*?
  //(INNER|OUTER|CROSS|LEFT|RIGHT)? (dataset (',' dataset)*) ON IDENTIFIER (',' IDENTIFIER)*?
  //| 
  (INNER|OUTER|CROSS|LEFT|RIGHT)? (datasetAlias (',' datasetAlias)*) ON (expr | (IDENTIFIER (',' IDENTIFIER)*))
  ;

joinBody
  :
  '{' clause (',' clause)* '}'
  ;

clause
  :
  joinCalcClause
  | joinDropClause
  | joinKeepClause
  | joinFilterClause
  | joinRenameClause
  | joinUnfoldClause
  | joinFoldClause
  ;

joinCalcClause
  :
  roleID? componentID '=' expr
  ;

joinDropClause
  :
  DROP (dropClauseItem (',' dropClauseItem)*)?
  // added additional representation of drop (harmonisation)
 | DROP '(' setMemberList ')'
  ;

joinKeepClause
  :
  KEEP (keepClauseItem (',' keepClauseItem)*)?
  // added additional representations of keep (harmonisation)
  | KEEP '(' setMemberList ')'
  | KEEP '(' setMemberListAlias ')'
  ;

joinFilterClause
  :
  FILTER expr|rulesetID
  // added additional representation of keep (harmonisation)
  | FILTER '(' expr ')'
  ;

joinRenameClause
  :
  RENAME componentID TO componentID (',' componentID TO componentID)?
  // adjusted join rename clause in order to reflect vtl documenation
  | RENAME componentID AS componentID (',' componentID AS componentID)?
  // added additional representation of rename (harmonisation)
  //| RENAME '(' setMember AS stringC (',' setMember AS stringC)* ')'
  | RENAME '(' joinRenameArgList ')'  
  ;

joinUnfoldClause
  :
  UNFOLD componentID ',' IDENTIFIER TO IDENTIFIER (',' IDENTIFIER)?
  ;

joinFoldClause
  :
  FOLD IDENTIFIER (',' IDENTIFIER)? TO IDENTIFIER ',' IDENTIFIER
  ;

/* Analytic Functions*/
anFunction
  :
  FIRST_VALUE '(' expr ')'
  | LAG_LEAD '(' expr ',' INTEGER_CONSTANT ',' INTEGER_CONSTANT ')'
  | LAST_VALUE '(' expr ')'
  | NTILE '(' expr ')'
  | PERCENT_RANK '(' expr ')'
  | RANK '(' expr ')'
  | RATIO_TO_REPORT '(' expr ')'
  ;

aggregategetClause
  :
  AGGREGATE '(' aggrFunction '(' expr ')' (',' aggrFunction '(' expr ')')* ')'
  ;

aggregateClause
  :
  aggrFunctionClause (',' aggrFunctionClause)*
  ;

aggrFunctionClause
  :
  aggrFunction ( GROUP_BY|ALONG '(' IDENTIFIER (',' IDENTIFIER)+ ')' )?
  // added representation in order to be able to process syntax like "result := dataset[aggregate sum(x) group by identifier]"
  |aggrFunction ( GROUP_BY varIDList )?
  ;

dedupClause
  :
  DEDUP '(' dedupList? ')'
  ;

getFiltersClause
  :
    getFilterClause (',' getFilterClause)*
 ;

getFilterClause
  :
    (FILTER? expr)
  ;

aggrClause : AGGREGATE aggregateClause;

filterClause
  :
  FILTER expr 
  ;

renameClause
  :
  //RENAME varID AS STRING_CONSTANT (ROLE roleID)? (',' varID AS STRING_CONSTANT (ROLE roleID)?)*
  //RENAME varID AS stringC (ROLE roleID)? (',' varID AS stringC (ROLE roleID)?)*
  RENAME renameArgList
  | RENAME '(' renameArgList ')' 
  ;

aggrFunction
  :
  SUM '(' (INCLUDE_NULLS)? expr ')'
  | AVG '(' (INCLUDE_NULLS)? expr ')'
  | CORR '(' (INCLUDE_NULLS)? expr expr ')'
  | COVAR_POP '(' (INCLUDE_NULLS)? expr expr ')'
  | COVAR_SAMP '(' (INCLUDE_NULLS)? expr expr ')'
  | COUNT '(' (INCLUDE_NULLS)? expr ')'
  | MEDIAN '(' (INCLUDE_NULLS)? expr ')'
  | MIN '(' (INCLUDE_NULLS)? expr ')'
  | MAX '(' (INCLUDE_NULLS)? expr ')'
  | PERCENTILE_CONT '(' (INCLUDE_NULLS)? expr constant ')' ORDER BY expr (ASC|DESC)?
  | PERCENTILE_DISC '(' (INCLUDE_NULLS)? expr constant ')' ORDER BY expr (ASC|DESC)?
  | RANK '(' (INCLUDE_NULLS)? expr ')'
  | REGR_SLOPE '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_INTERCEPT '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_COUNT '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_R2 '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_AVGX '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_AVGY '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_SXX '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_SYY '(' (INCLUDE_NULLS)? expr expr ')'
  | REGR_SXY '(' (INCLUDE_NULLS)? expr expr ')'
  | STDDEV_POP '(' (INCLUDE_NULLS)? expr ')'
  | STDDEV '(' (INCLUDE_NULLS)? expr ')'
  | VAR_POP '(' (INCLUDE_NULLS)? expr ')'
  | VAR_SAMP '(' (INCLUDE_NULLS)? expr ')'
  | VARIANCE '(' (INCLUDE_NULLS)? expr ')'
  ;

calcClause
  :
  CALC calcClauseItem (',' calcClauseItem)*
  // added in-bracket representation
  | CALC '(' calcClauseItem (',' calcClauseItem)* ')'
  ;

attrCalcClause
  :
  // adjustment in order to support extraction of information from the parse tree
  //ATTRCALC expr AS STRING_CONSTANT (VIRAL)? (',' expr	 AS STRING_CONSTANT (VIRAL)?)*
  ATTRCALC expr AS stringC (VIRAL)? (',' expr AS stringC (VIRAL)?)*
  ;

calcClauseItem
  :
  // adjustment in order to support extraction of information from the parse tree
  //calcExpr AS STRING_CONSTANT (ROLE roleID (VIRAL)?)?
  calcExpr AS stringC (ROLE roleID (VIRAL)?)?
  ;

calcExpr
  :
  aggrFunction '(' expr ')'
  | expr
  ;

dropClause
  :
  DROP '(' dropClauseItem (',' dropClauseItem)* ')'
  ;

dropClauseItem
  :
  varID
  ;

keepClause
  :
  KEEP '(' keepClauseItem (',' keepClauseItem)* ')'
    // added additional representations of keep
  | KEEP '(' setMemberList ')'
  | KEEP '(' setMemberListAlias ')'
  
  ;

keepClauseItem
  :
  // corrected varID --> setMemberAlias
  //varID
  setMember AS stringC
  ;

compareClause
  :
  COMPARISON_OP constant
  ;

inBetweenClause
  :
  IN setExpr
  | BETWEEN constant AND constant
  | NOT IN setExpr
  | NOT BETWEEN constant AND constant
  ;

dimClause
  :
  | compareClause
  | inBetweenClause
  ;

/* Set expressions */
setExpr
  :
  '(' constant (','constant)* ')'
  | UNION '(' setExpr (',' setExpr)+ (',' DEDUP '(' expr ')' )? ')'		
//  | SYMDIFF '(' setExpr ',' setExpr ')'
//  | SETDIFF '(' setExpr ',' setExpr ')'
//  | INTERSECT '(' setExpr ',' setExpr (',' DEDUP '(' expr ')' )? ')'
  | SYMDIFF '(' setExprListRestricted ')'
  | SETDIFF '(' setExprListRestricted ')'
  | INTERSECT '(' setExprListRestricted (',' DEDUP '(' expr ')' )? ')'
  | TRANSCODE '(' componentID ',' expr ',' mapItemClause|rulesetID ')'
  | AGGREGATE '(' expr ',' rulesetID (',' TOTAL|PARTIAL)? (',' returnAgg|returnAll)? ')'
  // added set expressions where the operand is not a setExpr due to the fact that otherwise this content does not make sense
  | UNION '(' expr (',' expr)+ (',' DEDUP '(' expr ')' )? ')'		
  | SYMDIFF '(' expr ',' expr ')'
  | SETDIFF '(' expr ',' expr ')'
  | INTERSECT '(' expr ',' expr(',' DEDUP '(' expr ')' )? ')'
  | AGGREGATE '(' expr ',' rulesetID (',' TOTAL|PARTIAL)? (',' returnAgg|returnAll)? ')'
  
  ;

/* subscript expression*/
subscriptExpr
  :
  persistentDatasetID '[' componentID '=' constant ( ',' componentID '=' constant)? ']' 
  ;

mapItemClause
  :
  persistentDatasetID (IDENTIFIER MAPS_FROM dimensionType)? (IDENTIFIER MAPS_TO dimensionType)?
  ;

/* aggregate sequences */
returnAgg
  :
  RETURN AGGREGATES
  ;
  
returnAll
  :
  RETURN ALL DATA POINTS
  ;

/* Role name*/
roleID
  :
  MEASURE
  |DIMENSION
  |ATTRIBUTE
  ;

/* Dimension Type */
dimensionType
  :
  DATE
  | STRING
  | NUMBER
  | INTEGER
  | DATASET
  ;

/* Arithmetic */
logBase
  :
//  INTEGER_CONSTANT
integerC
  ;

exponent
  :
//  INTEGER_CONSTANT|FLOAT_CONSTANT
integerC | floatC
  ;

/* Variable, identifiers, constants */
persistentDatasetID
  : 
  STRING_CONSTANT
  ;

 rulesetID
  :
  IDENTIFIER
  ;

valueDomainID
  :
  IDENTIFIER
  ;

varID
  :
  IDENTIFIER
  ;
  
componentID
  :
  IDENTIFIER
  ;
  
 functionID
  :
  IDENTIFIER
  ;


// added procedure identifier
 procedureID
  :
  IDENTIFIER
  ;


 mappingID
  :
  IDENTIFIER
  ;

constant
  :
  // refactored using parser rules
  integerC 
  | floatC
  | booleanC
  | stringC
  | nullC
  | numberC 
  //INTEGER_CONSTANT
  //| FLOAT_CONSTANT
  //| BOOLEAN_CONSTANT
  //| STRING_CONSTANT
  //| NULL_CONSTANT
  ;
  
 defineDatapointRuleset
  :
  DEFINE DATAPOINT RULESET
  ;
  
 defineHierarchicalRuleset
   :
   DEFINE HIERARCHICAL RULESET
   ;
   
 defineMapping
   :
   DEFINE MAPPING
   ;
   
 endDatapointRuleset
   :
   END DATAPOINT RULESET
   ;
   
 endHierarchicalRuleset
   :
   END HIERARCHICAL RULESET
   ;
   
 endMappingRuleset
   :
   END MAPPING RULESET
   ;
   
 // added comment parser rule
 comment 
  :
  ML_COMMENT
  ;
  
 //added procedure input 
 procedureArgList
  :
  procedureArg (',' procedureArg)*
  ;
 
 procedureArg
  :
  (INPUT | OUTPUT) IDENTIFIER (AS dimensionType)
  ;
  
  setExprListRestricted
  :
  setExpr ',' setExpr
  ;  

  // added list of datasets
  datasetList
  :
  dataset (',' dataset)*
  ;
  
  // added dataset
  dataset
  :
  expr
  ;
  
  // added dataset alias
  datasetAlias
  :
  dataset (AS stringC)?
  ;
    
  // added set member list including alias
  setMemberListAlias
  :
  ( setMember (AS stringC)? (ROLE roleID)? ) (',' setMember (AS stringC)? (ROLE roleID)? )*  
  ;
    
    
  // added set member list
  setMemberList
  :
  ( setMember | setMembers )(',' ( setMember | setMembers ))*
  ;
  
  // added set member
  setMember
  :
  exprMember
  ;
  
  // added set members
  setMembers
  :
  dataset MEMBERSHIP_ALT '*'
  ;
  
  // added stringC in order to support information extraction from the parse tree
  stringC
  :
  STRING_CONSTANT
  ;
  
  // added procedure input list
  procedureInputList
  :
  procedureInput (',' procedureInput)*
  ;
  
  // added procedure input parameters
  procedureInput
  :
  IDENTIFIER
  | stringC
  ;
  
  // added integerC in order to support extraction of information from the parse tree
  integerC
  :
  INTEGER_CONSTANT
  ;
  
  negIntegerC
  :
  '-' INTEGER_CONSTANT
  ;
  
  floatC
  :
  FLOAT_CONSTANT
  ;
  
  nullC
  :
  NULL_CONSTANT
  ;
  
  booleanC
  :
  BOOLEAN_CONSTANT
  ;
  
  numberC
  :
  NUMBER_CONSTANT
  ;
  
  varIDList
  :
  varID (',' varID)*
  ;
  
  joinRenameArgList
  :
  joinRenameArg (',' joinRenameArg)*
  ;
  
  joinRenameArg
  :
  setMember (AS stringC)?
  ;
  
  renameArgList
  :
  renameArg (',' renameArg)* 
  ;
  
  renameArg
  :
  rulesetArg (ROLE roleID)?
  ;
  
  rulesetArgList
  :
  rulesetArg (',' rulesetArg)*
  ;
  
  rulesetArg
  :
  varID (AS stringC)?
  ;
  