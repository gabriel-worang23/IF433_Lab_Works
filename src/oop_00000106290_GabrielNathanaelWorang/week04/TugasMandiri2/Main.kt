package oop_00000106290_GabrielNathanaelWorang.week04.TugasMandiri2

fun main() {
    val managerAndi = Manager("Andi", 10000000) // Gaji 10jt

    println("--- Data Manager ---")
    managerAndi.work()
    println("Bonus: Rp ${managerAndi.calculateBonus()}")

    println()

    val devBudi = Developer("Budi", 8000000, "Kotlin") // Gaji 8jt

    println("--- Data Developer ---")
    devBudi.work()
    println("Bonus: Rp ${devBudi.calculateBonus()}")
}