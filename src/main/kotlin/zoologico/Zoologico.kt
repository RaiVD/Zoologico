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
                    var entrada = false
                    while (!entrada) {
                        println("Qual o nome do leão:")
                        val nome = readlnOrNull()

                        if (!nome.isNullOrBlank()) {
                            leao.add(Leao(nome))
                            println("Leão cadastrado com sucesso!")
                            entrada = true
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

        fun interagir() {
            var opc: Int
            do {
                println("Qual animal você quer interagir?\n\t 1- Leão \t 2- Passáro \t 3- Peixe")
                opc = readln().toIntOrNull() ?: 0
            } while (opc == 0)
            when (opc) {
                1 -> {
                    if (leao.isNotEmpty()) {
                        for ((index, animal) in leao.withIndex()) {
                            println("$index ${animal.nome}")
                        }
                        print("Escolha o número do animal para interagir: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until leao.size) {
                            val animal = leao[opcao]
                            println(animal.emitirSom())
                            println(animal.rugir())
                            println(animal.mover())
                        } else {
                            println("Opção inválida. Não foi possível interagir com o animal.")
                        }
                    } else {
                        println("Não há animais cadastrados para interagir.")
                    }
                }
                2 -> {
                    if (passaro.isNotEmpty()) {
                        for ((index, animal) in passaro.withIndex()) {
                            println("$index ${animal.nome}")
                        }

                        print("Escolha o número do animal para interagir: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until passaro.size) {
                            val animal = passaro[opcao]
                            println(animal.voar())
                            println(animal.mover())

                        } else {
                            println("Opção inválida. Não foi possível interagir com o animal.")
                        }
                    } else {
                        println("Não há animais cadastrados para interagir.")
                    }
                }
                3 -> {
                    if (peixe.isNotEmpty()) {
                        for ((index, animal) in peixe.withIndex()) {
                            println("$index ${animal.nome}")
                        }

                        print("Escolha o número do animal para interagir: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until peixe.size) {
                            val animal = peixe[opcao]
                            println(animal.nadar())
                            println(animal.mover())

                        } else {
                            println("Opção inválida. Não foi possível interagir com o animal.")
                        }
                    } else {
                        println("Não há animais cadastrados para interagir.")
                    }
                }
            }
        }


        fun listarAnimal() {
            println("===== Listar Animais =====")
            println("1. Leão")
            println("2. Pássaro")
            println("3. Peixe")
            println("==============================")
            print("Escolha o tipo de animal para listar: ")
            val opcao = readlnOrNull()?.toIntOrNull()
            when (opcao) {
                1 -> {
                    if (leao.isNotEmpty()) {
                        for ((index, animal) in leao.withIndex()) {
                            println("$index. ${animal.nome}")
                        }

                    } else {
                        println("Não há animais cadastrados para listar.")
                    }
                }
                2 -> {
                    if (passaro.isNotEmpty()) {
                        for ((index, animal) in passaro.withIndex()) {
                            println("$index. ${animal.nome}")
                        }

                    } else {
                        println("Não há animais cadastrados para listar.")
                    }
                }
                3 -> {
                    if (peixe.isNotEmpty()) {
                        for ((index, animal) in peixe.withIndex()) {
                            println("$index. ${animal.nome}")
                        }
                    } else {
                        println("Não há animais cadastrados para listar.")
                    }
                } else -> println("Opção inválida. O animal não foi cadastrado.")
            }
        }
        fun removerAnimal() {
            println("===== Remoção de Animal =====")
            println("1. Leão")
            println("2. Pássaro")
            println("3. Peixe")
            println("==============================")
            print("Escolha o tipo de animal que deseja remover: ")
            val opcao = readlnOrNull()?.toIntOrNull()
            when (opcao) {
                1 -> {
                    if (leao.isNotEmpty()) {
                        for ((index, animal) in leao.withIndex()) {
                            println("$index. ${animal.nome}")
                        }
                        print("Escolha o número do animal a ser removido: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until leao.size) {
                            val animalRemovido = leao[opcao]
                            leao.remove(animalRemovido)
                            println("${animalRemovido.nome} removido com sucesso!")
                        } else {
                            println("Opção inválida. O animal não foi removido.")
                        }
                    } else {
                        println("Não há animais cadastrados para remover.")
                    }
                }
                2 -> {
                    if (passaro.isNotEmpty()) {
                        for ((index, animal) in passaro.withIndex()) {
                            println("$index. ${animal.nome}")
                        }
                        print("Escolha o número do animal a ser removido: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until passaro.size) {
                            val animalRemovido = passaro[opcao]
                            passaro.remove(animalRemovido)
                            println("${animalRemovido.nome} removido com sucesso!")
                        } else {
                            println("Opção inválida. O animal não foi removido.")
                        }
                    } else {
                        println("Não há animais cadastrados para remover.")
                    }
                }
                3 -> {
                    if (peixe.isNotEmpty()) {
                        for ((index, animal) in peixe.withIndex()) {
                            println("$index. ${animal.nome}")
                        }

                        print("Escolha o número do animal a ser removido: ")
                        val opcao = readlnOrNull()?.toIntOrNull()

                        if (opcao != null && opcao in 0 until peixe.size) {
                            val animalRemovido = peixe[opcao]
                            peixe.remove(animalRemovido)
                            println("${animalRemovido.nome} removido com sucesso!")
                        } else {
                            println("Opção inválida. O animal não foi removido.")
                        }
                    } else {
                        println("Não há animais cadastrados para remover.")
                    }
                }
                else -> println("Opção inválida. O animal não foi cadastrado.")
            }
        }
    }
}