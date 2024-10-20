package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Ucup")
    manager.sayHello("Otong")

    val vicepresident = VicePresident("Asep")
    vicepresident.sayHello("Yanto")
}