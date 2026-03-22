# Packages e Import

---

## 1) O que e um package

Mecanismo para organizar classes relacionadas em grupos (similar a pastas).
Evita conflitos de nomes entre classes de bibliotecas diferentes.

```java
package br.com.meuprojeto.model; // primeira linha do arquivo (obrigatoria se usado)

public class Produto { }
```

Regras:
- Declaracao com `package` deve ser a **primeira linha de codigo** do arquivo.
- Apenas **uma declaracao** por arquivo.
- Se omitida, a classe pertence ao **pacote padrao** (sem nome) - evitar em producao.
- Nome convencional: **dominio invertido** em minusculas (`com.empresa.modulo`).

---

## 2) Tipos de pacotes

| Tipo | Descricao | Exemplos |
|---|---|---|
| Built-in | Fornecidos pelo JDK | `java.lang`, `java.util`, `java.io` |
| User-defined | Criados pelo desenvolvedor | `br.com.app.model` |

---

## 3) Import

Permite referenciar classes de outros pacotes sem o nome completo (fully qualified name).

```java
import java.util.ArrayList;         // importa apenas ArrayList
import java.util.*;                  // importa todas as classes de java.util
import static java.lang.Math.PI;    // importa membro estatico
```

Regras importantes:
- `java.lang` e importado **implicitamente** (String, System, Math, etc.).
- `import java.util.*` nao importa sub-pacotes como `java.util.concurrent`.
- Import estatico (`import static`) permite usar membros estaticos sem prefixo de classe.

---

## 4) Nome totalmente qualificado (Fully Qualified Name)

Pode-se referenciar qualquer classe sem `import` usando o nome completo:

```java
java.util.Date data = new java.util.Date();
```

Util quando ha conflito de nomes entre pacotes:

```java
java.util.Date d1 = new java.util.Date();
java.sql.Date  d2 = new java.sql.Date(0);
```

---

## 5) Pontos criticos para a prova

- `package` deve ser a primeira instrucao (antes de `import` e da classe).
- `import` nao "inclui codigo": apenas informa ao compilador onde encontrar a classe.
- `java.lang.*` e sempre importado automaticamente.
- `import pkg.*` nao cobre sub-pacotes.
- Conflito de nomes: importe apenas uma e use o nome completo para a outra.
- Modificador `public` da classe deve combinar com o nome do arquivo.
