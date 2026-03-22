# Static em Java

---

## 1) O que significa `static`

Membro que **pertence a classe**, nao ao objeto. Compartilhado por todas as instancias.
Pode ser: variavel, metodo, bloco e classe aninhada.

---

## 2) Variavel estatica

```java
class Contador {
    static int total = 0; // compartilhado por todos os objetos

    Contador() { total++; }
}

Contador a = new Contador(); // total = 1
Contador b = new Contador(); // total = 2
System.out.println(Contador.total); // 2
```

- Alocada **uma unica vez** na memoria quando a classe e carregada.
- Acessivel pelo nome da classe: `Classe.campo`.

---

## 3) Metodo estatico

```java
class MathUtil {
    static int dobro(int x) { return x * 2; }
}

MathUtil.dobro(5); // 10 - sem instanciar a classe
```

Restricoes:
- **Nao pode** acessar membros de instancia (`this` nao existe).
- **Nao pode** ser sobrescrito (override), apenas ocultado (hiding).
- Pode ser chamado antes de qualquer objeto existir.

---

## 4) Bloco estatico

Executado **uma unica vez** quando a classe e carregada pela JVM.
Usado para inicializacoes complexas de variaveis estaticas.

```java
class Config {
    static String url;

    static {
        // executa ao carregar a classe
        url = System.getenv("DB_URL");
        if (url == null) url = "localhost:5432";
    }
}
```

---

## 5) Classe aninhada estatica (Static Nested Class)

```java
class Externo {
    static class Interno {
        void exibir() { System.out.println("Interno estatico"); }
    }
}

Externo.Interno obj = new Externo.Interno(); // nao precisa de instancia externa
```

- Nao tem acesso a membros de instancia da classe externa.
- Tem acesso a membros **estaticos** da classe externa.

---

## 6) Import estatico

```java
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

double area = PI * sqrt(4); // sem prefixo Math.
```

---

## 7) Pontos criticos para a prova

- Metodo estatico **nao pode** usar `this` ou `super`.
- Metodo de instancia **pode** acessar membros estaticos.
- `static` em interface (Java 8+): metodo util da propria interface, nao herdado por implementacoes.
- Bloco estatico roda **antes** do construtor.
- Ordem de inicializacao: bloco estatico -> bloco de instancia -> construtor.
