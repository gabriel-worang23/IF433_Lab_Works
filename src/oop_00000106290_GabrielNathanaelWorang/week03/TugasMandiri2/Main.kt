package oop_00000106290_GabrielNathanaelWorang.week03.TugasMandiri2

fun main() {
    val player = Player("Ilham")
    println("XP awal ${player.username}: ${player.xp}")

    println("\n--- Menambah 50 XP ---")
    player.addXp(50)
    println("XP saat ini: ${player.xp} | Level saat ini: ${player.level}")

    println("\n--- Menambah 60 XP ---")
    player.addXp(60)

    println("XP akhir: ${player.xp} | Level akhir: ${player.level}")
}