package oop_00000106290_GabrielNathanaelWorang.week04

//gunakan keyword 'open'
open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method bersifat default. Gunakan 'open' agar di override
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}