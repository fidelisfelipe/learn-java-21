# Java OOP - Heranca, Override, super/this e final

---

## 1) Heranca (Inheritance)

Permite que uma classe (subclasse) reutilize campos e metodos de outra (superclasse).

```java
class Animal {
    String nome;
    void comer() { System.out.println(nome + " comendo"); }
}

class Cachorro extends Animal {
    void latir() { System.out.println("Au!"); }
}

Cachorro d = new Cachorro();
d.nome = "Rex";
d.comer();  // herdado de Animal
d.latir();  // proprio
```

Regras:
- Java suporta **heranca simples** entre classes (`extends` apenas uma).
- Toda classe que nao estende nada estende implicitamente `Object`.
- Subclasse herda membros `public` e `protected` do pai.
- Membros `private` **nao sao herdados** (existem na memoria, mas nao sao acessiveis diretamente).

---

## 2) Tipos de Heranca

| Tipo | Suportado em classes | Suportado em interfaces |
|---|---|---|
| Single | Sim | Sim |
| Multilevel (A -> B -> C) | Sim | Sim |
| Hierarchical (A <- B, A <- C) | Sim | Sim |
| Multiple (B extends A, C) | **Nao** | **Sim** |
| Hybrid | **Nao** | **Sim** |

---

## 3) Sobrescrita de Metodos (Method Override)

Redefinir na subclasse um metodo herdado com **mesma assinatura e tipo de retorno**.

```java
class Animal {
    void emitirSom() { System.out.println("Som generico"); }
}

class Gato extends Animal {
    @Override
    void emitirSom() { System.out.println("Miau"); } // override
}
```

Regras:
- `@Override` e opcional mas recomendado (erro de compilacao se a assinatura estiver errada).
- Subclasse pode **ampliar** o acesso (ex.: `protected` -> `public`), mas **nao pode restringir**.
- Tipo de retorno pode ser **covariante** (subtipo do retorno original).
- Nao e possivel sobrescrever metodos `static`, `final` ou `private`.

---

## 4) Ocultacao de Metodos Estaticos (Method Hiding)

Metodo estatico na subclasse com mesma assinatura **oculta** (nao sobrescreve) o da superclasse.

```java
class Pai   { static void msg() { System.out.println("Pai"); } }
class Filho extends Pai { static void msg() { System.out.println("Filho"); } }

Pai obj = new Filho();
obj.msg(); // "Pai" (resolucao em tempo de compilacao, nao polimorfismo)
```

---

## 5) `this` e `super`

| Palavra-chave | Uso |
|---|---|
| `this` | Referencia a instancia atual da classe |
| `this.campo` | Acessa campo da propria classe |
| `this.metodo()` | Chama metodo da propria classe |
| `this()` | Chama outro construtor da propria classe (1a linha) |
| `super` | Referencia a instancia da superclasse |
| `super.campo` | Acessa campo da superclasse (quando ocultado) |
| `super.metodo()` | Chama metodo sobrescrito da superclasse |
| `super()` | Chama construtor da superclasse (1a linha) |

---

## 6) `final`

| Contexto | Efeito |
|---|---|
| `final class` | Classe nao pode ser estendida (`extends`) |
| `final method` | Metodo nao pode ser sobrescrito (`override`) |
| `final variable` | Variavel so pode ser atribuida uma vez |

```java
final class Imutavel { }             // nao pode ter subclasse
class Base { final void executar() { } } // nao pode ser sobrescrito

final int MAX = 100;                 // constante local
```

---

## 7) Pontos criticos para a prova

- `String` e `final` (nao pode ser estendida).
- Construtor **nao e herdado** nem sobrescrito.
- Override exige **mesma assinatura**; diferente e sobrecarga (overload), nao override.
- `super()` deve ser **primeira instrucao** do construtor se usado.
- Metodo `static` **nao participa** de polimorfismo em tempo de execucao.
- Variavel de instancia **nao sofre** polimorfismo (resolucao em tempo de compilacao).
