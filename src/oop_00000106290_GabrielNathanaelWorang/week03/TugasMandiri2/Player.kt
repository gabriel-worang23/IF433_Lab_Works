package oop_00000106290_GabrielNathanaelWorang.week03.TugasMandiri2

class Player(val username: String) {
    var xp: Int = 0
        private set

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level
            xp += amount

            if (level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("Jumlah XP harus positif!")
        }
    }
}