package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri1

class MathHelper {

    // Menghitung luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Menghitung luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}