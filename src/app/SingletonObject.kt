package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Otong"))
    Utilities.name = "Dirubah"
    a()
    b()

    println(Application.Utilities.toUpper("Otong"))
    println(Application.toLower("YANTO"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}