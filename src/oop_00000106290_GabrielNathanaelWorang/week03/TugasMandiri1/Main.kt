package oop_00000106290_GabrielNathanaelWorang.week03.TugasMandiri1

fun main() {
    val mySword = Weapon("Excalibur", 100)
    println("--- Status Awal ---")
    println("Nama: ${mySword.name} | Damage: ${mySword.damage} | Tier: ${mySword.tier}")
    println()

    // Skenario 1
    println("--- Mencoba Update Damage: -50 ---")
    mySword.damage = -50
    println("Status Sekarang: Damage tetap ${mySword.damage} (${mySword.tier})")
    println()

    // Skenario 2
    println("--- Mencoba Update Damage: 9999 ---")
    mySword.damage = 9999
    println("Status Sekarang: Damage disesuaikan ke ${mySword.damage}")

    //Cek Tier Akhir
    println("--- Status Akhir ---")
    println("Tier Senjata: ${mySword.tier}")
}