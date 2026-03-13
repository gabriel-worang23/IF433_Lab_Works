package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri1

fun main() {
    val helper = MathHelper()

    // Memanggil hitungLuas dengan satu argumen Int
    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    // Memanggil hitungLuas dengan dua argumen Int
    val luasPersegiPanjang = helper.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10x4): $luasPersegiPanjang")

    // Memanggil hitungLuas dengan satu argumen Double
    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}