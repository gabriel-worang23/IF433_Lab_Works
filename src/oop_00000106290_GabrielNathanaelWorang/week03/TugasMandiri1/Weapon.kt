package oop_00000106290_GabrielNathanaelWorang.week03.TugasMandiri1

class Weapon(val name: String, initialDamage: Int) {
    var damage: Int = initialDamage
        set(value) {
            when {
                // Aturan 1: Tidak boleh negatif
                value < 0 -> {
                    println("[WARNING] Damage tidak valid: $value. Nilai tetap $field.")
                }
                // Aturan 2: Maksimal 1000 (Anti-Overpowered)
                value > 1000 -> {
                    println("[INFO] Damage $value terlalu tinggi! Disesuaikan ke batas maksimal (1000).")
                    field = 1000
                }
                // Jika valid, update nilai field
                else -> field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }

    init {
        damage = initialDamage
    }
}