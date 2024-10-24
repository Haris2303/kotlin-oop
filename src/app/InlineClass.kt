package app

import data.Token

fun main() {
    val login = Token("Token Rahasia")
    println(login.value)
    println(login.toUpper())
}