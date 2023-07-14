
# Sistema de Zoológico
# Funcionalidades
O programa oferece as seguintes opções no menu:

- Cadastrar: Permite ao usuário adicionar animais ao zoológico.

- Remover: Permite ao usuário remover animais do zoológico.

- Listar: Exibe uma lista de todos os animais atualmente no zoológico.

- Interagir: Interage com cada animal do zoológico, emitindo seu som e movimento específicos.

- Sair: Encerra o programa.

# Interface Animal

A interface Animal define dois métodos que todo animal deve implementar:

- emitirSom(): Retorna uma string representando o som do animal.

- mover(): Retorna uma string representando o movimento do animal.

# Implementações de Animais
O programa inclui as seguintes classes concretas que implementam a interface Animal:
- Leao:
  - Representa um leão no zoológico. Ela fornece um método adicional:

  - rugir(): Retorna uma string representando o rugido do leão.
- Passaro 
  - Representa um pássaro no zoológico. Ela fornece um método adicional:
  
  - voar(): Retorna uma string representando o voo do pássaro.
- Peixe 
  - Representa um peixe no zoológico. Ela fornece um método adicional:
  
  - nadar(): Retorna uma string representando o nado do peixe.
  Abrir mensagem