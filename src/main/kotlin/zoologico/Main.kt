package zoologico

fun main(){
    var entrada = false
    while (!entrada){
        println("Menu")
        println("1. Cadastrar | 2. Remover | 3. Listar | 4. Interagir | 5. Sair")
        println("Digite a opção desejada:")
        val opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Zoologico.cadastrarAnimal()
            2 -> println()
            3 -> println()
            4 -> println()
            5 -> {
                entrada = true
                println("Saindo do programa...")
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}