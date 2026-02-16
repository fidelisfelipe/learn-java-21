# basic programming terms



# [Java SE 21](https://www.mindmeister.com/app/map/3943014439)

- Topics
    - Introduction
    - Basic Java
    - Operatons
    - Arrays
    - Control Flow Statements
    - Methods
    - Java Object-Oriented
      Programming
    - Wrapper Classes, Auto-Boing and
      Unboxing
    - String
    - Collections
    - Exceptions Handling in Java
    - Enum Types
    - Lambda Expression
    - Stream API
    - Date&Time
    - Java IO - Imput;Output
    - Overview of Threads
    - Thread Creation and Management
    - Synchronization and Concurrency
      Control
    - High-level Concurrency APIs
    - Thread Coordination
    - Locks and Advanced
      Synchronization
    - Concurrent Collections
  
    - Performance and Scalability
    - Java Virtual Machine and Threads
    - Best Practices and Advanced
      Topics

# Introduction

- package: é um módulo organizado de interfaces e classes relacionadas.
  Um pacote é um módulo organizado de interfaces e classes relacionadas.
  Podemos pensar em uma classe como um diretório de arquivos em sua classe de computador.
- class: uma classe se refere a um conjunto de iobjetos rekllacionados com propriedades comuns, classes e a capacidade de criar novas classes.
- object: um objeto é uma combinação de variáveis relacionadas, constantes e outras estruturas de dados que podem ser selecionadas e manipuladas em conjunto.
- Object Oriented Programming: é um paradigma de programação baseado no conceito de "objetos", que podem conter dados e código para manipular esses dados. Ele se concentra na criação de objetos que interagem entre si para resolver problemas complexos.
- Method - Function: um método é uma função associada a um objeto ou classe. Ele define o comportamento de um objeto e pode ser chamado para executar uma ação específica.
- Parameter - Argumenmt: um parâmetro é uma variável usada para receber um valor passado para um método ou função. Um argumento é o valor real passado para um método ou função quando ele é chamado.

- Development Tools: 
   - O JDK ou Java Development Kit, oferece tudo que o que precisamos para criar, testar e otimizar aplicativos.
   - Java C que transforma o código em programas executáveis. 
   - JShell - é um shell interativo para testes rápidos e o pacote J que agrupa aplicativos em instaladores nativos.
   - APIs - são conjuntos de classes e interfaces que fornecem funcionalidades específicas para os desenvolvedores. Elas permitem que os desenvolvedores usem recursos pré-construídos em seus aplicativos, economizando tempo e esforço.
Nela temos utilitários essenciais para estruturas de dados, manipulação de arquivos e miltithreading, entre outros.
Possui sintaxe moderna como registros e correspondência de padrões para um código mais limpo, rede e seguirança com suporte integrado a http 2 e TLS.
Possui acesso a banco de dados via JDBC e threads virtuais, tornando os aplicativos de alto desempenho mais fáceis.

   - Deployment: Nesta versão não temos mais a dependencia do java web start.
Instaladores nativos via pacote J, sem necessidade de JVM e empacotamento pronto para a nuvem.
Perfeito para microserviços e containers, assim como para criar interfaces de usuário.
  
   - User Interface Toolkits: Também fornece GUIs. O JavaFX é uma opção moderna para ineterfaces elegantes e entre plataformas.
Swing ainda é compatível com aplicativos legados e Java 2D para gráficos e animações personalizados.
   - Integration Libraries: Cinco sistemas de conexão. java é excelente em integrações.
Para banco de dados tem JDBC.
Para trabakllhar com serviçoes remotos de cliente HTTP ou gRPC.
Com o projeto Panamá ainda tem uma ponte suave para o código nativo de threads virtuais para uma concorrência mais simples.

   - JDK: É um ambiente de desenvolvimento de software usado para desenvolver aplicativos Java. Também possui o Development tools, que são as ferramentas de desenvolvimento, compiladores, depurados, entre outros.
     - JRE: Ele possue o ambiente de execução chamado de JRE - Java Runtime Execution, que é a parte de tempo de execução do software Java
       - Aqui ainda temos a JVM e as bibliotecas componentes para execução de aplicativos escritos em java.
     - A JVM é uma maquina virtual que executa programas Java. Portanto quando executamos o programa Java, o compilador primeiro compila o código fonte para bytecode.
