package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri2

fun main() {
    val myEWallet = EWallet("Budi", 50000.0)
    val myCreditCard = CreditCard("Budi", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    val nominalTransaksi = 75000.0

    println("=== Simulasi Pembayaran E-Commerce ===")

    for (method in paymentMethods) {
        println("Memproses metode pembayaran: ${method.accountName}")

        method.processPayment(nominalTransaksi)

        println("--------------------------------------")
    }
}