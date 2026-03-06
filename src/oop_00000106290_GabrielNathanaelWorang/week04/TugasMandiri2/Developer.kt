package oop_00000106290_GabrielNathanaelWorang.week04.TugasMandiri2

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override,
    // sehingga otomatis menggunakan implementasi dari Employee.
}