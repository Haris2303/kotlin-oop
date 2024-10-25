package app

import data.Game
import data.Login
import data.MinMax

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game kotlin", 1000000)

//    Ini kalau dilakukan capek banget!!
//    val name = game.name
//    val price = game.price

//    Pakai ini dong destructuring tapi ada syaratnya fungsinya harus componentX terus ada operator di awal fungsi
    val (name, price) = game
    println(name)
    println(price)

//    val (min, max) = minMax(50, 100)
//    println(min)
//    println(max)

    val (min, _) = minMax(5, 10)
    println(min)

    val login = Login("Ucup", "123")
//    login(login) { login: Login -> login.username == "Ucup" && login.password == "123" }
    login(login) { (username, password) ->
        username == "Ucup" && password == "123"
    }
}