# Generated from /Users/jude/Projects/ANTLR Traductor/ANTLR_Traductor/latino-python-translator/Latino.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .LatinoParser import LatinoParser
else:
    from LatinoParser import LatinoParser

# This class defines a complete generic visitor for a parse tree produced by LatinoParser.

class LatinoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LatinoParser#programa.
    def visitPrograma(self, ctx:LatinoParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LatinoParser#literal.
    def visitLiteral(self, ctx:LatinoParser.LiteralContext):
        return self.visitChildren(ctx)



del LatinoParser