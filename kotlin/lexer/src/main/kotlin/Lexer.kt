package com.github.kazukima;

import java.util.regex.Pattern
import java.util.stream.Stream

enum class TokenType {
    MATH_OPERATOR("+"),
    IDENTIFIER("[a-z]+"),

    ;

    val pattern: Pattern;

    constructor(string: String) {
        this.pattern = Pattern.compile("^" + string)
    }
}

open class Token(
        token: String,
        type: TokenType) {}

class Lexer(
        val body: String) {
    fun tokenize(): Stream<Token> {
        val tokens = mutableListOf<Token>()

        val p = Pattern.compile("TEST")

        var lastMatch: Int = 0;

        TokenType.values().forEach {
            val matcher = p.matcher(body)
            when {
                matcher.find(lastMatch) ->
                    body.substring(lastMatch, matcher.end())

            }
        }


        return tokens.stream()
    }

    fun token(tokenString: String): Token {
        return Token(tokenString, TokenType.IDENTIFIER)
    }
}