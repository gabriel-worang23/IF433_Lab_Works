package oop_00000106290_GabrielNathanaelWorang.week02.TugasMandiri2

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("=== Inisialisasi Hero ===")
    print("Masukkan Nama Hero: ")
    val heroName = reader.nextLine()

    print("Masukkan Base Damage: ")
    val heroDamage = reader.nextInt()

    // 1. Buat Objek Hero (HP default 100)
    val myHero = Hero(heroName, heroDamage)

    // 2. Variabel bantuan untuk musuh
    var enemyHp = 100
    val enemyName = "Wild Goblin"

    println("\n--- PERTARUNGAN DIMULAI: ${myHero.name} VS $enemyName ---")

    // 3. Loop While selama Hero hidup DAN Musuh hidup
    while (myHero.isAlive() && enemyHp > 0) {
        println("\nSisa HP Anda: ${myHero.hp} | Sisa HP Musuh: $enemyHp")
        println("Menu Aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi (1/2): ")

        val choice = reader.nextInt()

        if (choice == 1) {
            // --- AKSI SERANG ---
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage

            // Validasi agar HP Musuh tidak minus saat diprint
            if (enemyHp < 0) enemyHp = 0
            println("HP $enemyName tersisa: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val damageBalasan = (10..20).random()
                println("\n$enemyName menyerang balik!")
                myHero.takeDamage(damageBalasan)
            }

        } else if (choice == 2) {
            // --- AKSI KABUR ---
            println("${myHero.name} memilih untuk melarikan diri dari pertarungan!")
            break // Memaksa loop berhenti
        } else {
            println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman Pemenang di luar loop
    println("\n============================")
    println("PERTANDINGAN BERAKHIR")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} berhasil mengalahkan $enemyName!")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali... ${myHero.name} telah gugur di medan perang.")
    } else {
        println("${myHero.name} selamat, namun musuh masih berkeliaran.")
    }
    println("============================")
}