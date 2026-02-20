package oop_00000106290_GabrielNathanaelWorang.week02.TugasMandiri2

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default Argument: HP mulai dari 100
) {

    // Method untuk mensimulasikan serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName dengan kekuatan $baseDamage!")
    }

    // Method untuk menerima damage dan memperbarui State HP
    fun takeDamage(damage: Int) {
        this.hp -= damage

        // Logika Wajib: Validasi agar HP tidak minus
        if (this.hp < 0) {
            this.hp = 0
        }

        println("$name menerima $damage damage! HP tersisa: ${this.hp}")
    }

    // Method untuk mengecek status hidup
    fun isAlive(): Boolean {
        return this.hp > 0
    }
}