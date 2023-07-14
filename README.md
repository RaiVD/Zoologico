
# Sistema de Zoológico
# Funcionalidades
O programa oferece as seguintes opções no menu:

### Cadastrar

Na opção de cadastro, você poderá escolher o tipo de animal a ser cadastrado: leão, pássaro ou peixe. Digite o número correspondente à opção desejada e pressione Enter. Em seguida, siga as instruções fornecidas para inserir o nome do animal. Após o cadastro bem-sucedido, uma mensagem de confirmação será exibida.

### Remover

Na opção de remoção, você poderá escolher o tipo de animal a ser removido: leão, pássaro ou peixe. Digite o número correspondente à opção desejada e pressione Enter. Em seguida, siga as instruções fornecidas para selecionar o animal a ser removido digitando o número correspondente a ele. Após a remoção bem-sucedida, uma mensagem de confirmação será exibida.

### Listar

Na opção de listagem, você poderá escolher o tipo de animal a ser listado: leão, pássaro ou peixe. Digite o número correspondente à opção desejada e pressione Enter. Uma lista dos animais do tipo selecionado será exibida.

### Interagir

Na opção de interação, você poderá escolher o tipo de animal com o qual deseja interagir: leão, pássaro ou peixe. Digite o número correspondente à opção desejada e pressione Enter. Em seguida, siga as instruções fornecidas para selecionar o animal com o qual deseja interagir digitando o número correspondente a ele. A interação será realizada com o animal selecionado, exibindo informações específicas sobre o animal.

### Sair
Na opção sair, ele finaliza o codigo

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


