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
15 READ X, Y, Z
20 READ N
25 PRINT X
30 PRINT Y
35 PRINT Z
40 PRINT N
40 DATA 4.2, 7.5, 25.1, -1, .1, .01, .001, .0001
45 DATA .2, .02, .002, .0002, .015, .025, .3, .03, .003
50 END
        
    """.trimIndent()
//        """
//        100 REM GUESSING GAME
//        110
//        120 PRINT "GUESS THE NUMBER BETWEEN 1 AND 100."
//        130
//        140 LET X = INT(100*RND(0)+1)
//        150 LET N = 0
//        160 PRINT "YOUR GUESS: ";
//        170 INPUT G
//        180 LET N = N+1
//        190 IF G = X THEN 300
//        200 IF G < X THEN 250
//        210 PRINT "TOO LARGE, GUESS AGAIN"
//        220 GOTO 160
//        230
//        250 PRINT "TOO SMALL, GUESS AGAIN"
//        260 GOTO 160
//        270
//        300 PRINT "YOU GUESSED IT, IN"; N; "TRIES"
//        310 PRINT "ANOTHER GAME (YES = 1, NO = 0): ";
//        320 INPUT A
//        330 IF A = 1 THEN 140
//        340 PRINT "THANKS FOR PLAYING"
//        350 END
//
//    """.trimIndent()
//        """
//120 DEF FNN(X) = EXP(-(X^2/2))/SQR(2*3.14159265)
//130
//140 FOR Q = -2 TO 2 STEP .1
//150 LET Y = FNN(Q)
//160 LET Y = INT(100*Y)
//170 FOR Z = 1 TO Y
//180 PRINT " ";
//190 NEXT Z
//200 PRINT "*"
//210 NEXT Q
//220 END
//
//    """.trimIndent()

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
        println(e)
    }
}