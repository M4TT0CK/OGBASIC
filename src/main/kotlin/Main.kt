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
        
    """.trimIndent()

    val parser = DartmouthBASICParser(CommonTokenStream(DartmouthBASICLexer(CharStreams.fromString(sampleCode))))
    val def = Listener()
    val walker = ParseTreeWalker()
    val tree = parser.program()
    walker.walk(def, tree)
}