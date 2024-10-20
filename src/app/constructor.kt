package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.name = "Avanza Z1"

    val almaz = Car("Wuling", "", 2019)

    println(avanza.brand)
    println(avanza.year)
    println(avanza.name)
    println(almaz.brand)
    println(almaz.year)
}