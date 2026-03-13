package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri2

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Kartu Kredit] Transaksi Rp$amount Sukses. Sisa limit: Rp${limit - usedAmount}")
        } else {
            println("[$accountName - Kartu Kredit] Transaksi Rp$amount Ditolak! Melebihi limit kartu.")
        }
    }
}