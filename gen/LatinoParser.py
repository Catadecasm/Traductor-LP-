# Generated from /Users/jude/Projects/ANTLR Traductor/ANTLR_Traductor/latino-python-translator/Latino.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,88,13,2,0,7,0,2,1,7,1,1,0,5,0,6,8,0,10,0,12,0,9,9,0,1,1,1,1,
        1,1,0,0,2,0,2,0,1,4,0,37,37,48,48,57,57,83,85,11,0,7,1,0,0,0,2,10,
        1,0,0,0,4,6,3,2,1,0,5,4,1,0,0,0,6,9,1,0,0,0,7,5,1,0,0,0,7,8,1,0,
        0,0,8,1,1,0,0,0,9,7,1,0,0,0,10,11,7,0,0,0,11,3,1,0,0,0,1,7
    ]

class LatinoParser ( Parser ):

    grammarFileName = "Latino.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'..'", "'++'", "'&&'", "'||'", "'+='", 
                     "'-='", "'=='", "'*='", "'/='", "'!='", "'<='", "'>='", 
                     "'~='", "'%='", "'--'", "'*'", "'.'", "','", "';'", 
                     "':'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'-'", 
                     "'+'", "'/'", "'^'", "'%'", "'='", "'!'", "'>'", "'<'", 
                     "'caso'", "'cierto'", "'verdadero'", "'continuar'", 
                     "'defecto'", "'otro'", "'desde'", "'elegir'", "'error'", 
                     "'escribir'", "'imprimir'", "'poner'", "'falso'", "'fin'", 
                     "'funcion'", "'fun'", "'global'", "'hasta'", "'imprimirf'", 
                     "'incluir'", "'mientras'", "'nulo'", "'osi'", "'repetir'", 
                     "'retorno'", "'retornar'", "'ret'", "'romper'", "'si'", 
                     "'sino'", "'tipo'", "'rango'", "'ir'", "'leer'", "'en'", 
                     "'para'", "'acadena'", "'alogico'", "'anumero'", "'limpiar'", 
                     "'lib'", "'archivo'", "'cadena'", "'dic'", "'lista'", 
                     "'mate'", "'sis'" ]

    symbolicNames = [ "<INVALID>", "TKN_CONCAT", "TKN_INCREMENT", "TKN_AND", 
                      "TKN_OR", "TKN_PLUS_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_EQUAL", 
                      "TKN_TIMES_ASSIGN", "TKN_DIV_ASSIGN", "TKN_NEQ", "TKN_LEQ", 
                      "TKN_GEQ", "TKN_REGEX", "TKN_MOD_ASSIGN", "TKN_DECREMENT", 
                      "TKN_TIMES", "TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", 
                      "TKN_COLON", "TKN_OPENING_KEY", "TKN_CLOSING_KEY", 
                      "TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", 
                      "TKN_CLOSING_PAR", "TKN_MINUS", "TKN_PLUS", "TKN_DIV", 
                      "TKN_POWER", "TKN_MOD", "TKN_ASSIGN", "TKN_NOT", "TKN_GREATER", 
                      "TKN_LESS", "CASO", "CIERTO", "VERDADERO", "CONTINUAR", 
                      "DEFECTO", "OTRO", "DESDE", "ELEGIR", "ERROR", "ESCRIBIR", 
                      "IMPRIMIR", "PONER", "FALSO", "FIN", "FUNCION", "FUN", 
                      "GLOBAL", "HASTA", "IMPRIMIRF", "INCLUIR", "MIENTRAS", 
                      "NULO", "OSI", "REPETIR", "RETORNO", "RETORNAR", "RET", 
                      "ROMPER", "SI", "SINO", "TIPO", "RANGO", "IR", "LEER", 
                      "EN", "PARA", "ACADENA", "ALOGICO", "ANUMERO", "LIMPIAR", 
                      "LIB", "ARCHIVO", "CADENA", "DIC", "LISTA", "MATE", 
                      "SIS", "STRING", "INTEGER", "REAL", "COMMENT", "ID", 
                      "WS" ]

    RULE_programa = 0
    RULE_literal = 1

    ruleNames =  [ "programa", "literal" ]

    EOF = Token.EOF
    TKN_CONCAT=1
    TKN_INCREMENT=2
    TKN_AND=3
    TKN_OR=4
    TKN_PLUS_ASSIGN=5
    TKN_MINUS_ASSIGN=6
    TKN_EQUAL=7
    TKN_TIMES_ASSIGN=8
    TKN_DIV_ASSIGN=9
    TKN_NEQ=10
    TKN_LEQ=11
    TKN_GEQ=12
    TKN_REGEX=13
    TKN_MOD_ASSIGN=14
    TKN_DECREMENT=15
    TKN_TIMES=16
    TKN_PERIOD=17
    TKN_COMMA=18
    TKN_SEMICOLON=19
    TKN_COLON=20
    TKN_OPENING_KEY=21
    TKN_CLOSING_KEY=22
    TKN_OPENING_BRA=23
    TKN_CLOSING_BRA=24
    TKN_OPENING_PAR=25
    TKN_CLOSING_PAR=26
    TKN_MINUS=27
    TKN_PLUS=28
    TKN_DIV=29
    TKN_POWER=30
    TKN_MOD=31
    TKN_ASSIGN=32
    TKN_NOT=33
    TKN_GREATER=34
    TKN_LESS=35
    CASO=36
    CIERTO=37
    VERDADERO=38
    CONTINUAR=39
    DEFECTO=40
    OTRO=41
    DESDE=42
    ELEGIR=43
    ERROR=44
    ESCRIBIR=45
    IMPRIMIR=46
    PONER=47
    FALSO=48
    FIN=49
    FUNCION=50
    FUN=51
    GLOBAL=52
    HASTA=53
    IMPRIMIRF=54
    INCLUIR=55
    MIENTRAS=56
    NULO=57
    OSI=58
    REPETIR=59
    RETORNO=60
    RETORNAR=61
    RET=62
    ROMPER=63
    SI=64
    SINO=65
    TIPO=66
    RANGO=67
    IR=68
    LEER=69
    EN=70
    PARA=71
    ACADENA=72
    ALOGICO=73
    ANUMERO=74
    LIMPIAR=75
    LIB=76
    ARCHIVO=77
    CADENA=78
    DIC=79
    LISTA=80
    MATE=81
    SIS=82
    STRING=83
    INTEGER=84
    REAL=85
    COMMENT=86
    ID=87
    WS=88

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def literal(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LatinoParser.LiteralContext)
            else:
                return self.getTypedRuleContext(LatinoParser.LiteralContext,i)


        def getRuleIndex(self):
            return LatinoParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = LatinoParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 37)) & ~0x3f) == 0 and ((1 << (_la - 37)) & 492581210294273) != 0):
                self.state = 4
                self.literal()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTEGER(self):
            return self.getToken(LatinoParser.INTEGER, 0)

        def REAL(self):
            return self.getToken(LatinoParser.REAL, 0)

        def STRING(self):
            return self.getToken(LatinoParser.STRING, 0)

        def CIERTO(self):
            return self.getToken(LatinoParser.CIERTO, 0)

        def FALSO(self):
            return self.getToken(LatinoParser.FALSO, 0)

        def NULO(self):
            return self.getToken(LatinoParser.NULO, 0)

        def getRuleIndex(self):
            return LatinoParser.RULE_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLiteral" ):
                listener.enterLiteral(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLiteral" ):
                listener.exitLiteral(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = LatinoParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10
            _la = self._input.LA(1)
            if not(((((_la - 37)) & ~0x3f) == 0 and ((1 << (_la - 37)) & 492581210294273) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





