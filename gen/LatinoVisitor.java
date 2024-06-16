// Generated from /Users/jude/Projects/ANTLR Traductor/ANTLR_Traductor/grammar/Latino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatinoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatinoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LatinoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LatinoParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#variable_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaracion(LatinoParser.Variable_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(LatinoParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LatinoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(LatinoParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LatinoParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LatinoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(LatinoParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#diccionario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiccionario(LatinoParser.DiccionarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#entrada_diccionario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada_diccionario(LatinoParser.Entrada_diccionarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#acceso_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_lista(LatinoParser.Acceso_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#acceso_miembro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_miembro(LatinoParser.Acceso_miembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(LatinoParser.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(LatinoParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#estructura_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control(LatinoParser.Estructura_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#if_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_estructura(LatinoParser.If_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#for_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_estructura(LatinoParser.For_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#while_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_estructura(LatinoParser.While_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#switch_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_estructura(LatinoParser.Switch_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#bloque_casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_casos(LatinoParser.Bloque_casosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(LatinoParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefecto(LatinoParser.DefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#otro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro(LatinoParser.OtroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#desde_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde_estructura(LatinoParser.Desde_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#for_rango_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rango_estructura(LatinoParser.For_rango_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#repetir_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir_estructura(LatinoParser.Repetir_estructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#argumentos_rango}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_rango(LatinoParser.Argumentos_rangoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#instruccion_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_simple(LatinoParser.Instruccion_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#incremento_decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento_decremento(LatinoParser.Incremento_decrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(LatinoParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#funcion_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_declaracion(LatinoParser.Funcion_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LatinoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LatinoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(LatinoParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#llamada_metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_metodo(LatinoParser.Llamada_metodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(LatinoParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(LatinoParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#romper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRomper(LatinoParser.RomperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#continuar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuar(LatinoParser.ContinuarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#entrada_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada_salida(LatinoParser.Entrada_salidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#excepcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcepcion(LatinoParser.ExcepcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#modulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(LatinoParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#fin_de_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin_de_bloque(LatinoParser.Fin_de_bloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinoParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LatinoParser.ComentarioContext ctx);
}