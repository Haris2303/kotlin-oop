package app

import data.Handphone
import data.Laptop

fun printObject(any: Any) {
    if(any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is Handphone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is Handphone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String;
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String;
    println(value)
}

fun main() {
    printString("Ucup")
//    printString(5)

    printStringSafe(10)

    printObjectWithWhen("Otong")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Lenovo"))
    printObjectWithWhen(Handphone("Vivo"))
}