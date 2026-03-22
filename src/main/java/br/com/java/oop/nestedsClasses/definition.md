# Classes Aninhadas (Nested Classes)

---

## 1) O que sao

Classes definidas dentro de outra classe.
O escopo da classe aninhada e limitado ao escopo da classe externa.

```
Classe Externa
├── Static Nested Class     (estatica, nao precisa de instancia externa)
└── Non-static (Inner Class)
    ├── Member Inner Class  (membro de instancia)
    ├── Local Class         (dentro de um metodo/bloco)
    └── Anonymous Class     (sem nome, instanciada inline)
```

---

## 2) Static Nested Class

- Declarada com `static`.
- **Nao precisa** de instancia da classe externa para ser criada.
- **Nao pode** acessar membros de instancia da classe externa.
- Pode acessar membros **estaticos** da externa.

```java
class Externa {
    static int x = 10;
    int y = 20;

    static class Aninhada {
        void exibir() {
            System.out.println(x);  // OK (estatico)
            // System.out.println(y); // ERRO (instancia)
        }
    }
}

Externa.Aninhada obj = new Externa.Aninhada(); // sem instanciar Externa
```

---

## 3) Member Inner Class (nao estatica)

- Associada a uma instancia da classe externa.
- Tem acesso a **todos** os membros da externa (inclusive `private`).
- Para instanciar, precisa de uma instancia da externa.

```java
class Externa {
    private int valor = 42;

    class Interna {
        void exibir() {
            System.out.println(valor); // acessa membro privado da externa
        }
    }
}

Externa e = new Externa();
Externa.Interna i = e.new Interna();
```

---

## 4) Local Class

- Definida dentro de um metodo ou bloco.
- Visivel apenas dentro do bloco onde foi definida.
- Tem acesso a variaveis locais **efetivamente finais** (`effectively final`) do bloco.
- Tem acesso a todos os membros da classe externa.

```java
class Externa {
    void executar() {
        int fator = 3; // effectively final

        class Local {
            int calcular(int x) { return x * fator; }
        }

        Local l = new Local();
        System.out.println(l.calcular(5)); // 15
    }
}
```

---

## 5) Anonymous Class

- Classe sem nome declarada e instanciada ao mesmo tempo.
- Geralmente usada para implementar interfaces ou estender classes de forma rapida.
- Nao pode ter construtor proprio.

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Executando anonimo");
    }
};
r.run();
```

---

## 6) Tabela comparativa

| Tipo | `static` | Precisa de instancia externa | Acessa membros externos |
|---|---|---|---|
| Static Nested | Sim | Nao | So estaticos |
| Member Inner | Nao | Sim | Todos (inclusive `private`) |
| Local Class | Nao | Sim (se nao estatica) | Todos + variaveis effectively final |
| Anonymous | Nao | Sim (se nao estatica) | Todos + variaveis effectively final |

---

## 7) Pontos criticos para a prova

- Inner class **nao pode ter** membros estaticos (exceto constantes `static final`).
- Static nested class pode ter membros estaticos.
- `Local Class` e `Anonymous Class` so acessam variaveis locais que sejam **effectively final**.
- Anonymous class e usada como alternativa compacta a lambdas (quando a interface tem mais de um metodo).
- Lambda substitui anonymous class apenas para **interfaces funcionais** (1 metodo abstrato).
