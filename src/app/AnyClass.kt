package app

import data.SmartPhone

fun main() {
    val smartphone = SmartPhone("Vivo x60", "Android")

    println(smartphone.toString());
    println(smartphone.hashCode());
}