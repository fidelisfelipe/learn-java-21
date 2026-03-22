# Wrapper Classes, Autoboxing e Unboxing

---

## 1) O que sao Wrapper Classes

Cada tipo primitivo tem uma classe correspondente que o "embrulha" em um objeto.
Necessarias para usar primitivos em contextos que exigem objetos (ex.: Collections).

| Primitivo | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

---

## 2) Conversao manual (antes do Java 5)

```java
// Primitivo -> Wrapper
Integer obj1 = new Integer(20);        // construtor (deprecated desde Java 9)
Integer obj2 = Integer.valueOf(20);    // metodo estatico (preferido)

// Wrapper -> Primitivo
int val = obj2.intValue();
```

---

## 3) Autoboxing e Unboxing (Java 5+)

O compilador converte automaticamente entre primitivo e wrapper.

```java
// Autoboxing: primitivo -> wrapper
Integer a = 5;           // compilador faz Integer.valueOf(5)

// Unboxing: wrapper -> primitivo
int b = new Integer(5);  // compilador faz .intValue()

// Em collections (so aceitam objetos)
List<Integer> list = new ArrayList<>();
list.add(10);  // autoboxing automatico
int x = list.get(0); // unboxing automatico
```

---

## 4) Cache de Integer (-128 a 127)

Integer usa cache para valores entre -128 e 127:

```java
Integer x = 127;
Integer y = 127;
x == y   // true  (mesma ref em cache)

Integer p = 128;
Integer q = 128;
p == q   // false (fora do cache, objetos distintos)
p.equals(q) // true (mesmo conteudo)
```

---

## 5) Metodos uteis das Wrappers

```java
Integer.parseInt("42")        // String -> int
Integer.toBinaryString(10)    // "1010"
Integer.toHexString(255)      // "ff"
Integer.toOctalString(8)      // "10"
Integer.MAX_VALUE             // 2147483647
Integer.MIN_VALUE             // -2147483648
Double.parseDouble("3.14")    // String -> double
Character.isDigit('5')        // true
Character.isLetter('A')       // true
Character.toUpperCase('a')    // 'A'
```

---

## 6) Pontos criticos para a prova

- `==` entre Wrappers compara **referencia** (cuidado com valores fora do cache de Integer).
- `.equals()` sempre compara **valor**.
- Unboxing de `null` lanca `NullPointerException`.
- Construtores de Wrapper (ex.: `new Integer()`) sao **deprecated** desde Java 9; use `valueOf()`.
- Autoboxing tem custo de performance; evitar em loops criticos.
