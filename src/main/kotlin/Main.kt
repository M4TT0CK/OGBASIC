import listeners.DartmouthBASICLexer
import listeners.DartmouthBASICParser
import listeners.Listener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main(args: Array<String>) {
    val sampleCode = """
        210 LET H = ((1) + 2) + ((3 + 5) + (4 + 5 + (3 + 2)))
        220 PRINT H
        230 LET I = (1 + 2) * 3
        240 PRINT I
        250 LET G = -1 + -2
        260 PRINT G
        270 LET J = 3 - 2
        280 PRINT J
        290 LET K = 9 / 3
        300 PRINT K
        310 LET L = 3^3
        320 PRINT L
        
    """.trimIndent()

    val parser = DartmouthBASICParser(CommonTokenStream(DartmouthBASICLexer(CharStreams.fromString(sampleCode))))
    val def = Listener()
    val walker = ParseTreeWalker()
    val tree = parser.program()
    walker.walk(def, tree)
}