package oop_00000106290_GabrielNathanaelWorang.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- Testing Car ---")
    val myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n --- Testing Electric Car ---")
    // Inisialisasi dengan brand, jumlah pintu, dan kapasitas baterai
    val myEv = ElectricCar("Tesla Model 3", 4, 85)

    // Memanggil method yang sudah di-override dan di-final-kan
    myEv.accelerate()

    // Memanggil method warisan dari class Car
    myEv.honk()
    myEv.openTrunk()
}