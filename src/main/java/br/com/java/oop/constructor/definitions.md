# Constructor (Construtor)

---

## 1) O que e um construtor

Metodo especial invocado automaticamente na criacao de um objeto (`new`).
Inicializa o estado do objeto (atribui valores aos campos).

Caracteristicas obrigatorias:
- **Mesmo nome da classe**.
- **Sem tipo de retorno** (nem `void`).
- Pode ter qualquer modificador de acesso.

```java
class Carro {
    String modelo;
    int ano;

    // construtor
    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}

Carro c = new Carro("Civic", 2024);
```

---

## 2) Construtor padrao (default)

Se nenhum construtor for declarado, o compilador gera um sem parametros automaticamente.
**Se qualquer construtor for declarado, o padrao nao e mais gerado.**

```java
class Ponto {
    int x, y;
    // compilador gera: Ponto() {}
}

Ponto p = new Ponto(); // funciona
```

---

## 3) Sobrecarga de construtores

Uma classe pode ter varios construtores com parametros diferentes.

```java
class Retangulo {
    int largura, altura;

    Retangulo() { this(1, 1); }                  // chama o proximo
    Retangulo(int lado) { this(lado, lado); }     // quadrado
    Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
}
```

---

## 4) `this()` - encadeamento de construtores

`this(args)` chama outro construtor **da mesma classe**.
- Deve ser a **primeira instrucao** do construtor.
- Evita duplicacao de logica de inicializacao.

---

## 5) `super()` - construtor da superclasse

`super(args)` chama o construtor da **classe pai**.
- Deve ser a **primeira instrucao** do construtor.
- Se omitido, o compilador insere `super()` implicito (construtor sem args do pai).

```java
class Animal {
    String nome;
    Animal(String nome) { this.nome = nome; }
}

class Cachorro extends Animal {
    String raca;
    Cachorro(String nome, String raca) {
        super(nome);       // inicializa o pai primeiro
        this.raca = raca;
    }
}
```

---

## 6) Pontos criticos para a prova

- Construtor **nao e herdado** por subclasses.
- `this()` e `super()` **nao podem ser usados juntos** no mesmo construtor (ambos exigem ser a primeira linha).
- Classe `abstract` pode ter construtor (chamado via `super()` na subclasse).
- Interface **nao tem** construtor.
- Ordem de execucao na criacao: bloco estatico -> bloco de instancia -> construtor.
