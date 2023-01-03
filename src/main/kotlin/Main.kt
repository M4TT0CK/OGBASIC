import listeners.DartmouthBASICLexer
import listeners.DartmouthBASICParser
import listeners.PreListener
import listeners.Listener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.lang.Exception

fun main(args: Array<String>) {
    val sampleCode = """
        10 FOR I = 1 TO 3
        20 READ P(I)
        21 READ Q(I, 1)
        30 NEXT I
        40 PRINT P(3)
        50 PRINT P(2)
        60 PRINT P(1)
        61 PRINT Q(1,1)
        62 PRINT Q(2,1)
        63 PRINT Q(3,1)
        70 DATA 1, 2, 3, 4, 5, 6, 7, 8, 9
        80 END

    """.trimIndent()

    val parser = DartmouthBASICParser(CommonTokenStream(DartmouthBASICLexer(CharStreams.fromString(sampleCode))))
    val pre = PreListener()
    val def = Listener()
    val walker = ParseTreeWalker()
    val tree = parser.program()
    def.programHolder = tree.children.toList()
    walker.walk(pre, tree)
    def.statementTable = pre.statementTable
    def.gotoAndSubTable = pre.gotoAndSubTable
    def.data = pre.data
//    try {
        walker.walk(def, tree)
//    } catch (e: Exception) {
//        println()
//        println(e)
//    }
}