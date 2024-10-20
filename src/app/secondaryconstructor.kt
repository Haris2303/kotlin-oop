package app

import data.Address

fun main() {

    val address = Address("Jalan Ki Ageng", "Jogja")
    val address2 = Address("Jalan Ki Ageng", "Jogja", "Indonesia")

    println(address.street)
    println(address.city)
    println(address.country)

    println(address2.street)
    println(address2.city)
    println(address2.country)
}