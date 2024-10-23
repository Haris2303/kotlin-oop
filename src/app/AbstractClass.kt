package app

import data.City
import data.Country

fun main() {
    val location = City("Jogja")
    val country = Country("Indonesia")

    println(location.name)
    println(country.name)
}