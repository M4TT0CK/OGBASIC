import listeners.DartmouthBASICLexer
import listeners.DartmouthBASICParser
import listeners.Listener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main(args: Array<String>) {
    val sampleCode = """
        380 LET Z = 0
        400 LET Z = Z + 1
        410 PRINT Z
        420 GOTO 400
        
    """.trimIndent()

    val parser = DartmouthBASICParser(CommonTokenStream(DartmouthBASICLexer(CharStreams.fromString(sampleCode))))
    val def = Listener()
    val walker = ParseTreeWalker()
    val tree = parser.program()
    walker.walk(def, tree)
}