package oop_00000106290_GabrielNathanaelWorang.week05.tugasmandiri2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}