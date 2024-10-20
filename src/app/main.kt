package app

import data.Person

fun main() {
    val ucup = Person()
    ucup.firstName = "Ucup"

    val otong = Person()
    otong.firstName = "Otong"

    val asep = Person()
    asep.firstName = "Asep"

    println(ucup.firstName)
    println(otong.firstName)
    println(asep.firstName)
}