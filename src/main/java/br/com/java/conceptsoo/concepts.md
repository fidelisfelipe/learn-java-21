# OOP - Conceitos Fundamentais

---

## 1) O que e OOP

Paradigma de programacao baseado em objetos que representam entidades do mundo real.
Pilares: **Encapsulamento**, **Heranca**, **Polimorfismo**, **Abstracao**.

---

## 2) Classe e Objeto

- **Classe**: molde/template que define campos e comportamentos.
- **Objeto**: instancia concreta de uma classe; ocupa espaco na heap.

```java
class Carro {          // classe (molde)
    String modelo;
    int ano;
    void acelerar() { System.out.println("Acelerando!"); }
}

Carro c = new Carro(); // objeto (instancia na heap)
c.modelo = "Civic";
```

---

## 3) Stack e Heap

| | Stack | Heap |
|---|---|---|
| O que armazena | Variaveis locais, referencias, chamadas de metodo | Objetos, arrays |
| Gerenciamento | LIFO automatico | Garbage Collector |
| Escopo | Por thread (cada thread tem sua stack) | Compartilhado entre todas as threads |
| Erro de esgotamento | `StackOverflowError` | `OutOfMemoryError` |
| Tempo de vida | Ate o metodo retornar | Ate o GC coletar |

```
Stack (por thread)          Heap (compartilhado)
┌─────────────────┐         ┌──────────────────────┐
│ main()          │         │  Carro@0x100          │
│  c (referencia) ─────────>│    modelo = "Civic"   │
│  x = 10 (prim.) │         │    ano = 2024          │
└─────────────────┘         └──────────────────────┘
```

---

## 4) Modificadores de Acesso

| Modificador | Mesma Classe | Mesmo Pacote | Subclasse | Fora do Pacote |
|---|:---:|:---:|:---:|:---:|
| `private` | Sim | Nao | Nao | Nao |
| *(default)* | Sim | Sim | Nao | Nao |
| `protected` | Sim | Sim | Sim | Nao |
| `public` | Sim | Sim | Sim | Sim |

Regra mnemonica: **private < default < protected < public** (crescente em visibilidade).

---

## 5) Pilares do OOP

### Encapsulamento
- Ocultar detalhes internos; expor apenas o necessario via getters/setters.
- Campos `private` + metodos `public` de acesso.

### Heranca
- Subclasse reutiliza campos e metodos da superclasse (`extends`).
- Java: heranca simples para classes; multipla para interfaces.

### Polimorfismo
- Mesma interface, comportamentos diferentes.
- **Em tempo de compilacao**: sobrecarga (overload) — mesmo nome, parametros diferentes.
- **Em tempo de execucao**: sobrescrita (override) — subclasse redefine metodo do pai.

### Abstracao
- Expor o *o que* e ocultar o *como*.
- Implementada com `abstract class` e `interface`.

---

## 6) Convencoes de nomenclatura Java

| Elemento | Convencao | Exemplo |
|---|---|---|
| Classe / Interface | PascalCase | `ContaBancaria` |
| Metodo / Variavel | camelCase | `calcularSaldo` |
| Constante | UPPER_SNAKE_CASE | `MAX_VALOR` |
| Pacote | minusculas | `br.com.empresa` |

---

## 7) Pontos criticos para a prova

- `private` nao e herdado, mas existe na memoria (acessivel via metodos `protected/public`).
- `protected` e visivel para subclasses **mesmo em pacotes diferentes**.
- Variavel local nao inicializada causa **erro de compilacao**; campo nao inicializado recebe valor padrao.
- Valores padrao: `int/long/short/byte = 0`, `float/double = 0.0`, `boolean = false`, `char = '\u0000'`, objeto = `null`.
- Toda classe deriva de `Object` (metodos: `toString`, `equals`, `hashCode`, `getClass`).
