package zoologico

class Passaro : Animal {
    override fun emitirSom(): String {
        return "O pássaro está emitindo um canto!"
    }

    override fun mover(): String {
        return "O pássaro está voando!"
    }

    fun voar(): String {
        return "Voando nas alturas!"
    }
}