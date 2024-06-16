// Generated from /Users/jude/Projects/ANTLR Traductor/ANTLR_Traductor/grammar/Latino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LatinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, ENTONCES=2, SINO=3, FIN=4, REGEX=5, ELEGIR=6, CASO=7, DEFECTO=8, 
		OTRO=9, ROMPER=10, DESDE=11, MIENTRAS=12, PARA=13, EN=14, RANGO=15, REPETIR=16, 
		HASTA=17, IDENTIFICADOR=18, ENTERO=19, REAL=20, CADENA=21, BOOLEANO=22, 
		CONCATENACION=23, MAS=24, MENOS=25, POR=26, DIVIDIR=27, MODULO=28, POTENCIA=29, 
		IGUAL=30, MAS_IGUAL=31, MENOS_IGUAL=32, POR_IGUAL=33, DIVIDIR_IGUAL=34, 
		MODULO_IGUAL=35, Y=36, O=37, IGUALDAD=38, DIFERENTE=39, MENOR=40, MENOR_IGUAL=41, 
		MAYOR=42, MAYOR_IGUAL=43, PUNTO_Y_COMA=44, DOS_PUNTOS=45, COMA=46, PARENIZQ=47, 
		PARENDER=48, LLAVEIZQ=49, LLAVEDER=50, CORCHETEIZQ=51, CORCHETEDER=52, 
		PUNTO=53, ESPACIOS=54, COMENTARIO_BLOQUE=55, COMENTARIO_LINEA=56, VAR=57, 
		ENTERO_TIPO=58, REAL_TIPO=59, CADENA_TIPO=60, BOOLEANO_TIPO=61, FUNCION=62, 
		LEER=63, IMPRIMIR=64, TRY=65, EXCEPT=66, IMPORTAR=67, RETORNO=68, CONTINUAR=69, 
		VERDADERO=70, FALSO=71, CON=72, INCREMENTO=73;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_variable_declaracion = 2, 
		RULE_instruccion = 3, RULE_asignacion = 4, RULE_tipo_dato = 5, RULE_expresion = 6, 
		RULE_literal = 7, RULE_lista = 8, RULE_diccionario = 9, RULE_entrada_diccionario = 10, 
		RULE_acceso_lista = 11, RULE_acceso_miembro = 12, RULE_primario = 13, 
		RULE_bin_op = 14, RULE_estructura_control = 15, RULE_if_estructura = 16, 
		RULE_for_estructura = 17, RULE_while_estructura = 18, RULE_switch_estructura = 19, 
		RULE_bloque_casos = 20, RULE_caso = 21, RULE_defecto = 22, RULE_otro = 23, 
		RULE_desde_estructura = 24, RULE_for_rango_estructura = 25, RULE_repetir_estructura = 26, 
		RULE_argumentos_rango = 27, RULE_instruccion_simple = 28, RULE_incremento_decremento = 29, 
		RULE_bloque = 30, RULE_funcion_declaracion = 31, RULE_parametros = 32, 
		RULE_parametro = 33, RULE_llamada_funcion = 34, RULE_llamada_metodo = 35, 
		RULE_argumentos = 36, RULE_retorno = 37, RULE_romper = 38, RULE_continuar = 39, 
		RULE_entrada_salida = 40, RULE_excepcion = 41, RULE_modulo = 42, RULE_fin_de_bloque = 43, 
		RULE_comentario = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "variable_declaracion", "instruccion", "asignacion", 
			"tipo_dato", "expresion", "literal", "lista", "diccionario", "entrada_diccionario", 
			"acceso_lista", "acceso_miembro", "primario", "bin_op", "estructura_control", 
			"if_estructura", "for_estructura", "while_estructura", "switch_estructura", 
			"bloque_casos", "caso", "defecto", "otro", "desde_estructura", "for_rango_estructura", 
			"repetir_estructura", "argumentos_rango", "instruccion_simple", "incremento_decremento", 
			"bloque", "funcion_declaracion", "parametros", "parametro", "llamada_funcion", 
			"llamada_metodo", "argumentos", "retorno", "romper", "continuar", "entrada_salida", 
			"excepcion", "modulo", "fin_de_bloque", "comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'entonces'", "'sino'", "'fin'", "'~='", "'elegir'", "'caso'", 
			"'defecto'", "'otro'", "'romper'", "'desde'", "'mientras'", "'para'", 
			"'en'", "'rango'", "'repetir'", "'hasta'", null, null, null, null, null, 
			"'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'y'", "'o'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "';'", "':'", "','", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'.'", null, null, null, "'var'", "'entero'", "'real'", "'cadena'", 
			"'booleano'", "'funcion'", "'leer'", "'imprimir'", "'try'", "'except'", 
			"'importar'", "'retorno'", "'continuar'", "'Verdadero'", "'Falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "ENTONCES", "SINO", "FIN", "REGEX", "ELEGIR", "CASO", "DEFECTO", 
			"OTRO", "ROMPER", "DESDE", "MIENTRAS", "PARA", "EN", "RANGO", "REPETIR", 
			"HASTA", "IDENTIFICADOR", "ENTERO", "REAL", "CADENA", "BOOLEANO", "CONCATENACION", 
			"MAS", "MENOS", "POR", "DIVIDIR", "MODULO", "POTENCIA", "IGUAL", "MAS_IGUAL", 
			"MENOS_IGUAL", "POR_IGUAL", "DIVIDIR_IGUAL", "MODULO_IGUAL", "Y", "O", 
			"IGUALDAD", "DIFERENTE", "MENOR", "MENOR_IGUAL", "MAYOR", "MAYOR_IGUAL", 
			"PUNTO_Y_COMA", "DOS_PUNTOS", "COMA", "PARENIZQ", "PARENDER", "LLAVEIZQ", 
			"LLAVEDER", "CORCHETEIZQ", "CORCHETEDER", "PUNTO", "ESPACIOS", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA", "VAR", "ENTERO_TIPO", "REAL_TIPO", "CADENA_TIPO", 
			"BOOLEANO_TIPO", "FUNCION", "LEER", "IMPRIMIR", "TRY", "EXCEPT", "IMPORTAR", 
			"RETORNO", "CONTINUAR", "VERDADERO", "FALSO", "CON", "INCREMENTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Latino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LatinoParser.EOF, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4503599627370152894L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 59L) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(90);
					declaracion();
					}
					break;
				case 2:
					{
					setState(91);
					instruccion();
					}
					break;
				case 3:
					{
					setState(92);
					comentario();
					}
					break;
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public Variable_declaracionContext variable_declaracion() {
			return getRuleContext(Variable_declaracionContext.class,0);
		}
		public Funcion_declaracionContext funcion_declaracion() {
			return getRuleContext(Funcion_declaracionContext.class,0);
		}
		public Estructura_controlContext estructura_control() {
			return getRuleContext(Estructura_controlContext.class,0);
		}
		public Entrada_salidaContext entrada_salida() {
			return getRuleContext(Entrada_salidaContext.class,0);
		}
		public ExcepcionContext excepcion() {
			return getRuleContext(ExcepcionContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variable_declaracion();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				funcion_declaracion();
				}
				break;
			case SI:
			case ELEGIR:
			case DESDE:
			case MIENTRAS:
			case PARA:
			case REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				estructura_control();
				}
				break;
			case LEER:
			case IMPRIMIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				entrada_salida();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				excepcion();
				}
				break;
			case IMPORTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				modulo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaracionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(LatinoParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Variable_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitVariable_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaracionContext variable_declaracion() throws RecognitionException {
		Variable_declaracionContext _localctx = new Variable_declaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFICADOR);
			setState(109);
			match(IGUAL);
			setState(110);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public RomperContext romper() {
			return getRuleContext(RomperContext.class,0);
		}
		public ContinuarContext continuar() {
			return getRuleContext(ContinuarContext.class,0);
		}
		public Desde_estructuraContext desde_estructura() {
			return getRuleContext(Desde_estructuraContext.class,0);
		}
		public While_estructuraContext while_estructura() {
			return getRuleContext(While_estructuraContext.class,0);
		}
		public For_rango_estructuraContext for_rango_estructura() {
			return getRuleContext(For_rango_estructuraContext.class,0);
		}
		public Repetir_estructuraContext repetir_estructura() {
			return getRuleContext(Repetir_estructuraContext.class,0);
		}
		public Estructura_controlContext estructura_control() {
			return getRuleContext(Estructura_controlContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				retorno();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				romper();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				continuar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				desde_estructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				while_estructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				for_rango_estructura();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				repetir_estructura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				estructura_control();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LatinoParser.IGUAL, 0); }
		public TerminalNode MAS_IGUAL() { return getToken(LatinoParser.MAS_IGUAL, 0); }
		public TerminalNode MENOS_IGUAL() { return getToken(LatinoParser.MENOS_IGUAL, 0); }
		public TerminalNode POR_IGUAL() { return getToken(LatinoParser.POR_IGUAL, 0); }
		public TerminalNode DIVIDIR_IGUAL() { return getToken(LatinoParser.DIVIDIR_IGUAL, 0); }
		public TerminalNode MODULO_IGUAL() { return getToken(LatinoParser.MODULO_IGUAL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFICADOR);
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode ENTERO_TIPO() { return getToken(LatinoParser.ENTERO_TIPO, 0); }
		public TerminalNode REAL_TIPO() { return getToken(LatinoParser.REAL_TIPO, 0); }
		public TerminalNode CADENA_TIPO() { return getToken(LatinoParser.CADENA_TIPO, 0); }
		public TerminalNode BOOLEANO_TIPO() { return getToken(LatinoParser.BOOLEANO_TIPO, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4323455642275676160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Llamada_metodoContext llamada_metodo() {
			return getRuleContext(Llamada_metodoContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public DiccionarioContext diccionario() {
			return getRuleContext(DiccionarioContext.class,0);
		}
		public Acceso_listaContext acceso_lista() {
			return getRuleContext(Acceso_listaContext.class,0);
		}
		public Acceso_miembroContext acceso_miembro() {
			return getRuleContext(Acceso_miembroContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode CONCATENACION() { return getToken(LatinoParser.CONCATENACION, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(131);
				literal();
				}
				break;
			case 2:
				{
				setState(132);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(133);
				llamada_metodo();
				}
				break;
			case 4:
				{
				setState(134);
				lista();
				}
				break;
			case 5:
				{
				setState(135);
				diccionario();
				}
				break;
			case 6:
				{
				setState(136);
				acceso_lista();
				}
				break;
			case 7:
				{
				setState(137);
				acceso_miembro();
				}
				break;
			case 8:
				{
				setState(138);
				match(PARENIZQ);
				setState(139);
				expresion(0);
				setState(140);
				match(PARENDER);
				}
				break;
			case 9:
				{
				setState(142);
				match(IDENTIFICADOR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(146);
						bin_op();
						setState(147);
						expresion(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(150);
						match(CONCATENACION);
						setState(151);
						expresion(2);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(LatinoParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(LatinoParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(LatinoParser.CADENA, 0); }
		public TerminalNode BOOLEANO() { return getToken(LatinoParser.BOOLEANO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode CORCHETEIZQ() { return getToken(LatinoParser.CORCHETEIZQ, 0); }
		public TerminalNode CORCHETEDER() { return getToken(LatinoParser.CORCHETEDER, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(LatinoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LatinoParser.COMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(CORCHETEIZQ);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955487263588352L) != 0)) {
				{
				setState(160);
				expresion(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(161);
					match(COMA);
					setState(162);
					expresion(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
			match(CORCHETEDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiccionarioContext extends ParserRuleContext {
		public TerminalNode LLAVEIZQ() { return getToken(LatinoParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(LatinoParser.LLAVEDER, 0); }
		public List<Entrada_diccionarioContext> entrada_diccionario() {
			return getRuleContexts(Entrada_diccionarioContext.class);
		}
		public Entrada_diccionarioContext entrada_diccionario(int i) {
			return getRuleContext(Entrada_diccionarioContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(LatinoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LatinoParser.COMA, i);
		}
		public DiccionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diccionario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitDiccionario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiccionarioContext diccionario() throws RecognitionException {
		DiccionarioContext _localctx = new DiccionarioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_diccionario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LLAVEIZQ);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CADENA) {
				{
				setState(173);
				entrada_diccionario();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(174);
					match(COMA);
					setState(175);
					entrada_diccionario();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(183);
			match(LLAVEDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entrada_diccionarioContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(LatinoParser.CADENA, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Entrada_diccionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_diccionario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitEntrada_diccionario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entrada_diccionarioContext entrada_diccionario() throws RecognitionException {
		Entrada_diccionarioContext _localctx = new Entrada_diccionarioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_entrada_diccionario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CADENA);
			setState(186);
			match(DOS_PUNTOS);
			setState(187);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Acceso_listaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode CORCHETEIZQ() { return getToken(LatinoParser.CORCHETEIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CORCHETEDER() { return getToken(LatinoParser.CORCHETEDER, 0); }
		public Acceso_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAcceso_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceso_listaContext acceso_lista() throws RecognitionException {
		Acceso_listaContext _localctx = new Acceso_listaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_acceso_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IDENTIFICADOR);
			setState(190);
			match(CORCHETEIZQ);
			setState(191);
			expresion(0);
			setState(192);
			match(CORCHETEDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Acceso_miembroContext extends ParserRuleContext {
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(LatinoParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(LatinoParser.PUNTO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LatinoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LatinoParser.IDENTIFICADOR, i);
		}
		public Acceso_miembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_miembro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAcceso_miembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceso_miembroContext acceso_miembro() throws RecognitionException {
		Acceso_miembroContext _localctx = new Acceso_miembroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_acceso_miembro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			primario();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(PUNTO);
					setState(196);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Llamada_metodoContext llamada_metodo() {
			return getRuleContext(Llamada_metodoContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public DiccionarioContext diccionario() {
			return getRuleContext(DiccionarioContext.class,0);
		}
		public Acceso_listaContext acceso_lista() {
			return getRuleContext(Acceso_listaContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primario);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				llamada_metodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				lista();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				diccionario();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				acceso_lista();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(PARENIZQ);
				setState(209);
				expresion(0);
				setState(210);
				match(PARENDER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(LatinoParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(LatinoParser.MENOS, 0); }
		public TerminalNode POR() { return getToken(LatinoParser.POR, 0); }
		public TerminalNode DIVIDIR() { return getToken(LatinoParser.DIVIDIR, 0); }
		public TerminalNode MODULO() { return getToken(LatinoParser.MODULO, 0); }
		public TerminalNode POTENCIA() { return getToken(LatinoParser.POTENCIA, 0); }
		public TerminalNode Y() { return getToken(LatinoParser.Y, 0); }
		public TerminalNode O() { return getToken(LatinoParser.O, 0); }
		public TerminalNode IGUALDAD() { return getToken(LatinoParser.IGUALDAD, 0); }
		public TerminalNode DIFERENTE() { return getToken(LatinoParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(LatinoParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LatinoParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(LatinoParser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(LatinoParser.MAYOR_IGUAL, 0); }
		public TerminalNode REGEX() { return getToken(LatinoParser.REGEX, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17524523532320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Estructura_controlContext extends ParserRuleContext {
		public If_estructuraContext if_estructura() {
			return getRuleContext(If_estructuraContext.class,0);
		}
		public For_estructuraContext for_estructura() {
			return getRuleContext(For_estructuraContext.class,0);
		}
		public While_estructuraContext while_estructura() {
			return getRuleContext(While_estructuraContext.class,0);
		}
		public Switch_estructuraContext switch_estructura() {
			return getRuleContext(Switch_estructuraContext.class,0);
		}
		public Desde_estructuraContext desde_estructura() {
			return getRuleContext(Desde_estructuraContext.class,0);
		}
		public For_rango_estructuraContext for_rango_estructura() {
			return getRuleContext(For_rango_estructuraContext.class,0);
		}
		public Repetir_estructuraContext repetir_estructura() {
			return getRuleContext(Repetir_estructuraContext.class,0);
		}
		public Estructura_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitEstructura_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estructura_controlContext estructura_control() throws RecognitionException {
		Estructura_controlContext _localctx = new Estructura_controlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estructura_control);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				if_estructura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				for_estructura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				while_estructura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				switch_estructura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				desde_estructura();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				for_rango_estructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				repetir_estructura();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_estructuraContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(LatinoParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(LatinoParser.ENTONCES, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public TerminalNode SINO() { return getToken(LatinoParser.SINO, 0); }
		public If_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitIf_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_estructuraContext if_estructura() throws RecognitionException {
		If_estructuraContext _localctx = new If_estructuraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SI);
			setState(226);
			expresion(0);
			setState(227);
			match(ENTONCES);
			setState(228);
			bloque();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(229);
				match(SINO);
				setState(230);
				bloque();
				}
			}

			setState(233);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_estructuraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LatinoParser.PARA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(LatinoParser.IGUAL, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(LatinoParser.HASTA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public TerminalNode CON() { return getToken(LatinoParser.CON, 0); }
		public TerminalNode INCREMENTO() { return getToken(LatinoParser.INCREMENTO, 0); }
		public For_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitFor_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_estructuraContext for_estructura() throws RecognitionException {
		For_estructuraContext _localctx = new For_estructuraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PARA);
			setState(236);
			match(IDENTIFICADOR);
			setState(237);
			match(IGUAL);
			setState(238);
			expresion(0);
			setState(239);
			match(HASTA);
			setState(240);
			expresion(0);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(241);
				match(CON);
				setState(242);
				match(INCREMENTO);
				setState(243);
				expresion(0);
				}
			}

			setState(246);
			bloque();
			setState(247);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_estructuraContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(LatinoParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public While_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitWhile_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_estructuraContext while_estructura() throws RecognitionException {
		While_estructuraContext _localctx = new While_estructuraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(MIENTRAS);
			setState(250);
			expresion(0);
			setState(251);
			bloque();
			setState(252);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_estructuraContext extends ParserRuleContext {
		public TerminalNode ELEGIR() { return getToken(LatinoParser.ELEGIR, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Bloque_casosContext bloque_casos() {
			return getRuleContext(Bloque_casosContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public Switch_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitSwitch_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_estructuraContext switch_estructura() throws RecognitionException {
		Switch_estructuraContext _localctx = new Switch_estructuraContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ELEGIR);
			setState(255);
			match(PARENIZQ);
			setState(256);
			expresion(0);
			setState(257);
			match(PARENDER);
			setState(258);
			bloque_casos();
			setState(259);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_casosContext extends ParserRuleContext {
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public List<DefectoContext> defecto() {
			return getRuleContexts(DefectoContext.class);
		}
		public DefectoContext defecto(int i) {
			return getRuleContext(DefectoContext.class,i);
		}
		public List<OtroContext> otro() {
			return getRuleContexts(OtroContext.class);
		}
		public OtroContext otro(int i) {
			return getRuleContext(OtroContext.class,i);
		}
		public Bloque_casosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_casos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitBloque_casos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_casosContext bloque_casos() throws RecognitionException {
		Bloque_casosContext _localctx = new Bloque_casosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloque_casos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASO:
					{
					setState(261);
					caso();
					}
					break;
				case DEFECTO:
					{
					setState(262);
					defecto();
					}
					break;
				case OTRO:
					{
					setState(263);
					otro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LatinoParser.CASO, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(CASO);
			setState(270);
			literal();
			setState(271);
			match(DOS_PUNTOS);
			setState(272);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefectoContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(LatinoParser.DEFECTO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitDefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defecto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DEFECTO);
			setState(275);
			match(DOS_PUNTOS);
			setState(276);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtroContext extends ParserRuleContext {
		public TerminalNode OTRO() { return getToken(LatinoParser.OTRO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_otro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(OTRO);
			setState(279);
			match(DOS_PUNTOS);
			setState(280);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Desde_estructuraContext extends ParserRuleContext {
		public TerminalNode DESDE() { return getToken(LatinoParser.DESDE, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(LatinoParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(LatinoParser.PUNTO_Y_COMA, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Incremento_decrementoContext incremento_decremento() {
			return getRuleContext(Incremento_decrementoContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public Desde_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitDesde_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desde_estructuraContext desde_estructura() throws RecognitionException {
		Desde_estructuraContext _localctx = new Desde_estructuraContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_desde_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(DESDE);
			setState(283);
			match(PARENIZQ);
			setState(284);
			asignacion();
			setState(285);
			match(PUNTO_Y_COMA);
			setState(286);
			expresion(0);
			setState(287);
			match(PUNTO_Y_COMA);
			setState(288);
			incremento_decremento();
			setState(289);
			match(PARENDER);
			setState(290);
			bloque();
			setState(291);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_rango_estructuraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LatinoParser.PARA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode EN() { return getToken(LatinoParser.EN, 0); }
		public TerminalNode RANGO() { return getToken(LatinoParser.RANGO, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public Argumentos_rangoContext argumentos_rango() {
			return getRuleContext(Argumentos_rangoContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public For_rango_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rango_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitFor_rango_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rango_estructuraContext for_rango_estructura() throws RecognitionException {
		For_rango_estructuraContext _localctx = new For_rango_estructuraContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_rango_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(PARA);
			setState(294);
			match(IDENTIFICADOR);
			setState(295);
			match(EN);
			setState(296);
			match(RANGO);
			setState(297);
			match(PARENIZQ);
			setState(298);
			argumentos_rango();
			setState(299);
			match(PARENDER);
			setState(300);
			bloque();
			setState(301);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repetir_estructuraContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(LatinoParser.REPETIR, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(LatinoParser.HASTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public Repetir_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_estructura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitRepetir_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repetir_estructuraContext repetir_estructura() throws RecognitionException {
		Repetir_estructuraContext _localctx = new Repetir_estructuraContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repetir_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(REPETIR);
			setState(304);
			bloque();
			setState(305);
			match(HASTA);
			setState(306);
			expresion(0);
			setState(307);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argumentos_rangoContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(LatinoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LatinoParser.COMA, i);
		}
		public Argumentos_rangoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_rango; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitArgumentos_rango(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_rangoContext argumentos_rango() throws RecognitionException {
		Argumentos_rangoContext _localctx = new Argumentos_rangoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argumentos_rango);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expresion(0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(310);
				match(COMA);
				setState(311);
				expresion(0);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(312);
					match(COMA);
					setState(313);
					expresion(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruccion_simpleContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Incremento_decrementoContext incremento_decremento() {
			return getRuleContext(Incremento_decrementoContext.class,0);
		}
		public Instruccion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_simple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitInstruccion_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_simpleContext instruccion_simple() throws RecognitionException {
		Instruccion_simpleContext _localctx = new Instruccion_simpleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instruccion_simple);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				incremento_decremento();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Incremento_decrementoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> MAS() { return getTokens(LatinoParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(LatinoParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(LatinoParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(LatinoParser.MENOS, i);
		}
		public Incremento_decrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento_decremento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitIncremento_decremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incremento_decrementoContext incremento_decremento() throws RecognitionException {
		Incremento_decrementoContext _localctx = new Incremento_decrementoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_incremento_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(IDENTIFICADOR);
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				{
				setState(323);
				match(MAS);
				setState(324);
				match(MAS);
				}
				break;
			case MENOS:
				{
				setState(325);
				match(MENOS);
				setState(326);
				match(MENOS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4503599627370152894L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 59L) != 0)) {
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(329);
					declaracion();
					}
					break;
				case 2:
					{
					setState(330);
					instruccion();
					}
					break;
				case 3:
					{
					setState(331);
					comentario();
					}
					break;
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_declaracionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(LatinoParser.FUNCION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Funcion_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitFuncion_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_declaracionContext funcion_declaracion() throws RecognitionException {
		Funcion_declaracionContext _localctx = new Funcion_declaracionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcion_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(FUNCION);
			setState(338);
			match(IDENTIFICADOR);
			setState(339);
			match(PARENIZQ);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(340);
				parametros();
				}
			}

			setState(343);
			match(PARENDER);
			setState(344);
			bloque();
			setState(345);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(LatinoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LatinoParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			parametro();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(348);
				match(COMA);
				setState(349);
				parametro();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IDENTIFICADOR);
			setState(356);
			match(DOS_PUNTOS);
			setState(357);
			tipo_dato();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IDENTIFICADOR);
			setState(360);
			match(PARENIZQ);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955487263588352L) != 0)) {
				{
				setState(361);
				argumentos();
				}
			}

			setState(364);
			match(PARENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_metodoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LatinoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LatinoParser.IDENTIFICADOR, i);
		}
		public TerminalNode PUNTO() { return getToken(LatinoParser.PUNTO, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Llamada_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_metodo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitLlamada_metodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_metodoContext llamada_metodo() throws RecognitionException {
		Llamada_metodoContext _localctx = new Llamada_metodoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_llamada_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(IDENTIFICADOR);
			setState(367);
			match(PUNTO);
			setState(368);
			match(IDENTIFICADOR);
			setState(369);
			match(PARENIZQ);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955487263588352L) != 0)) {
				{
				setState(370);
				argumentos();
				}
			}

			setState(373);
			match(PARENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(LatinoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LatinoParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			expresion(0);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(376);
				match(COMA);
				setState(377);
				expresion(0);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(LatinoParser.RETORNO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(RETORNO);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(384);
				expresion(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RomperContext extends ParserRuleContext {
		public TerminalNode ROMPER() { return getToken(LatinoParser.ROMPER, 0); }
		public RomperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_romper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitRomper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RomperContext romper() throws RecognitionException {
		RomperContext _localctx = new RomperContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_romper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ROMPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinuarContext extends ParserRuleContext {
		public TerminalNode CONTINUAR() { return getToken(LatinoParser.CONTINUAR, 0); }
		public ContinuarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitContinuar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuarContext continuar() throws RecognitionException {
		ContinuarContext _localctx = new ContinuarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(CONTINUAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entrada_salidaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(LatinoParser.LEER, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public TerminalNode IMPRIMIR() { return getToken(LatinoParser.IMPRIMIR, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Entrada_salidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_salida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitEntrada_salida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entrada_salidaContext entrada_salida() throws RecognitionException {
		Entrada_salidaContext _localctx = new Entrada_salidaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_entrada_salida);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(LEER);
				setState(392);
				match(PARENIZQ);
				setState(393);
				match(PARENDER);
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(IMPRIMIR);
				setState(395);
				match(PARENIZQ);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955487263588352L) != 0)) {
					{
					setState(396);
					argumentos();
					}
				}

				setState(399);
				match(PARENDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExcepcionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(LatinoParser.TRY, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode EXCEPT() { return getToken(LatinoParser.EXCEPT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LatinoParser.DOS_PUNTOS, 0); }
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public ExcepcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excepcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitExcepcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcepcionContext excepcion() throws RecognitionException {
		ExcepcionContext _localctx = new ExcepcionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_excepcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TRY);
			setState(403);
			bloque();
			setState(404);
			match(EXCEPT);
			setState(405);
			match(IDENTIFICADOR);
			setState(406);
			match(DOS_PUNTOS);
			setState(407);
			bloque();
			setState(408);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode IMPORTAR() { return getToken(LatinoParser.IMPORTAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LatinoParser.IDENTIFICADOR, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(IMPORTAR);
			setState(411);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fin_de_bloqueContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(LatinoParser.FIN, 0); }
		public Fin_de_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_de_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitFin_de_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fin_de_bloqueContext fin_de_bloque() throws RecognitionException {
		Fin_de_bloqueContext _localctx = new Fin_de_bloqueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fin_de_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(LatinoParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(LatinoParser.COMENTARIO_BLOQUE, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_BLOQUE || _la==COMENTARIO_LINEA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u01a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003{\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0099\b\u0006\n\u0006\f\u0006\u009c\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b"+
		"\u00a7\t\b\u0003\b\u00a9\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00b1\b\t\n\t\f\t\u00b4\t\t\u0003\t\u00b6\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c6\b\f\n\f"+
		"\f\f\u00c9\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00d5\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00e0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e8\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0109\b\u0014\n\u0014\f\u0014\u010c\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u013b\b\u001b\u0003\u001b\u013d\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0141\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0148\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u014d\b\u001e\n\u001e\f\u001e\u0150\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0156\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0005 \u015f\b \n \f \u0162\t \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u016b\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0174\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u017b"+
		"\b$\n$\f$\u017e\t$\u0001%\u0001%\u0003%\u0182\b%\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u018e\b(\u0001"+
		"(\u0003(\u0191\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0000\u0001"+
		"\f-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0005\u0001\u0000"+
		"\u001e#\u0001\u0000:=\u0001\u0000\u0013\u0016\u0003\u0000\u0005\u0005"+
		"\u0018\u001d$+\u0001\u000078\u01b4\u0000_\u0001\u0000\u0000\u0000\u0002"+
		"j\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006z\u0001"+
		"\u0000\u0000\u0000\b|\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000"+
		"\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000"+
		"\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000"+
		"\u0014\u00b9\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000"+
		"\u0018\u00c2\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000"+
		"\u001c\u00d6\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000"+
		" \u00e1\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00f9"+
		"\u0001\u0000\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000(\u010a\u0001\u0000"+
		"\u0000\u0000*\u010d\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000"+
		".\u0116\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u0125"+
		"\u0001\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006\u0135\u0001\u0000"+
		"\u0000\u00008\u0140\u0001\u0000\u0000\u0000:\u0142\u0001\u0000\u0000\u0000"+
		"<\u014e\u0001\u0000\u0000\u0000>\u0151\u0001\u0000\u0000\u0000@\u015b"+
		"\u0001\u0000\u0000\u0000B\u0163\u0001\u0000\u0000\u0000D\u0167\u0001\u0000"+
		"\u0000\u0000F\u016e\u0001\u0000\u0000\u0000H\u0177\u0001\u0000\u0000\u0000"+
		"J\u017f\u0001\u0000\u0000\u0000L\u0183\u0001\u0000\u0000\u0000N\u0185"+
		"\u0001\u0000\u0000\u0000P\u0190\u0001\u0000\u0000\u0000R\u0192\u0001\u0000"+
		"\u0000\u0000T\u019a\u0001\u0000\u0000\u0000V\u019d\u0001\u0000\u0000\u0000"+
		"X\u019f\u0001\u0000\u0000\u0000Z^\u0003\u0002\u0001\u0000[^\u0003\u0006"+
		"\u0003\u0000\\^\u0003X,\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0005\u0000\u0000\u0001c\u0001\u0001\u0000"+
		"\u0000\u0000dk\u0003\u0004\u0002\u0000ek\u0003>\u001f\u0000fk\u0003\u001e"+
		"\u000f\u0000gk\u0003P(\u0000hk\u0003R)\u0000ik\u0003T*\u0000jd\u0001\u0000"+
		"\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jg\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"k\u0003\u0001\u0000\u0000\u0000lm\u0005\u0012\u0000\u0000mn\u0005\u001e"+
		"\u0000\u0000no\u0003\f\u0006\u0000o\u0005\u0001\u0000\u0000\u0000p{\u0003"+
		"\b\u0004\u0000q{\u0003D\"\u0000r{\u0003J%\u0000s{\u0003L&\u0000t{\u0003"+
		"N\'\u0000u{\u00030\u0018\u0000v{\u0003$\u0012\u0000w{\u00032\u0019\u0000"+
		"x{\u00034\u001a\u0000y{\u0003\u001e\u000f\u0000zp\u0001\u0000\u0000\u0000"+
		"zq\u0001\u0000\u0000\u0000zr\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000"+
		"\u0000zt\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000"+
		"\u0000\u0000zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0005\u0012\u0000"+
		"\u0000}~\u0007\u0000\u0000\u0000~\u007f\u0003\f\u0006\u0000\u007f\t\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0007\u0001\u0000\u0000\u0081\u000b\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0006\u0006\uffff\uffff\u0000\u0083\u0090"+
		"\u0003\u000e\u0007\u0000\u0084\u0090\u0003D\"\u0000\u0085\u0090\u0003"+
		"F#\u0000\u0086\u0090\u0003\u0010\b\u0000\u0087\u0090\u0003\u0012\t\u0000"+
		"\u0088\u0090\u0003\u0016\u000b\u0000\u0089\u0090\u0003\u0018\f\u0000\u008a"+
		"\u008b\u0005/\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c\u008d"+
		"\u00050\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u0090\u0005"+
		"\u0012\u0000\u0000\u008f\u0082\u0001\u0000\u0000\u0000\u008f\u0084\u0001"+
		"\u0000\u0000\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u0086\u0001"+
		"\u0000\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f\u0088\u0001"+
		"\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008a\u0001"+
		"\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u009a\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\n\u0002\u0000\u0000\u0092\u0093\u0003\u001c"+
		"\u000e\u0000\u0093\u0094\u0003\f\u0006\u0003\u0094\u0099\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\n\u0001\u0000\u0000\u0096\u0097\u0005\u0017\u0000\u0000"+
		"\u0097\u0099\u0003\f\u0006\u0002\u0098\u0091\u0001\u0000\u0000\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\r\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0007\u0002\u0000\u0000\u009e\u000f\u0001\u0000\u0000\u0000\u009f\u00a8"+
		"\u00053\u0000\u0000\u00a0\u00a5\u0003\f\u0006\u0000\u00a1\u00a2\u0005"+
		".\u0000\u0000\u00a2\u00a4\u0003\f\u0006\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u00054\u0000\u0000\u00ab\u0011\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b5\u00051\u0000\u0000\u00ad\u00b2\u0003\u0014\n\u0000"+
		"\u00ae\u00af\u0005.\u0000\u0000\u00af\u00b1\u0003\u0014\n\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u00052\u0000\u0000\u00b8\u0013"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba\u00bb"+
		"\u0005-\u0000\u0000\u00bb\u00bc\u0003\f\u0006\u0000\u00bc\u0015\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\u0012\u0000\u0000\u00be\u00bf\u0005"+
		"3\u0000\u0000\u00bf\u00c0\u0003\f\u0006\u0000\u00c0\u00c1\u00054\u0000"+
		"\u0000\u00c1\u0017\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u001a\r\u0000"+
		"\u00c3\u00c4\u00055\u0000\u0000\u00c4\u00c6\u0005\u0012\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u0019\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d5\u0005\u0012\u0000\u0000\u00cb\u00d5\u0003D\"\u0000\u00cc\u00d5"+
		"\u0003F#\u0000\u00cd\u00d5\u0003\u0010\b\u0000\u00ce\u00d5\u0003\u0012"+
		"\t\u0000\u00cf\u00d5\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005/\u0000"+
		"\u0000\u00d1\u00d2\u0003\f\u0006\u0000\u00d2\u00d3\u00050\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d5\u001b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0003\u0000\u0000"+
		"\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00e0\u0003 \u0010\u0000\u00d9"+
		"\u00e0\u0003\"\u0011\u0000\u00da\u00e0\u0003$\u0012\u0000\u00db\u00e0"+
		"\u0003&\u0013\u0000\u00dc\u00e0\u00030\u0018\u0000\u00dd\u00e0\u00032"+
		"\u0019\u0000\u00de\u00e0\u00034\u001a\u0000\u00df\u00d8\u0001\u0000\u0000"+
		"\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0001\u0000"+
		"\u0000\u00e2\u00e3\u0003\f\u0006\u0000\u00e3\u00e4\u0005\u0002\u0000\u0000"+
		"\u00e4\u00e7\u0003<\u001e\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6"+
		"\u00e8\u0003<\u001e\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\u0004\u0000\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\r\u0000\u0000\u00ec\u00ed\u0005\u0012\u0000\u0000\u00ed\u00ee\u0005\u001e"+
		"\u0000\u0000\u00ee\u00ef\u0003\f\u0006\u0000\u00ef\u00f0\u0005\u0011\u0000"+
		"\u0000\u00f0\u00f4\u0003\f\u0006\u0000\u00f1\u00f2\u0005H\u0000\u0000"+
		"\u00f2\u00f3\u0005I\u0000\u0000\u00f3\u00f5\u0003\f\u0006\u0000\u00f4"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003<\u001e\u0000\u00f7\u00f8"+
		"\u0005\u0004\u0000\u0000\u00f8#\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\f\u0000\u0000\u00fa\u00fb\u0003\f\u0006\u0000\u00fb\u00fc\u0003<\u001e"+
		"\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0005\u0006\u0000\u0000\u00ff\u0100\u0005/\u0000\u0000\u0100"+
		"\u0101\u0003\f\u0006\u0000\u0101\u0102\u00050\u0000\u0000\u0102\u0103"+
		"\u0003(\u0014\u0000\u0103\u0104\u0005\u0004\u0000\u0000\u0104\'\u0001"+
		"\u0000\u0000\u0000\u0105\u0109\u0003*\u0015\u0000\u0106\u0109\u0003,\u0016"+
		"\u0000\u0107\u0109\u0003.\u0017\u0000\u0108\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b)\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0007\u0000\u0000\u010e"+
		"\u010f\u0003\u000e\u0007\u0000\u010f\u0110\u0005-\u0000\u0000\u0110\u0111"+
		"\u0003<\u001e\u0000\u0111+\u0001\u0000\u0000\u0000\u0112\u0113\u0005\b"+
		"\u0000\u0000\u0113\u0114\u0005-\u0000\u0000\u0114\u0115\u0003<\u001e\u0000"+
		"\u0115-\u0001\u0000\u0000\u0000\u0116\u0117\u0005\t\u0000\u0000\u0117"+
		"\u0118\u0005-\u0000\u0000\u0118\u0119\u0003<\u001e\u0000\u0119/\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\u000b\u0000\u0000\u011b\u011c\u0005"+
		"/\u0000\u0000\u011c\u011d\u0003\b\u0004\u0000\u011d\u011e\u0005,\u0000"+
		"\u0000\u011e\u011f\u0003\f\u0006\u0000\u011f\u0120\u0005,\u0000\u0000"+
		"\u0120\u0121\u0003:\u001d\u0000\u0121\u0122\u00050\u0000\u0000\u0122\u0123"+
		"\u0003<\u001e\u0000\u0123\u0124\u0005\u0004\u0000\u0000\u01241\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\r\u0000\u0000\u0126\u0127\u0005\u0012\u0000"+
		"\u0000\u0127\u0128\u0005\u000e\u0000\u0000\u0128\u0129\u0005\u000f\u0000"+
		"\u0000\u0129\u012a\u0005/\u0000\u0000\u012a\u012b\u00036\u001b\u0000\u012b"+
		"\u012c\u00050\u0000\u0000\u012c\u012d\u0003<\u001e\u0000\u012d\u012e\u0005"+
		"\u0004\u0000\u0000\u012e3\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0010"+
		"\u0000\u0000\u0130\u0131\u0003<\u001e\u0000\u0131\u0132\u0005\u0011\u0000"+
		"\u0000\u0132\u0133\u0003\f\u0006\u0000\u0133\u0134\u0005\u0004\u0000\u0000"+
		"\u01345\u0001\u0000\u0000\u0000\u0135\u013c\u0003\f\u0006\u0000\u0136"+
		"\u0137\u0005.\u0000\u0000\u0137\u013a\u0003\f\u0006\u0000\u0138\u0139"+
		"\u0005.\u0000\u0000\u0139\u013b\u0003\f\u0006\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d7\u0001\u0000\u0000\u0000\u013e\u0141\u0003\b"+
		"\u0004\u0000\u013f\u0141\u0003:\u001d\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u01419\u0001\u0000\u0000\u0000"+
		"\u0142\u0147\u0005\u0012\u0000\u0000\u0143\u0144\u0005\u0018\u0000\u0000"+
		"\u0144\u0148\u0005\u0018\u0000\u0000\u0145\u0146\u0005\u0019\u0000\u0000"+
		"\u0146\u0148\u0005\u0019\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0148;\u0001\u0000\u0000\u0000\u0149"+
		"\u014d\u0003\u0002\u0001\u0000\u014a\u014d\u0003\u0006\u0003\u0000\u014b"+
		"\u014d\u0003X,\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f=\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005>\u0000\u0000\u0152\u0153\u0005\u0012\u0000"+
		"\u0000\u0153\u0155\u0005/\u0000\u0000\u0154\u0156\u0003@ \u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u00050\u0000\u0000\u0158\u0159"+
		"\u0003<\u001e\u0000\u0159\u015a\u0005\u0004\u0000\u0000\u015a?\u0001\u0000"+
		"\u0000\u0000\u015b\u0160\u0003B!\u0000\u015c\u015d\u0005.\u0000\u0000"+
		"\u015d\u015f\u0003B!\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161A\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\u0012\u0000\u0000\u0164\u0165\u0005"+
		"-\u0000\u0000\u0165\u0166\u0003\n\u0005\u0000\u0166C\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\u0012\u0000\u0000\u0168\u016a\u0005/\u0000\u0000"+
		"\u0169\u016b\u0003H$\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u00050\u0000\u0000\u016dE\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0012"+
		"\u0000\u0000\u016f\u0170\u00055\u0000\u0000\u0170\u0171\u0005\u0012\u0000"+
		"\u0000\u0171\u0173\u0005/\u0000\u0000\u0172\u0174\u0003H$\u0000\u0173"+
		"\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u00050\u0000\u0000\u0176G\u0001"+
		"\u0000\u0000\u0000\u0177\u017c\u0003\f\u0006\u0000\u0178\u0179\u0005."+
		"\u0000\u0000\u0179\u017b\u0003\f\u0006\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017dI\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0181\u0005D\u0000\u0000\u0180"+
		"\u0182\u0003\f\u0006\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182K\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"\n\u0000\u0000\u0184M\u0001\u0000\u0000\u0000\u0185\u0186\u0005E\u0000"+
		"\u0000\u0186O\u0001\u0000\u0000\u0000\u0187\u0188\u0005?\u0000\u0000\u0188"+
		"\u0189\u0005/\u0000\u0000\u0189\u0191\u00050\u0000\u0000\u018a\u018b\u0005"+
		"@\u0000\u0000\u018b\u018d\u0005/\u0000\u0000\u018c\u018e\u0003H$\u0000"+
		"\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u00050\u0000\u0000\u0190"+
		"\u0187\u0001\u0000\u0000\u0000\u0190\u018a\u0001\u0000\u0000\u0000\u0191"+
		"Q\u0001\u0000\u0000\u0000\u0192\u0193\u0005A\u0000\u0000\u0193\u0194\u0003"+
		"<\u001e\u0000\u0194\u0195\u0005B\u0000\u0000\u0195\u0196\u0005\u0012\u0000"+
		"\u0000\u0196\u0197\u0005-\u0000\u0000\u0197\u0198\u0003<\u001e\u0000\u0198"+
		"\u0199\u0005\u0004\u0000\u0000\u0199S\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0005C\u0000\u0000\u019b\u019c\u0005\u0012\u0000\u0000\u019cU\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019eW\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0007\u0004\u0000\u0000\u01a0Y\u0001\u0000\u0000\u0000"+
		" ]_jz\u008f\u0098\u009a\u00a5\u00a8\u00b2\u00b5\u00c7\u00d4\u00df\u00e7"+
		"\u00f4\u0108\u010a\u013a\u013c\u0140\u0147\u014c\u014e\u0155\u0160\u016a"+
		"\u0173\u017c\u0181\u018d\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}