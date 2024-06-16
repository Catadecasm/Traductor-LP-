// Generated from /Users/jude/Projects/ANTLR Traductor/ANTLR_Traductor/grammar/Latino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatinoParser}.
 */
public interface LatinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatinoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LatinoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LatinoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LatinoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LatinoParser.LiteralContext ctx);
}