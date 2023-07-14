package zoologico

class Peixe : Animal {
    override fun emitirSom(): String {
        return "O peixe está emitindo um som!"
    }

    override fun mover(): String {
        return "O peixe está nadando!"
    }

    fun nadar(): String {
        return "Nadando nas profundezas!"
    }
}