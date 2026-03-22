# Documentacoes de Estudo - Java SE 21 (1Z0-830)

Trilha organizada por blocos de estudo com links diretos para cada arquivo de definicao.

---

## Ordem recomendada de estudo

```
1. Fundamentos → 2. Operadores → 3. Arrays → 4. Controle de Fluxo
→ 5. Metodos → 6. OOP Conceitos → 7. OOP Pratica
→ 8. APIs Essenciais → 9. Collections → 10. Evolucao Java 8-21
→ 11. Revisao com Simulado
```

---

## 1) Fundamentos

| Arquivo | Conteudo |
|---|---|
| [`introduction.md`](introduction.md) | Conceitos base, JDK/JRE/JVM, ferramentas, arquitetura |
| [`basic-java.md`](basic-java.md) | Entrada/saida, comentarios, tipos primitivos, variaveis, conversoes |
| [`operators.md`](operators.md) | Aritmeticos, logicos, bitwise, precedencia |

---

## 2) Arrays

| Arquivo | Conteudo |
|---|---|
| `src/main/java/br/com/java/arrays/` | Unidimensional, bidimensional, tridimensional, busca binaria |

---

## 3) Controle de Fluxo e Metodos

| Arquivo | Conteudo |
|---|---|
| `src/main/java/br/com/java/controlFlow/` | if/else, ternario, for, while, do-while, switch, label loops |
| `src/main/java/br/com/java/methods/` | Declaracao, tipos, retorno, varargs, overload |

---

## 4) OOP - Conceitos

| Arquivo | Conteudo |
|---|---|
| [`src/main/java/br/com/java/conceptsoo/concepts.md`](src/main/java/br/com/java/conceptsoo/concepts.md) | Classe/Objeto, Stack/Heap, Access Modifiers, pilares OOP, convencoes |
| [`src/main/java/br/com/java/oop/constructor/definitions.md`](src/main/java/br/com/java/oop/constructor/definitions.md) | Construtor padrao, sobrecarga, this(), super() |
| [`src/main/java/br/com/java/oop/packages/definition.md`](src/main/java/br/com/java/oop/packages/definition.md) | Package, import, import static, conflito de nomes |
| [`src/main/java/br/com/java/oop/statics/definition.md`](src/main/java/br/com/java/oop/statics/definition.md) | Variavel, metodo, bloco e classe aninhada estatica |
| [`src/main/java/br/com/java/oop/nestedsClasses/definition.md`](src/main/java/br/com/java/oop/nestedsClasses/definition.md) | Static Nested, Inner, Local e Anonymous Class |
| [`src/main/java/br/com/java/oop/innerClasses/definition.md`](src/main/java/br/com/java/oop/innerClasses/definition.md) | Foco em Local Classes (effectively final, parametros de metodo) |

---

## 5) OOP - Pratica (Heranca, Override, Polimorfismo)

| Arquivo | Conteudo |
|---|---|
| [`src/main/java/br/com/java/oopj/definitions.md`](src/main/java/br/com/java/oopj/definitions.md) | Heranca, tipos de heranca, override, method hiding, this/super, final |

---

## 6) APIs Essenciais

| Arquivo | Conteudo |
|---|---|
| [`src/main/java/br/com/java/wrappers/definition.md`](src/main/java/br/com/java/wrappers/definition.md) | Wrappers, autoboxing/unboxing, cache de Integer, metodos uteis |
| [`src/main/java/br/com/java/strings/definitions.md`](src/main/java/br/com/java/strings/definitions.md) | String (pool, imutabilidade), StringBuffer, StringBuilder, comparativo |
| [`src/main/java/br/com/java/collections/definitions.md`](src/main/java/br/com/java/collections/definitions.md) | List, Set, Queue, Map, tabela comparativa, quando usar cada uma |

---

## 7) Evolucao da Linguagem

| Arquivo | Conteudo |
|---|---|
| [`DELTAJava8to21.md`](DELTAJava8to21.md) | Recursos modernos: lambda, streams, records, sealed classes, var, pattern matching |

---

## 8) Revisao e Pratica

| Arquivo | Conteudo |
|---|---|
| [`mock-test.md`](mock-test.md) | Simulado e questoes de revisao |

---

## Dicas de uso

1. Leia o `definitions.md` de cada topico antes de ver o codigo.
2. Para cada secao, escreva 2-3 exemplos proprios no IntelliJ.
3. Anote duvidas direto no arquivo `.md` como item de lista.
4. Ao terminar um bloco, faca pelo menos 5 questoes do simulado sobre ele.
5. Revise sempre a secao **"Pontos criticos para a prova"** de cada definition.
