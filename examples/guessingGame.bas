        100 REM GUESSING GAME
        110
        120 PRINT "GUESS THE NUMBER BETWEEN 1 AND 100."
        130
        140 LET X = INT(100*RND(0)+1)
        150 LET N = 0
        160 PRINT "YOUR GUESS: ";
        170 INPUT G
        180 LET N = N+1
        190 IF G = X THEN 300
        200 IF G < X THEN 250
        210 PRINT "TOO LARGE, GUESS AGAIN"
        220 GOTO 160
        230
        250 PRINT "TOO SMALL, GUESS AGAIN"
        260 GOTO 160
        270
        300 PRINT "YOU GUESSED IT, IN"; N; "TRIES"
        310 PRINT "ANOTHER GAME (YES = 1, NO = 0): ";
        320 INPUT A
        330 IF A = 1 THEN 140
        340 PRINT "THANKS FOR PLAYING"
        350 END
        