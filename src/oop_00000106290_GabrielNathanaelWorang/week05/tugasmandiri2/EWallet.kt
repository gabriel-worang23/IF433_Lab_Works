package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri2

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran sebesar Rp$amount Berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName - E-Wallet] Saldo tidak cukup untuk transaksi Rp$amount. Saldo saat ini: Rp$balance")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - E-Wallet] Top Up berhasil sebesar Rp$amount. Saldo sekarang: Rp$balance")
    }
}