package oop_00000106290_GabrielNathanaelWorang.week01

fun main() {
    val gameTitle: String = "Elden Ring: Shadow of the Erdtree"
    val price: Int = 599000

    val discountPercent = calculateDiscount(price)

    println("Game: $gameTitle")
    println("Diskon yang didapat: $discountPercent%")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10