# OGBASIC
A syntax-directed-interpreter implementation of the original (OG) BASIC--commonly known as "Dartmouth BASIC."

# But why?
Mostly as an exercise. I've been wanting to implement an interpreter using a (Syntax-directed translation)[https://en.wikipedia.org/wiki/Syntax-directed_translation] approach for a while and BASIC, in its earliest form, provides what I believe is a great set of syntactic and semantic rules that are sufficiently complex such that I may actually learn something meaningful during the process, but also simple enough to lend itself to the syntax-directed methodology.

# Implementation
The plan is to use ANTLR4 to guide the parse and parse-tree/concrete-syntax-tree traversal using ANTLR's built in and powerful Listener pattern. I will be creating my own ANTLR4 grammar to this end. Kotlin will be the language of choice for the implementation of the CLI tool.
