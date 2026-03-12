package oop_00000106290_GabrielNathanaelWorang.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RKPKS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}