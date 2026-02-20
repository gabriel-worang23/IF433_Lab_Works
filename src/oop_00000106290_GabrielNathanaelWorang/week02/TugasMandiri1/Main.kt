package oop_00000106290_GabrielNathanaelWorang.week02.TugasMandiri1

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("=== Sistem Pencatat Peminjaman Buku ===")

    // 1. Meminta Input dari User
    print("Masukkan Judul Buku: ")
    val title = reader.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = reader.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = reader.nextInt()

    // 2. Validasi dengan IF
    // Jika minus, otomatis diubah menjadi 1 hari
    if (duration < 0) {
        println("[Peringatan] Durasi tidak valid. Durasi otomatis diatur ke 1 hari.")
        duration = 1
    }

    // 3. Membuat Objek Loan
    val userLoan = Loan(title, name, duration)

    // 4. Print Detail Peminjaman
    println("\n--- Detail Peminjaman ---")
    println("Peminjam     : ${userLoan.borrower}")
    println("Buku         : ${userLoan.bookTitle}")
    println("Durasi       : ${userLoan.loanDuration} hari")
    println("Total Denda  : Rp ${userLoan.calculateFine()}")
    println("-------------------------")
}