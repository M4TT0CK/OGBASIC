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
        420 IF Z < 21 THEN 400
        430 PRINT Z + 23
        
    """.trimIndent()

    val parser = DartmouthBASICParser(CommonTokenStream(DartmouthBASICLexer(CharStreams.fromString(sampleCode))))
    val def = Listener()
    val walker = ParseTreeWalker()
    val tree = parser.program()
    def.programHolder = tree.children.toList()
    walker.walk(def, tree)
}