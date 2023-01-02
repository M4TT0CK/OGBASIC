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
120 DEF FNN(X) = EXP(-(X^2/2))/SQR(2*3.14159265)
130
140 FOR Q = -2 TO 2 STEP .1
150 LET Y = FNN(Q)
160 LET Y = INT(100*Y)
170 FOR Z = 1 TO Y
180 PRINT " ";
190 NEXT Z
200 PRINT "*"
210 NEXT Q
220 END

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
    try {
        walker.walk(def, tree)
    } catch (e: Exception) {
        println()
        println(e)
    }
}