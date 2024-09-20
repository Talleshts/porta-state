# Porta State Pattern Example

Este projeto é uma implementação do padrão de projeto State, usando o exemplo de uma porta que pode estar em diferentes estados: aberta, fechada e trancada. O objetivo é demonstrar como o padrão State permite que um objeto altere seu comportamento quando seu estado interno muda.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

- **Model**
  - `Porta`: Classe que representa a porta e seu estado atual.
  
- **State**
  - `PortaState`: Classe abstrata que define a interface para os estados da porta.
  - `AbertaState`: Classe que representa o estado "aberta" da porta.
  - `FechadaState`: Classe que representa o estado "fechada" da porta.
  - `TrancadaState`: Classe que representa o estado "trancada" da porta.

- **Principal**
  - `Principal`: Classe que contém o método `main` para executar o exemplo.

## Como Funciona

1. **Inicialização**: Quando uma nova porta é criada, ela começa no estado "fechada".
2. **Mudança de Estado**: A porta pode mudar de estado através de métodos como `abrir`, `fechar`, `trancar` e `destrancar`. Cada um desses métodos altera o estado interno da porta e imprime o novo estado.

### Exemplo de Uso

No método `main`, a execução segue os seguintes passos:

```java
public static void main(String[] args) {
    try {
        Porta porta = new Porta("Porta 1");
        porta.abrir(); // Tenta abrir a porta (deve mudar para "aberta")
        porta.fechar(); // Tenta fechar a porta (deve mudar para "fechada")
        porta.trancar(); // Tenta trancar a porta (deve mudar para "trancada")
        porta.destrancar(); // Tenta destrancar a porta (deve mudar para "fechada")
        porta.abrir(); // Tenta abrir a porta novamente (deve mudar para "aberta")
        
        System.out.println("\nInserindo nova porta!\n");
        
        Porta portaLab = new Porta("Porta do Laboratório");
        portaLab.abrir(); // Tenta abrir a nova porta
        portaLab.fechar(); // Tenta fechar a nova porta
        portaLab.trancar(); // Tenta trancar a nova porta
        portaLab.abrir(); // Tenta abrir a nova porta novamente
    } catch (Exception e) {
        System.out.println("Falha: " + e.getMessage());
    }
}
```

## Dependências

Este projeto utiliza o Maven como sistema de gerenciamento de projetos. As dependências podem ser gerenciadas no arquivo `pom.xml`.

## Conclusão

O padrão State é útil quando um objeto precisa alterar seu comportamento baseado em seu estado interno. Este exemplo simples de uma porta ilustra como as transições de estado podem ser implementadas de maneira clara e organizada.

Sinta-se à vontade para explorar e expandir este exemplo conforme necessário!
