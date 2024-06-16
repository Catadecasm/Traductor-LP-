import sys
from antlr4 import *
from antlr.LatinoLexer import LatinoLexer
from antlr.LatinoParser import LatinoParser
from antlr.LatinoParserVisitor import LatinoParserVisitor

class LatinoToPythonTranslator(LatinoParserVisitor):
  def __init__(self):
    self.output = []
    self.indent_level = 0

  def visitPrograma(self, ctx:LatinoParser.ProgramaContext):
    for child in ctx.literal():
      self.visit(child)
    return None

  def visitDeclaracion(self, ctx:LatinoParser.DeclaracionContext):
    var_name = ctx.ID().getText()
    value = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}{var_name} = {value}")
    return None

  def visitAsignacion(self, ctx:LatinoParser.AsignacionContext):
    var_name = ctx.ID().getText()
    value = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}{var_name} = {value}")
    return None

  def visitImpresion(self, ctx:LatinoParser.ImpresionContext):
    value = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}print({value})")
    return None

  def visitCondicional(self, ctx:LatinoParser.CondicionalContext):
    condition = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}if {condition}:")
    self.indent_level += 1
    self.visit(ctx.programa(0))

    if ctx.SINO():
      self.indent_level -= 1
      self.output.append(f"{self.get_indent()}else:")
      self.indent_level += 1
      self.visit(ctx.programa(1))
    self.indent_level -= 1
    return None

  def visitBucle(self, ctx:LatinoParser.BucleContext):
    condition = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}while {condition}:")
    self.indent_level += 1
    self.visit(ctx.programa())
    self.indent_level -= 1
    return None

  def visitFuncion(self, ctx:LatinoParser.FuncionContext):
    func_name = ctx.ID().getText()
    params = ", ".join(param.getText() for param in ctx.parametros().ID()) if ctx.parametros() else ""
    self.output.append(f"{self.get_indent()}def {func_name}({params}):")
    self.indent_level += 1
    self.visit(ctx.programa())
    self.indent_level -= 1
    return None

  def visitRetorno(self, ctx:LatinoParser.RetornoContext):
    value = self.visit(ctx.expresion())
    self.output.append(f"{self.get_indent()}return {value}")
    return None

  def visitExpresion(self, ctx:LatinoParser.ExpresionContext):
    left = self.visit(ctx.termino(0))
    if len(ctx.termino()) > 1:
      operator = ctx.children[1].getText()
      right = self.visit(ctx.termino(1))
      return f"{left} {operator} {right}"
    return left

  def visitTermino(self, ctx:LatinoParser.TerminoContext):
    left = self.visit(ctx.factor(0))
    if len(ctx.factor()) > 1:
      operator = ctx.children[1].getText()
      right = self.visit(ctx.factor(1))
      return f"{left} {operator} {right}"
    return left

  def visitFactor(self, ctx:LatinoParser.FactorContext):
    if ctx.INTEGER():
      return ctx.INTEGER().getText()
    elif ctx.REAL():
      return ctx.REAL().getText()
    elif ctx.STRING():
      return ctx.STRING().getText()
    elif ctx.ID():
      return ctx.ID().getText()
    elif ctx.LPAREN() and ctx.RPAREN():
      return f"({self.visit(ctx.expresion())})"
    elif ctx.CIERTO():
      return "True"
    elif ctx.FALSO():
      return "False"
    elif ctx.NULO():
      return "None"
    return ""

  def get_indent(self):
    return "    " * self.indent_level

def main(argv):
  input_stream = FileStream(argv[1], encoding='utf-8')
  lexer = LatinoLexer(input_stream)
  stream = CommonTokenStream(lexer)
  parser = LatinoParser(stream)
  tree = parser.programa()

  translator = LatinoToPythonTranslator()
  translator.visit(tree)

  for line in translator.output:
    print(line)

if __name__ == '__main__':
  main(sys.argv)
