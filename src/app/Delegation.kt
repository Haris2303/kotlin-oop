package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Otong")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Ucup")
}