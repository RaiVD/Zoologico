package zoologico
class Zoologico {

    companion object {
        val leao = mutableListOf<Leao>()
        val passaro = mutableListOf<Passaro>()
        val peixe = mutableListOf<Peixe>()


        fun cadastrarAnimal() {
            println("===== Cadastro de Animal =====")
            println("1. Leão")
            println("2. Pássaro")
            println("3. Peixe")
            println("==============================")

            print("Escolha o tipo de animal para cadastrar: ")
            val opcao = readlnOrNull()?.toIntOrNull()

            when (opcao) {
                1 -> {
                    var entrada=false
                    while (!entrada) {
                        println("Qual o nome do leão:")
                        val nome = readlnOrNull()

                        if (!nome.isNullOrBlank()) {
                            leao.add(Leao(nome))
                            println("Leão cadastrado com sucesso!")
                            entrada=true
                        } else {
                            println("Opção invalida")
                        }
                    }
                }

                2 -> {
                    do {
                        println("Qual o nome do passaro:")
                        val nome = readlnOrNull()
                        passaro.add(Passaro(nome))
                        println("Pássaro cadastrado com sucesso!")
                    } while (nome == null)
                }

                3 -> {
                    do {
                        println("Qual o nome do peixe:")
                        val nome = readlnOrNull()
                        peixe.add(Peixe(nome))
                        println("Peixe cadastrado com sucesso!")
                    } while (nome == null)
                }

                else -> println("Opção inválida. O animal não foi cadastrado.")
            }
        }
    }
}