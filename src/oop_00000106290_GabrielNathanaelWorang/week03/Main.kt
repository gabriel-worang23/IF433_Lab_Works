package oop_00000106290_GabrielNathanaelWorang.week03

fun main() {
    val e = Employee("Budi")

    //1. Test validasi salary
    e.salary = -1000 //harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //t2. test encapsulation
    e.increasePerformance()
    //e.performanceRating = 5 //cobba uncomment, pasti merah(Error)

    //3. Test Computes Property
    println("Pajak yang harus dibayar: ${e.tax}")
}