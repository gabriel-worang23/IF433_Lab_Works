package oop_00000106290_GabrielNathanaelWorang.week04

//Car "Is-A" Vehicle
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintuk dibuka.")
    }
}