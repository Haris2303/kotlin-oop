package app

import data.User

fun main() {
    val user1 = User("otong", "123")
    val user2 = User("ucup", "321")

    user1.username = "asep"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}