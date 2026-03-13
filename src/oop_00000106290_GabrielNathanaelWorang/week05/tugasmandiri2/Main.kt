package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri2

fun main() {
    val myEWallet = EWallet("Budi", 50000.0)
    val myCreditCard = CreditCard("Budi", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    val nominalTransaksi = 75000.0

    println("=== Simulasi Pembayaran dengan Smart Casting ===\n")

    for (method in paymentMethods) {
        println("Memproses: ${method.accountName}")

        method.processPayment(nominalTransaksi)

        if (method is EWallet) {
            println("-> Sistem mendeteksi E-Wallet. Saldo mungkin kurang.")

            method.topUp(50000.0)

            println("-> Mencoba pembayaran ulang setelah Top Up:")
            method.processPayment(nominalTransaksi)
        }

        println("----------------------------------------------")
    }
}