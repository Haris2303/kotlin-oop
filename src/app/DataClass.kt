package app

import data.Product

fun main() {
    val product = Product("Mie Sedap", 5000, "Food")

    val product2 = product.copy()
    println(product)
    println(product2)
}