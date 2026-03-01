# OOP

* Methods of designing and implementing software
* Increase the flexibility and maintainability
* Some concepts simplify the software development
* Object, class, inheritance, polymorphism, abstraction, encapsulation

## Object and Class

* a classe é a declaração de um objeto
* a partir de uma classe podemos criar vários objetos
* o objeto é a referencia que contém o endereço de memória do objeto.

## Stack and Heap

- A própria linguagem java é responsável pela gestão da alocação de memória
- A JVM bifurca a memória em duas entidades distintas: memória de pilha(stack memory) e memória heap (heap memory)

### Stack memory
- Armazena a sequência de execução dos métodos e as variáveis locais

> Sendo assim, a stack mamory se materializa como um espa,co físico na RAM alocado para cada thread em tempo de execução
> passando a existir, quando uma thread é iniciada
> O espaço da stack abriga variáveis locais, métodos, tipos de dados primitivos e refeências de objetos.
> Então, sempre que um método é invocado, um novo bloco se materializa na stack memory para guardar valores primitivos locais e referências a outros objetos dentro do método
> A stack utiliza o gerenciamento LIFO(last in first out) por sua acessibilidade global
> Basicamente, ele reserva espaço para referências de variáveis a objetos e resultados parciais
> O Tempo de vida da memória alocada para a stack se estende até a conclusão da função
> No caso de espaço insuficiente para a criação de novos objetos, o erro de estouro de pilha é acionado
> A exception referênte a este erro é StackOverflowError
> O escopo de um elemento está confinado a suas respectivas threads e é isso que faz com que a JVM estabeleça uma pilha distinta para cada thread

### Heap Memory
- Armazena os objetos que utilizam alocaćão e desaloca,cão dinâmica de memória

> A heap ganha vida sempre qua a JVM ´e iniciada e permanece em uso pelo aplicativo durante todo o tempo de execução
> A heap serve como um espaço de armazenamento, por exemplo, para variáveis, objetos e tipos de referência
> Portanto, ao criar um objeto, ele invariavelmente toma forma no espaço da memória heap com a stack contendo a referência a ele

> Ao contrário da stack, que possui uma ordem de armazenamento, a heap não adere a ordem específica, portanto, gerencia dinamicamente os blocos de memória
> Desta forma, o gerenciamento manual da memória é realmente desnecessário
> O Java facilita do gerenciamento automático da memória por meio de um coletor de lixo que é responsável por excluir
> os objetos que não estão mais em uso. A memória alocada na heap persiste até que um evento específico ocorra, seja o termino do programa ou a ocorrência de liberação de memória.
> Os elementos da heap são acessíveis globalmente em todo o aplicativo, representando um espaço de memória compartilhado entre todas as threads.
> Um erro de falta de memória é lançado no caso de esgotamento de espaço na heap
> A exception referênte a este erro é OutOfMemoryError