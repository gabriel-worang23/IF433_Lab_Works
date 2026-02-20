package oop_00000106290_GabrielNathanaelWorang.week02.TugasMandiri1

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // Primary Constructor dengan Default Argument
) {

    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun displayInfo() {
        println("Peminjam: $borrower")
        println("Judul Buku: $bookTitle")
        println("Durasi Pinjam: $loanDuration hari")
        println("Total Denda: Rp ${calculateFine()}")
        println("---------------------------")
    }
}