package app

import data.Television

fun main() {
    val television = Television()
//    println(television.brand) ERRROORRR!!!

    television.initTelevision("LG")
    println(television.brand)
}