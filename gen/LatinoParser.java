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
		HASTA=17, INCLUIR=18, RETORNAR=19, ACADENA=20, ALOGICO=21, ANUMERO=22, 
		TIPO=23, IMPRIMIR=24, ESCRIBIR=25, PONER=26, IMPRIMIRF=27, LEER=28, LIMPIAR=29, 
		IDENTIFICADOR=30, ENTERO=31, REAL=32, CADENA=33, BOOLEANO=34, NULO=35, 
		CONCATENACION=36, MAS=37, MENOS=38, POR=39, DIVIDIR=40, MODULO=41, POTENCIA=42, 
		IGUAL=43, MAS_IGUAL=44, MENOS_IGUAL=45, POR_IGUAL=46, DIVIDIR_IGUAL=47, 
		MODULO_IGUAL=48, Y=49, O=50, IGUALDAD=51, DIFERENTE=52, MENOR=53, MENOR_IGUAL=54, 
		MAYOR=55, MAYOR_IGUAL=56, PUNTO_Y_COMA=57, DOS_PUNTOS=58, COMA=59, PARENIZQ=60, 
		PARENDER=61, LLAVEIZQ=62, LLAVEDER=63, CORCHETEIZQ=64, CORCHETEDER=65, 
		PUNTO=66, ESPACIOS=67, COMENTARIO_BLOQUE=68, COMENTARIO_LINEA=69, VAR=70, 
		ENTERO_TIPO=71, REAL_TIPO=72, CADENA_TIPO=73, BOOLEANO_TIPO=74, FUNCION=75, 
		TRY=76, EXCEPT=77, IMPORTAR=78, RETORNO=79, CONTINUAR=80, VERDADERO=81, 
		FALSO=82, CON=83, INCREMENTO=84;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_variable_declaracion = 2, 
		RULE_instruccion = 3, RULE_asignacion = 4, RULE_tipo_dato = 5, RULE_expresion = 6, 
		RULE_acadena_funcion = 7, RULE_alogico_funcion = 8, RULE_anumero_funcion = 9, 
		RULE_tipo_funcion = 10, RULE_literal = 11, RULE_lista = 12, RULE_diccionario = 13, 
		RULE_entrada_diccionario = 14, RULE_acceso_lista = 15, RULE_acceso_miembro = 16, 
		RULE_primario = 17, RULE_bin_op = 18, RULE_estructura_control = 19, RULE_if_estructura = 20, 
		RULE_for_estructura = 21, RULE_while_estructura = 22, RULE_switch_estructura = 23, 
		RULE_bloque_casos = 24, RULE_caso = 25, RULE_defecto = 26, RULE_otro = 27, 
		RULE_desde_estructura = 28, RULE_for_rango_estructura = 29, RULE_repetir_estructura = 30, 
		RULE_argumentos_rango = 31, RULE_instruccion_simple = 32, RULE_incremento_decremento = 33, 
		RULE_bloque = 34, RULE_funcion_declaracion = 35, RULE_parametros = 36, 
		RULE_parametro = 37, RULE_llamada_funcion = 38, RULE_llamada_metodo = 39, 
		RULE_argumentos = 40, RULE_retorno = 41, RULE_romper = 42, RULE_continuar = 43, 
		RULE_entrada_salida = 44, RULE_excepcion = 45, RULE_modulo = 46, RULE_incluir_modulo = 47, 
		RULE_comentario = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "variable_declaracion", "instruccion", "asignacion", 
			"tipo_dato", "expresion", "acadena_funcion", "alogico_funcion", "anumero_funcion", 
			"tipo_funcion", "literal", "lista", "diccionario", "entrada_diccionario", 
			"acceso_lista", "acceso_miembro", "primario", "bin_op", "estructura_control", 
			"if_estructura", "for_estructura", "while_estructura", "switch_estructura", 
			"bloque_casos", "caso", "defecto", "otro", "desde_estructura", "for_rango_estructura", 
			"repetir_estructura", "argumentos_rango", "instruccion_simple", "incremento_decremento", 
			"bloque", "funcion_declaracion", "parametros", "parametro", "llamada_funcion", 
			"llamada_metodo", "argumentos", "retorno", "romper", "continuar", "entrada_salida", 
			"excepcion", "modulo", "incluir_modulo", "comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'entonces'", "'sino'", "'fin'", "'~='", "'elegir'", "'caso'", 
			"'defecto'", "'otro'", "'romper'", "'desde'", "'mientras'", "'para'", 
			"'en'", "'rango'", "'repetir'", "'hasta'", "'incluir'", "'retornar'", 
			"'acadena'", "'alogico'", "'anumero'", "'tipo'", "'imprimir'", "'escribir'", 
			"'poner'", "'imprimirf'", "'leer'", "'limpiar'", null, null, null, null, 
			null, "'nulo'", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'y'", "'o'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'.'", null, null, null, "'var'", "'entero'", "'real'", 
			"'cadena'", "'booleano'", "'funcion'", "'try'", "'except'", "'importar'", 
			"'retorno'", "'continuar'", "'Verdadero'", "'Falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "ENTONCES", "SINO", "FIN", "REGEX", "ELEGIR", "CASO", "DEFECTO", 
			"OTRO", "ROMPER", "DESDE", "MIENTRAS", "PARA", "EN", "RANGO", "REPETIR", 
			"HASTA", "INCLUIR", "RETORNAR", "ACADENA", "ALOGICO", "ANUMERO", "TIPO", 
			"IMPRIMIR", "ESCRIBIR", "PONER", "IMPRIMIRF", "LEER", "LIMPIAR", "IDENTIFICADOR", 
			"ENTERO", "REAL", "CADENA", "BOOLEANO", "NULO", "CONCATENACION", "MAS", 
			"MENOS", "POR", "DIVIDIR", "MODULO", "POTENCIA", "IGUAL", "MAS_IGUAL", 
			"MENOS_IGUAL", "POR_IGUAL", "DIVIDIR_IGUAL", "MODULO_IGUAL", "Y", "O", 
			"IGUALDAD", "DIFERENTE", "MENOR", "MENOR_IGUAL", "MAYOR", "MAYOR_IGUAL", 
			"PUNTO_Y_COMA", "DOS_PUNTOS", "COMA", "PARENIZQ", "PARENDER", "LLAVEIZQ", 
			"LLAVEDER", "CORCHETEIZQ", "CORCHETEDER", "PUNTO", "ESPACIOS", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA", "VAR", "ENTERO_TIPO", "REAL_TIPO", "CADENA_TIPO", 
			"BOOLEANO_TIPO", "FUNCION", "TRY", "EXCEPT", "IMPORTAR", "RETORNO", "CONTINUAR", 
			"VERDADERO", "FALSO", "CON", "INCREMENTO"
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2131573826L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 6531L) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(98);
					declaracion();
					}
					break;
				case 2:
					{
					setState(99);
					instruccion();
					}
					break;
				case 3:
					{
					setState(100);
					comentario();
					}
					break;
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				variable_declaracion();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
				setState(110);
				estructura_control();
				}
				break;
			case IMPRIMIR:
			case ESCRIBIR:
			case PONER:
			case IMPRIMIRF:
			case LEER:
			case LIMPIAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				entrada_salida();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				excepcion();
				}
				break;
			case INCLUIR:
			case RETORNAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
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
			setState(116);
			match(IDENTIFICADOR);
			setState(117);
			match(IGUAL);
			setState(118);
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
		public Entrada_salidaContext entrada_salida() {
			return getRuleContext(Entrada_salidaContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				retorno();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				romper();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				continuar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				desde_estructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				while_estructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				for_rango_estructura();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				repetir_estructura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				estructura_control();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				entrada_salida();
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
			setState(133);
			match(IDENTIFICADOR);
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
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
			setState(137);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) ) {
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
		public Tipo_funcionContext tipo_funcion() {
			return getRuleContext(Tipo_funcionContext.class,0);
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
		public Acadena_funcionContext acadena_funcion() {
			return getRuleContext(Acadena_funcionContext.class,0);
		}
		public Alogico_funcionContext alogico_funcion() {
			return getRuleContext(Alogico_funcionContext.class,0);
		}
		public Anumero_funcionContext anumero_funcion() {
			return getRuleContext(Anumero_funcionContext.class,0);
		}
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(140);
				literal();
				}
				break;
			case 2:
				{
				setState(141);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(142);
				llamada_metodo();
				}
				break;
			case 4:
				{
				setState(143);
				lista();
				}
				break;
			case 5:
				{
				setState(144);
				diccionario();
				}
				break;
			case 6:
				{
				setState(145);
				acceso_lista();
				}
				break;
			case 7:
				{
				setState(146);
				acceso_miembro();
				}
				break;
			case 8:
				{
				setState(147);
				tipo_funcion();
				}
				break;
			case 9:
				{
				setState(148);
				match(PARENIZQ);
				setState(149);
				expresion(0);
				setState(150);
				match(PARENDER);
				}
				break;
			case 10:
				{
				setState(152);
				match(IDENTIFICADOR);
				}
				break;
			case 11:
				{
				setState(153);
				acadena_funcion();
				}
				break;
			case 12:
				{
				setState(154);
				alogico_funcion();
				}
				break;
			case 13:
				{
				setState(155);
				anumero_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						bin_op();
						setState(160);
						expresion(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(163);
						match(CONCATENACION);
						setState(164);
						expresion(2);
						}
						break;
					}
					} 
				}
				setState(169);
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
	public static class Acadena_funcionContext extends ParserRuleContext {
		public TerminalNode ACADENA() { return getToken(LatinoParser.ACADENA, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Acadena_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acadena_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAcadena_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acadena_funcionContext acadena_funcion() throws RecognitionException {
		Acadena_funcionContext _localctx = new Acadena_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_acadena_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ACADENA);
			setState(171);
			match(PARENIZQ);
			setState(172);
			expresion(0);
			setState(173);
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
	public static class Alogico_funcionContext extends ParserRuleContext {
		public TerminalNode ALOGICO() { return getToken(LatinoParser.ALOGICO, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Alogico_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alogico_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAlogico_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alogico_funcionContext alogico_funcion() throws RecognitionException {
		Alogico_funcionContext _localctx = new Alogico_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alogico_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ALOGICO);
			setState(176);
			match(PARENIZQ);
			setState(177);
			expresion(0);
			setState(178);
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
	public static class Anumero_funcionContext extends ParserRuleContext {
		public TerminalNode ANUMERO() { return getToken(LatinoParser.ANUMERO, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Anumero_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anumero_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitAnumero_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anumero_funcionContext anumero_funcion() throws RecognitionException {
		Anumero_funcionContext _localctx = new Anumero_funcionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anumero_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ANUMERO);
			setState(181);
			match(PARENIZQ);
			setState(182);
			expresion(0);
			setState(183);
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
	public static class Tipo_funcionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(LatinoParser.TIPO, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Tipo_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitTipo_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_funcionContext tipo_funcion() throws RecognitionException {
		Tipo_funcionContext _localctx = new Tipo_funcionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(TIPO);
			setState(186);
			match(PARENIZQ);
			setState(187);
			expresion(0);
			setState(188);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(LatinoParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(LatinoParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(LatinoParser.CADENA, 0); }
		public TerminalNode BOOLEANO() { return getToken(LatinoParser.BOOLEANO, 0); }
		public TerminalNode NULO() { return getToken(LatinoParser.NULO, 0); }
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
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CORCHETEIZQ);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
				{
				setState(193);
				expresion(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(194);
					match(COMA);
					setState(195);
					expresion(0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
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
		enterRule(_localctx, 26, RULE_diccionario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(LLAVEIZQ);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CADENA) {
				{
				setState(206);
				entrada_diccionario();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(207);
					match(COMA);
					setState(208);
					entrada_diccionario();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(216);
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
		enterRule(_localctx, 28, RULE_entrada_diccionario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(CADENA);
			setState(219);
			match(DOS_PUNTOS);
			setState(220);
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
		enterRule(_localctx, 30, RULE_acceso_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IDENTIFICADOR);
			setState(223);
			match(CORCHETEIZQ);
			setState(224);
			expresion(0);
			setState(225);
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
		enterRule(_localctx, 32, RULE_acceso_miembro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			primario();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(PUNTO);
					setState(229);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(234);
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
		enterRule(_localctx, 34, RULE_primario);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				llamada_metodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				lista();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				diccionario();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				acceso_lista();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				match(PARENIZQ);
				setState(242);
				expresion(0);
				setState(243);
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
		enterRule(_localctx, 36, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 143560896776503328L) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_estructura_control);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				if_estructura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				for_estructura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				while_estructura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				switch_estructura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				desde_estructura();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				for_rango_estructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
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
		enterRule(_localctx, 40, RULE_if_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(SI);
			setState(259);
			expresion(0);
			setState(260);
			match(ENTONCES);
			setState(261);
			bloque();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(262);
				match(SINO);
				setState(263);
				bloque();
				}
			}

			setState(266);
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
		enterRule(_localctx, 42, RULE_for_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(PARA);
			setState(269);
			match(IDENTIFICADOR);
			setState(270);
			match(IGUAL);
			setState(271);
			expresion(0);
			setState(272);
			match(HASTA);
			setState(273);
			expresion(0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(274);
				match(CON);
				setState(275);
				match(INCREMENTO);
				setState(276);
				expresion(0);
				}
			}

			setState(279);
			bloque();
			setState(280);
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
		enterRule(_localctx, 44, RULE_while_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(MIENTRAS);
			setState(283);
			expresion(0);
			setState(284);
			bloque();
			setState(285);
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
		enterRule(_localctx, 46, RULE_switch_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ELEGIR);
			setState(288);
			match(PARENIZQ);
			setState(289);
			expresion(0);
			setState(290);
			match(PARENDER);
			setState(291);
			bloque_casos();
			setState(292);
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
		enterRule(_localctx, 48, RULE_bloque_casos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASO:
					{
					setState(294);
					caso();
					}
					break;
				case DEFECTO:
					{
					setState(295);
					defecto();
					}
					break;
				case OTRO:
					{
					setState(296);
					otro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(301);
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
		enterRule(_localctx, 50, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CASO);
			setState(303);
			literal();
			setState(304);
			match(DOS_PUNTOS);
			setState(305);
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
		enterRule(_localctx, 52, RULE_defecto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(DEFECTO);
			setState(308);
			match(DOS_PUNTOS);
			setState(309);
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
		enterRule(_localctx, 54, RULE_otro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(OTRO);
			setState(312);
			match(DOS_PUNTOS);
			setState(313);
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
		enterRule(_localctx, 56, RULE_desde_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(DESDE);
			setState(316);
			match(PARENIZQ);
			setState(317);
			asignacion();
			setState(318);
			match(PUNTO_Y_COMA);
			setState(319);
			expresion(0);
			setState(320);
			match(PUNTO_Y_COMA);
			setState(321);
			incremento_decremento();
			setState(322);
			match(PARENDER);
			setState(323);
			bloque();
			setState(324);
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
		enterRule(_localctx, 58, RULE_for_rango_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(PARA);
			setState(327);
			match(IDENTIFICADOR);
			setState(328);
			match(EN);
			setState(329);
			match(RANGO);
			setState(330);
			match(PARENIZQ);
			setState(331);
			argumentos_rango();
			setState(332);
			match(PARENDER);
			setState(333);
			bloque();
			setState(334);
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
		enterRule(_localctx, 60, RULE_repetir_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(REPETIR);
			setState(337);
			bloque();
			setState(338);
			match(HASTA);
			setState(339);
			expresion(0);
			setState(340);
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
		enterRule(_localctx, 62, RULE_argumentos_rango);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			expresion(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(343);
				match(COMA);
				setState(344);
				expresion(0);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(345);
					match(COMA);
					setState(346);
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
		enterRule(_localctx, 64, RULE_instruccion_simple);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
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
		enterRule(_localctx, 66, RULE_incremento_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IDENTIFICADOR);
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				{
				setState(356);
				match(MAS);
				setState(357);
				match(MAS);
				}
				break;
			case MENOS:
				{
				setState(358);
				match(MENOS);
				setState(359);
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
		enterRule(_localctx, 68, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2131573826L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 6531L) != 0)) {
				{
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(362);
					declaracion();
					}
					break;
				case 2:
					{
					setState(363);
					instruccion();
					}
					break;
				case 3:
					{
					setState(364);
					comentario();
					}
					break;
				}
				}
				setState(369);
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
		enterRule(_localctx, 70, RULE_funcion_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(FUNCION);
			setState(371);
			match(IDENTIFICADOR);
			setState(372);
			match(PARENIZQ);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(373);
				parametros();
				}
			}

			setState(376);
			match(PARENDER);
			setState(377);
			bloque();
			setState(378);
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
		enterRule(_localctx, 72, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			parametro();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(381);
				match(COMA);
				setState(382);
				parametro();
				}
				}
				setState(387);
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
		enterRule(_localctx, 74, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(IDENTIFICADOR);
			setState(389);
			match(DOS_PUNTOS);
			setState(390);
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
		enterRule(_localctx, 76, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(IDENTIFICADOR);
			setState(393);
			match(PARENIZQ);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
				{
				setState(394);
				argumentos();
				}
			}

			setState(397);
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
		enterRule(_localctx, 78, RULE_llamada_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(IDENTIFICADOR);
			setState(400);
			match(PUNTO);
			setState(401);
			match(IDENTIFICADOR);
			setState(402);
			match(PARENIZQ);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
				{
				setState(403);
				argumentos();
				}
			}

			setState(406);
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
		enterRule(_localctx, 80, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			expresion(0);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(409);
				match(COMA);
				setState(410);
				expresion(0);
				}
				}
				setState(415);
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
		enterRule(_localctx, 82, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(RETORNO);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(417);
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
		enterRule(_localctx, 84, RULE_romper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 86, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode IMPRIMIR() { return getToken(LatinoParser.IMPRIMIR, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ESCRIBIR() { return getToken(LatinoParser.ESCRIBIR, 0); }
		public TerminalNode PONER() { return getToken(LatinoParser.PONER, 0); }
		public TerminalNode IMPRIMIRF() { return getToken(LatinoParser.IMPRIMIRF, 0); }
		public TerminalNode LEER() { return getToken(LatinoParser.LEER, 0); }
		public TerminalNode LIMPIAR() { return getToken(LatinoParser.LIMPIAR, 0); }
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
		enterRule(_localctx, 88, RULE_entrada_salida);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(IMPRIMIR);
				setState(425);
				match(PARENIZQ);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
					{
					setState(426);
					argumentos();
					}
				}

				setState(429);
				match(PARENDER);
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(ESCRIBIR);
				setState(431);
				match(PARENIZQ);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
					{
					setState(432);
					argumentos();
					}
				}

				setState(435);
				match(PARENDER);
				}
				break;
			case PONER:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(PONER);
				setState(437);
				match(PARENIZQ);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
					{
					setState(438);
					argumentos();
					}
				}

				setState(441);
				match(PARENDER);
				}
				break;
			case IMPRIMIRF:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(IMPRIMIRF);
				setState(443);
				match(PARENIZQ);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 23089744247823L) != 0)) {
					{
					setState(444);
					argumentos();
					}
				}

				setState(447);
				match(PARENDER);
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(LEER);
				setState(449);
				match(PARENIZQ);
				setState(450);
				match(PARENDER);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				match(LIMPIAR);
				setState(452);
				match(PARENIZQ);
				setState(453);
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
		enterRule(_localctx, 90, RULE_excepcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(TRY);
			setState(457);
			bloque();
			setState(458);
			match(EXCEPT);
			setState(459);
			match(IDENTIFICADOR);
			setState(460);
			match(DOS_PUNTOS);
			setState(461);
			bloque();
			setState(462);
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
		public Incluir_moduloContext incluir_modulo() {
			return getRuleContext(Incluir_moduloContext.class,0);
		}
		public TerminalNode RETORNAR() { return getToken(LatinoParser.RETORNAR, 0); }
		public DiccionarioContext diccionario() {
			return getRuleContext(DiccionarioContext.class,0);
		}
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
		enterRule(_localctx, 92, RULE_modulo);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				incluir_modulo();
				}
				break;
			case RETORNAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(RETORNAR);
				setState(466);
				diccionario();
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
	public static class Incluir_moduloContext extends ParserRuleContext {
		public TerminalNode INCLUIR() { return getToken(LatinoParser.INCLUIR, 0); }
		public TerminalNode PARENIZQ() { return getToken(LatinoParser.PARENIZQ, 0); }
		public TerminalNode CADENA() { return getToken(LatinoParser.CADENA, 0); }
		public TerminalNode PARENDER() { return getToken(LatinoParser.PARENDER, 0); }
		public Incluir_moduloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incluir_modulo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinoVisitor ) return ((LatinoVisitor<? extends T>)visitor).visitIncluir_modulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incluir_moduloContext incluir_modulo() throws RecognitionException {
		Incluir_moduloContext _localctx = new Incluir_moduloContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_incluir_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(INCLUIR);
			setState(470);
			match(PARENIZQ);
			setState(471);
			match(CADENA);
			setState(472);
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
		enterRule(_localctx, 96, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		"\u0004\u0001T\u01dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001s\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0084\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009d\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a6\b\u0006"+
		"\n\u0006\f\u0006\u00a9\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c5\b\f\n"+
		"\f\f\f\u00c8\t\f\u0003\f\u00ca\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00d2\b\r\n\r\f\r\u00d5\t\r\u0003\r\u00d7\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00e7\b\u0010\n\u0010\f\u0010\u00ea\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f6\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0101\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0109"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0116\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u012a\b\u0018\n\u0018\f\u0018\u012d\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u015c\b\u001f\u0003\u001f"+
		"\u015e\b\u001f\u0001 \u0001 \u0003 \u0162\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0169\b!\u0001\"\u0001\"\u0001\"\u0005\"\u016e\b\"\n\""+
		"\f\"\u0171\t\"\u0001#\u0001#\u0001#\u0001#\u0003#\u0177\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0180\b$\n$\f$\u0183\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u018c\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0195\b\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0005(\u019c\b(\n(\f(\u019f\t(\u0001)\u0001)\u0003"+
		")\u01a3\b)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u01ac"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0003,\u01b2\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u01b8\b,\u0001,\u0001,\u0001,\u0001,\u0003,\u01be\b,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01c7\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u01d4"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0000\u0001"+
		"\f1\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0005\u0001"+
		"\u0000+0\u0001\u0000GJ\u0001\u0000\u001f#\u0003\u0000\u0005\u0005%*18"+
		"\u0001\u0000DE\u01f8\u0000g\u0001\u0000\u0000\u0000\u0002r\u0001\u0000"+
		"\u0000\u0000\u0004t\u0001\u0000\u0000\u0000\u0006\u0083\u0001\u0000\u0000"+
		"\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000"+
		"\f\u009c\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010"+
		"\u00af\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014"+
		"\u00b9\u0001\u0000\u0000\u0000\u0016\u00be\u0001\u0000\u0000\u0000\u0018"+
		"\u00c0\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c"+
		"\u00da\u0001\u0000\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00e3"+
		"\u0001\u0000\u0000\u0000\"\u00f5\u0001\u0000\u0000\u0000$\u00f7\u0001"+
		"\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000(\u0102\u0001\u0000\u0000"+
		"\u0000*\u010c\u0001\u0000\u0000\u0000,\u011a\u0001\u0000\u0000\u0000."+
		"\u011f\u0001\u0000\u0000\u00000\u012b\u0001\u0000\u0000\u00002\u012e\u0001"+
		"\u0000\u0000\u00004\u0133\u0001\u0000\u0000\u00006\u0137\u0001\u0000\u0000"+
		"\u00008\u013b\u0001\u0000\u0000\u0000:\u0146\u0001\u0000\u0000\u0000<"+
		"\u0150\u0001\u0000\u0000\u0000>\u0156\u0001\u0000\u0000\u0000@\u0161\u0001"+
		"\u0000\u0000\u0000B\u0163\u0001\u0000\u0000\u0000D\u016f\u0001\u0000\u0000"+
		"\u0000F\u0172\u0001\u0000\u0000\u0000H\u017c\u0001\u0000\u0000\u0000J"+
		"\u0184\u0001\u0000\u0000\u0000L\u0188\u0001\u0000\u0000\u0000N\u018f\u0001"+
		"\u0000\u0000\u0000P\u0198\u0001\u0000\u0000\u0000R\u01a0\u0001\u0000\u0000"+
		"\u0000T\u01a4\u0001\u0000\u0000\u0000V\u01a6\u0001\u0000\u0000\u0000X"+
		"\u01c6\u0001\u0000\u0000\u0000Z\u01c8\u0001\u0000\u0000\u0000\\\u01d3"+
		"\u0001\u0000\u0000\u0000^\u01d5\u0001\u0000\u0000\u0000`\u01da\u0001\u0000"+
		"\u0000\u0000bf\u0003\u0002\u0001\u0000cf\u0003\u0006\u0003\u0000df\u0003"+
		"`0\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jk\u0005\u0000\u0000\u0001k\u0001\u0001\u0000\u0000\u0000ls\u0003\u0004"+
		"\u0002\u0000ms\u0003F#\u0000ns\u0003&\u0013\u0000os\u0003X,\u0000ps\u0003"+
		"Z-\u0000qs\u0003\\.\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000"+
		"\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0003\u0001\u0000\u0000\u0000"+
		"tu\u0005\u001e\u0000\u0000uv\u0005+\u0000\u0000vw\u0003\f\u0006\u0000"+
		"w\u0005\u0001\u0000\u0000\u0000x\u0084\u0003\b\u0004\u0000y\u0084\u0003"+
		"L&\u0000z\u0084\u0003R)\u0000{\u0084\u0003T*\u0000|\u0084\u0003V+\u0000"+
		"}\u0084\u00038\u001c\u0000~\u0084\u0003,\u0016\u0000\u007f\u0084\u0003"+
		":\u001d\u0000\u0080\u0084\u0003<\u001e\u0000\u0081\u0084\u0003&\u0013"+
		"\u0000\u0082\u0084\u0003X,\u0000\u0083x\u0001\u0000\u0000\u0000\u0083"+
		"y\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000\u0000\u0083{\u0001"+
		"\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000"+
		"\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000"+
		"\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0007\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u001e\u0000\u0000\u0086\u0087\u0007\u0000\u0000\u0000"+
		"\u0087\u0088\u0003\f\u0006\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0007\u0001\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0006\u0006\uffff\uffff\u0000\u008c\u009d\u0003\u0016\u000b\u0000"+
		"\u008d\u009d\u0003L&\u0000\u008e\u009d\u0003N\'\u0000\u008f\u009d\u0003"+
		"\u0018\f\u0000\u0090\u009d\u0003\u001a\r\u0000\u0091\u009d\u0003\u001e"+
		"\u000f\u0000\u0092\u009d\u0003 \u0010\u0000\u0093\u009d\u0003\u0014\n"+
		"\u0000\u0094\u0095\u0005<\u0000\u0000\u0095\u0096\u0003\f\u0006\u0000"+
		"\u0096\u0097\u0005=\u0000\u0000\u0097\u009d\u0001\u0000\u0000\u0000\u0098"+
		"\u009d\u0005\u001e\u0000\u0000\u0099\u009d\u0003\u000e\u0007\u0000\u009a"+
		"\u009d\u0003\u0010\b\u0000\u009b\u009d\u0003\u0012\t\u0000\u009c\u008b"+
		"\u0001\u0000\u0000\u0000\u009c\u008d\u0001\u0000\u0000\u0000\u009c\u008e"+
		"\u0001\u0000\u0000\u0000\u009c\u008f\u0001\u0000\u0000\u0000\u009c\u0090"+
		"\u0001\u0000\u0000\u0000\u009c\u0091\u0001\u0000\u0000\u0000\u009c\u0092"+
		"\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0094"+
		"\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u00a7\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\n\u0002\u0000\u0000\u009f\u00a0\u0003$\u0012\u0000\u00a0\u00a1\u0003"+
		"\f\u0006\u0003\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a3\n\u0001"+
		"\u0000\u0000\u00a3\u00a4\u0005$\u0000\u0000\u00a4\u00a6\u0003\f\u0006"+
		"\u0002\u00a5\u009e\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000"+
		"\u00ab\u00ac\u0005<\u0000\u0000\u00ac\u00ad\u0003\f\u0006\u0000\u00ad"+
		"\u00ae\u0005=\u0000\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0015\u0000\u0000\u00b0\u00b1\u0005<\u0000\u0000\u00b1\u00b2\u0003"+
		"\f\u0006\u0000\u00b2\u00b3\u0005=\u0000\u0000\u00b3\u0011\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6\u0005<\u0000"+
		"\u0000\u00b6\u00b7\u0003\f\u0006\u0000\u00b7\u00b8\u0005=\u0000\u0000"+
		"\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0017\u0000\u0000"+
		"\u00ba\u00bb\u0005<\u0000\u0000\u00bb\u00bc\u0003\f\u0006\u0000\u00bc"+
		"\u00bd\u0005=\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0007\u0002\u0000\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0\u00c9"+
		"\u0005@\u0000\u0000\u00c1\u00c6\u0003\f\u0006\u0000\u00c2\u00c3\u0005"+
		";\u0000\u0000\u00c3\u00c5\u0003\f\u0006\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005A\u0000\u0000\u00cc\u0019\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d6\u0005>\u0000\u0000\u00ce\u00d3\u0003\u001c\u000e\u0000"+
		"\u00cf\u00d0\u0005;\u0000\u0000\u00d0\u00d2\u0003\u001c\u000e\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005?\u0000\u0000\u00d9\u001b"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005!\u0000\u0000\u00db\u00dc\u0005"+
		":\u0000\u0000\u00dc\u00dd\u0003\f\u0006\u0000\u00dd\u001d\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u001e\u0000\u0000\u00df\u00e0\u0005@\u0000"+
		"\u0000\u00e0\u00e1\u0003\f\u0006\u0000\u00e1\u00e2\u0005A\u0000\u0000"+
		"\u00e2\u001f\u0001\u0000\u0000\u0000\u00e3\u00e8\u0003\"\u0011\u0000\u00e4"+
		"\u00e5\u0005B\u0000\u0000\u00e5\u00e7\u0005\u001e\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9!\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00f6\u0005"+
		"\u001e\u0000\u0000\u00ec\u00f6\u0003L&\u0000\u00ed\u00f6\u0003N\'\u0000"+
		"\u00ee\u00f6\u0003\u0018\f\u0000\u00ef\u00f6\u0003\u001a\r\u0000\u00f0"+
		"\u00f6\u0003\u001e\u000f\u0000\u00f1\u00f2\u0005<\u0000\u0000\u00f2\u00f3"+
		"\u0003\f\u0006\u0000\u00f3\u00f4\u0005=\u0000\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00eb\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6#\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0007\u0003\u0000\u0000\u00f8%\u0001\u0000\u0000"+
		"\u0000\u00f9\u0101\u0003(\u0014\u0000\u00fa\u0101\u0003*\u0015\u0000\u00fb"+
		"\u0101\u0003,\u0016\u0000\u00fc\u0101\u0003.\u0017\u0000\u00fd\u0101\u0003"+
		"8\u001c\u0000\u00fe\u0101\u0003:\u001d\u0000\u00ff\u0101\u0003<\u001e"+
		"\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000"+
		"\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000"+
		"\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\u0001\u0000\u0000\u0103\u0104\u0003\f\u0006\u0000\u0104"+
		"\u0105\u0005\u0002\u0000\u0000\u0105\u0108\u0003D\"\u0000\u0106\u0107"+
		"\u0005\u0003\u0000\u0000\u0107\u0109\u0003D\"\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0004\u0000\u0000\u010b)\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005\r\u0000\u0000\u010d\u010e\u0005\u001e\u0000"+
		"\u0000\u010e\u010f\u0005+\u0000\u0000\u010f\u0110\u0003\f\u0006\u0000"+
		"\u0110\u0111\u0005\u0011\u0000\u0000\u0111\u0115\u0003\f\u0006\u0000\u0112"+
		"\u0113\u0005S\u0000\u0000\u0113\u0114\u0005T\u0000\u0000\u0114\u0116\u0003"+
		"\f\u0006\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0003D\""+
		"\u0000\u0118\u0119\u0005\u0004\u0000\u0000\u0119+\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\f\u0000\u0000\u011b\u011c\u0003\f\u0006\u0000\u011c"+
		"\u011d\u0003D\"\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e-\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0005\u0006\u0000\u0000\u0120\u0121\u0005"+
		"<\u0000\u0000\u0121\u0122\u0003\f\u0006\u0000\u0122\u0123\u0005=\u0000"+
		"\u0000\u0123\u0124\u00030\u0018\u0000\u0124\u0125\u0005\u0004\u0000\u0000"+
		"\u0125/\u0001\u0000\u0000\u0000\u0126\u012a\u00032\u0019\u0000\u0127\u012a"+
		"\u00034\u001a\u0000\u0128\u012a\u00036\u001b\u0000\u0129\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c1\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0007\u0000"+
		"\u0000\u012f\u0130\u0003\u0016\u000b\u0000\u0130\u0131\u0005:\u0000\u0000"+
		"\u0131\u0132\u0003D\"\u0000\u01323\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005\b\u0000\u0000\u0134\u0135\u0005:\u0000\u0000\u0135\u0136\u0003"+
		"D\"\u0000\u01365\u0001\u0000\u0000\u0000\u0137\u0138\u0005\t\u0000\u0000"+
		"\u0138\u0139\u0005:\u0000\u0000\u0139\u013a\u0003D\"\u0000\u013a7\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u000b\u0000\u0000\u013c\u013d\u0005"+
		"<\u0000\u0000\u013d\u013e\u0003\b\u0004\u0000\u013e\u013f\u00059\u0000"+
		"\u0000\u013f\u0140\u0003\f\u0006\u0000\u0140\u0141\u00059\u0000\u0000"+
		"\u0141\u0142\u0003B!\u0000\u0142\u0143\u0005=\u0000\u0000\u0143\u0144"+
		"\u0003D\"\u0000\u0144\u0145\u0005\u0004\u0000\u0000\u01459\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\r\u0000\u0000\u0147\u0148\u0005\u001e\u0000"+
		"\u0000\u0148\u0149\u0005\u000e\u0000\u0000\u0149\u014a\u0005\u000f\u0000"+
		"\u0000\u014a\u014b\u0005<\u0000\u0000\u014b\u014c\u0003>\u001f\u0000\u014c"+
		"\u014d\u0005=\u0000\u0000\u014d\u014e\u0003D\"\u0000\u014e\u014f\u0005"+
		"\u0004\u0000\u0000\u014f;\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0010"+
		"\u0000\u0000\u0151\u0152\u0003D\"\u0000\u0152\u0153\u0005\u0011\u0000"+
		"\u0000\u0153\u0154\u0003\f\u0006\u0000\u0154\u0155\u0005\u0004\u0000\u0000"+
		"\u0155=\u0001\u0000\u0000\u0000\u0156\u015d\u0003\f\u0006\u0000\u0157"+
		"\u0158\u0005;\u0000\u0000\u0158\u015b\u0003\f\u0006\u0000\u0159\u015a"+
		"\u0005;\u0000\u0000\u015a\u015c\u0003\f\u0006\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e?\u0001\u0000\u0000\u0000\u015f\u0162\u0003\b"+
		"\u0004\u0000\u0160\u0162\u0003B!\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0162A\u0001\u0000\u0000\u0000\u0163"+
		"\u0168\u0005\u001e\u0000\u0000\u0164\u0165\u0005%\u0000\u0000\u0165\u0169"+
		"\u0005%\u0000\u0000\u0166\u0167\u0005&\u0000\u0000\u0167\u0169\u0005&"+
		"\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0169C\u0001\u0000\u0000\u0000\u016a\u016e\u0003\u0002\u0001"+
		"\u0000\u016b\u016e\u0003\u0006\u0003\u0000\u016c\u016e\u0003`0\u0000\u016d"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"E\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0005K\u0000\u0000\u0173\u0174\u0005\u001e\u0000\u0000\u0174\u0176\u0005"+
		"<\u0000\u0000\u0175\u0177\u0003H$\u0000\u0176\u0175\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0005=\u0000\u0000\u0179\u017a\u0003D\"\u0000\u017a"+
		"\u017b\u0005\u0004\u0000\u0000\u017bG\u0001\u0000\u0000\u0000\u017c\u0181"+
		"\u0003J%\u0000\u017d\u017e\u0005;\u0000\u0000\u017e\u0180\u0003J%\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182I\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0005\u001e\u0000\u0000\u0185\u0186\u0005:\u0000\u0000\u0186\u0187"+
		"\u0003\n\u0005\u0000\u0187K\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"\u001e\u0000\u0000\u0189\u018b\u0005<\u0000\u0000\u018a\u018c\u0003P("+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005=\u0000\u0000"+
		"\u018eM\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u001e\u0000\u0000\u0190"+
		"\u0191\u0005B\u0000\u0000\u0191\u0192\u0005\u001e\u0000\u0000\u0192\u0194"+
		"\u0005<\u0000\u0000\u0193\u0195\u0003P(\u0000\u0194\u0193\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0005=\u0000\u0000\u0197O\u0001\u0000\u0000\u0000"+
		"\u0198\u019d\u0003\f\u0006\u0000\u0199\u019a\u0005;\u0000\u0000\u019a"+
		"\u019c\u0003\f\u0006\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019eQ\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0005O\u0000\u0000\u01a1\u01a3\u0003\f"+
		"\u0006\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a3S\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\n\u0000"+
		"\u0000\u01a5U\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005P\u0000\u0000\u01a7"+
		"W\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0018\u0000\u0000\u01a9\u01ab"+
		"\u0005<\u0000\u0000\u01aa\u01ac\u0003P(\u0000\u01ab\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01c7\u0005=\u0000\u0000\u01ae\u01af\u0005\u0019\u0000"+
		"\u0000\u01af\u01b1\u0005<\u0000\u0000\u01b0\u01b2\u0003P(\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01c7\u0005=\u0000\u0000\u01b4\u01b5"+
		"\u0005\u001a\u0000\u0000\u01b5\u01b7\u0005<\u0000\u0000\u01b6\u01b8\u0003"+
		"P(\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01c7\u0005=\u0000\u0000"+
		"\u01ba\u01bb\u0005\u001b\u0000\u0000\u01bb\u01bd\u0005<\u0000\u0000\u01bc"+
		"\u01be\u0003P(\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c7\u0005"+
		"=\u0000\u0000\u01c0\u01c1\u0005\u001c\u0000\u0000\u01c1\u01c2\u0005<\u0000"+
		"\u0000\u01c2\u01c7\u0005=\u0000\u0000\u01c3\u01c4\u0005\u001d\u0000\u0000"+
		"\u01c4\u01c5\u0005<\u0000\u0000\u01c5\u01c7\u0005=\u0000\u0000\u01c6\u01a8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01ae\u0001\u0000\u0000\u0000\u01c6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01c6\u01ba\u0001\u0000\u0000\u0000\u01c6\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c7Y\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005L\u0000\u0000\u01c9\u01ca\u0003D\""+
		"\u0000\u01ca\u01cb\u0005M\u0000\u0000\u01cb\u01cc\u0005\u001e\u0000\u0000"+
		"\u01cc\u01cd\u0005:\u0000\u0000\u01cd\u01ce\u0003D\"\u0000\u01ce\u01cf"+
		"\u0005\u0004\u0000\u0000\u01cf[\u0001\u0000\u0000\u0000\u01d0\u01d4\u0003"+
		"^/\u0000\u01d1\u01d2\u0005\u0013\u0000\u0000\u01d2\u01d4\u0003\u001a\r"+
		"\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d4]\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\u0012\u0000\u0000"+
		"\u01d6\u01d7\u0005<\u0000\u0000\u01d7\u01d8\u0005!\u0000\u0000\u01d8\u01d9"+
		"\u0005=\u0000\u0000\u01d9_\u0001\u0000\u0000\u0000\u01da\u01db\u0007\u0004"+
		"\u0000\u0000\u01dba\u0001\u0000\u0000\u0000$egr\u0083\u009c\u00a5\u00a7"+
		"\u00c6\u00c9\u00d3\u00d6\u00e8\u00f5\u0100\u0108\u0115\u0129\u012b\u015b"+
		"\u015d\u0161\u0168\u016d\u016f\u0176\u0181\u018b\u0194\u019d\u01a2\u01ab"+
		"\u01b1\u01b7\u01bd\u01c6\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}