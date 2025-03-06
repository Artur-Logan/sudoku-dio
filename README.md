# Lógica do Jogo de Sudoku

Este repositório contém a lógica central para um jogo de Sudoku implementado em Java. Ele define os modelos para o tabuleiro do jogo, espaços e status do jogo.

## Modelos

### Tabuleiro

A classe `Tabuleiro` representa o tabuleiro do jogo de Sudoku. Ele gerencia os espaços no tabuleiro e fornece métodos para interagir com eles.

#### Atributos

* `espaços`: Uma `Lista` de `Lista` de objetos `Espaço`, representando a grade de Sudoku 9x9.

#### Métodos

* `getEspaços()`: Retorna a lista de espaços representando o tabuleiro.
* `getStatus()`: Retorna o status atual do jogo (`NAO_INICIADO`, `INCOMPLETO` ou `COMPLETO`).
* `temErro()`: Verifica se o tabuleiro tem algum erro (valores incorretos).
* `mudarValor(int coluna, int linha, int valor)`: Muda o valor de um espaço na coluna e linha especificadas. Retorna `falso` se o espaço for fixo (parte do quebra-cabeça inicial).
* `limparValor(int coluna, int linha)`: Limpa o valor de um espaço na coluna e linha especificadas. Retorna `falso` se o espaço for fixo.
* `reset()`: Limpa todos os espaços não fixos no tabuleiro.
* `jogoTerminado()`: Verifica se o jogo está terminado (sem erros e todos os espaços preenchidos).

### EnumJogos

O enum `EnumJogos` representa os possíveis status do jogo de Sudoku.

#### Valores

* `NAO_INICIADO`: O jogo não foi iniciado.
* `INCOMPLETO`: O jogo está em progresso, mas não concluído.
* `COMPLETO`: O jogo está concluído.

#### Métodos

* `getRotulo()`: Retorna o rótulo associado ao valor do enum.

### Espaço

A classe `Espaço` representa um único espaço no tabuleiro de Sudoku.

#### Atributos

* `atual`: O valor atual do espaço (pode ser `nulo`).
* `esperado`: O valor correto para o espaço.
* `fixo`: Um booleano indicando se o espaço é fixo (parte do quebra-cabeça inicial).

#### Métodos

* `getAtual()`: Retorna o valor atual do espaço.
* `setAtual(Integer atual)`: Define o valor atual do espaço.
* `limparEspaço()`: Limpa o valor atual do espaço.
* `getEsperado()`: Retorna o valor correto para o espaço.
* `éFixo()`: Retorna se o espaço é fixo.

## Uso

Essas classes fornecem a lógica do modelo para um jogo de Sudoku. Elas podem ser usadas para construir um aplicativo de jogo de Sudoku com uma interface de usuário.

### Exemplo

```java
// Exemplo de uso (simplificado)
Lista<Lista<Espaço>> espaçosIniciais = // ... inicializar espaços ...
Tabuleiro tabuleiro = novo Tabuleiro(espaçosIniciais);

tabuleiro.mudarValor(0, 0, 5); // Muda o valor na linha 0, coluna 0
se (tabuleiro.temErro()) {
    System.out.println("Erro detectado!");
}

se(tabuleiro.jogoTerminado()){
    System.out.println("Jogo terminado");
}
