package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Ucup");
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Otong", 10000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}