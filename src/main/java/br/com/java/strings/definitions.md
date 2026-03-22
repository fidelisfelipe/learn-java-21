# String, StringBuffer e StringBuilder

---

## 1) `String`

Caracteristicas:
- **Imutavel**: qualquer alteracao cria um novo objeto na heap.
- Armazenada no **String Pool** (area especial da heap).
- Literais com mesmo valor compartilham a mesma referencia no pool.
- `new String("x")` cria sempre um objeto fora do pool.

```java
String a = "Java";               // string pool
String b = "Java";               // mesma referencia do pool
String c = new String("Java");   // objeto novo fora do pool

a == b       // true  (mesma ref no pool)
a == c       // false (ref diferente)
a.equals(c)  // true  (mesmo conteudo)
```

Metodos principais:
| Metodo | Descricao |
|---|---|
| `length()` | Tamanho da string |
| `charAt(i)` | Char na posicao i |
| `indexOf(s)` | Primeira ocorrencia de s |
| `substring(i, j)` | Subtrecho [i, j) |
| `toUpperCase()` / `toLowerCase()` | Conversao de caixa |
| `trim()` | Remove espacos nas extremidades |
| `replace(old, new)` | Substitui ocorrencias |
| `contains(s)` | Verifica se contem s |
| `startsWith(s)` / `endsWith(s)` | Verifica prefixo/sufixo |
| `split(regex)` | Divide em array |
| `equals(s)` | Compara conteudo |
| `compareTo(s)` | Ordem lexicografica |

---

## 2) `StringBuffer`

Caracteristicas:
- **Mutavel**: altera o mesmo objeto na memoria.
- **Sincronizado** (thread-safe): metodos sao `synchronized`.
- Mais lento que `StringBuilder` por causa da sincronizacao.
- Use quando varios threads compartilham a mesma instancia.

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");   // "Hello World"
sb.insert(5, ",");     // "Hello, World"
sb.reverse();          // "dlroW ,olleH"
sb.delete(0, 3);       // remove chars 0 ate 2
```

---

## 3) `StringBuilder`

Caracteristicas:
- **Mutavel** como `StringBuffer`.
- **Nao sincronizado**: mais rapido, mas nao thread-safe.
- Preferido em codigo single-thread para concatenacoes em loop.

```java
StringBuilder sb = new StringBuilder();
sb.append("Java").append(" 21");
String result = sb.toString(); // "Java 21"
```

---

## 4) Tabela comparativa

| Caracteristica | `String` | `StringBuffer` | `StringBuilder` |
|---|---|---|---|
| Mutabilidade | Imutavel | Mutavel | Mutavel |
| Thread-safe | Sim (por imutabilidade) | Sim (sincronizado) | Nao |
| Performance | Lenta em concatenacoes | Moderada | Rapida |
| Uso tipico | Valores fixos, chaves | Ambientes multithread | Loops, single-thread |

---

## 5) Pontos criticos para a prova

- `==` compara **referencia**; `.equals()` compara **conteudo**.
- Literais identicos **compartilham** referencia no pool; `new String()` nao.
- `String` e `final`: nao pode ser estendida.
- `StringBuffer` e `StringBuilder` estendem `AbstractStringBuilder`.
- `concat()` em String cria novo objeto; `append()` em Buffer/Builder nao.
- Concatenar String dentro de loop com `+` e ineficiente (cria varios objetos).
