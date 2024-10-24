package app

import data.Application

typealias App = Application
typealias Aplikasi = App
typealias App2 = data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin Aplikasi")

    val app2 = App2("Kotlin App 2")

    sayHello { "Otong" }
}