package oop_00000106290_GabrielNathanaelWorang.week04.TugasMandiri2

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Mengambil 10% dari parent + tambahan 500.000
        return super.calculateBonus() + 500000
    }
}