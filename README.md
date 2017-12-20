# README #

### Overview ###

Parser for VTL expressions (see https://sdmx.org/?page_id=5096). The parser is based on the official VTL grammar (see https://github.com/vtl-sdmx-task-force/sdmx-vtl) including some adjustments (see comments in Vtl.g4 and VtlTokens.g4). It's written using ANTLR4 (see http://www.antlr.org/) and the Abstract syntax tree (AST) class, as well as the Abstract compiler class are written by Bart Kiers (see https://github.com/bkiers).
The compiler class allows for the extraction of tree structures (i.e. parse tree structure or transformation tree structure) from an input expression. 

Please note that this project is dependent on the project *transformations* (in the sense that including the project *transformations* in this projects build path is required).

### How do I get set up? ###

1. Clone the repository *transformations*
2. Clone this repository
3. Include the *transformations* project into the build path of this project
4. Type a VTL expression in the (String) variable *query* (that is set to "z := sqrt(x * x + y * y)" initially) in the class Playground
5. Run the main method in the class Playground
6. Results: on the console you will see the (i) tree structure of the abstract syntax tree, the (ii) tree structure compliant with the BIRD interpretation of the SDMX information model, (iii) the nodes stored in the persistence context and (iv) the VTL built expression based on (ii)

### Contact ###

For questions related to this repository please contact BIRD@ecb.europa.eu.