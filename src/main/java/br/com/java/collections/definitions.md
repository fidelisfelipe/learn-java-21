# Java Collections Framework - Definicoes e Diferencas

Este arquivo resume as principais interfaces de colecoes em Java e as implementacoes mais usadas.

## 1) Interface `Collection<E>`

- Interface base para grupos de elementos.
- Operacoes comuns: `add`, `remove`, `contains`, `size`, `isEmpty`, `clear`, `iterator`.
- Nao define acesso por indice.

As principais subinterfaces sao `List`, `Set` e `Queue`.

---

## 2) `List<E>`

Caracteristicas:
- Mantem ordem de insercao.
- Permite elementos duplicados.
- Permite acesso por indice (`get(i)`).
- Pode aceitar `null` (depende da implementacao).

Implementacoes principais:

### `ArrayList`
- Baseado em array dinamico.
- Leitura por indice muito rapida (`O(1)`).
- Insercoes/remocoes no meio podem custar mais (`O(n)`).
- Melhor para cenarios com muitas leituras.

### `LinkedList`
- Lista duplamente encadeada.
- Insercoes/remocoes nas extremidades sao eficientes.
- Acesso por indice e mais lento (`O(n)`).
- Tambem implementa `Deque`.

### `Vector` (legado)
- Parecido com `ArrayList`, mas sincronizado.
- Geralmente evitado em codigo moderno (prefira classes concorrentes quando necessario).

---

## 3) `Set<E>`

Caracteristicas:
- Nao permite elementos duplicados.
- Nao possui acesso por indice.
- Uso comum: garantir unicidade.

Implementacoes principais:

### `HashSet`
- Nao garante ordem.
- Operacoes basicas geralmente `O(1)` medio.
- Permite um `null`.

### `LinkedHashSet`
- Mantem ordem de insercao.
- Levemente mais custo/memoria que `HashSet`.
- Bom quando voce quer unicidade + ordem previsivel.

### `TreeSet`
- Mantem elementos ordenados (ordem natural ou `Comparator`).
- Operacoes tipicas `O(log n)`.
- Nao permite `null` na ordenacao natural.
- Implementa `NavigableSet` (metodos como `first`, `last`, `headSet`, `tailSet`, `subSet`).

---

## 4) `Queue<E>` e `Deque<E>`

Caracteristicas:
- Estruturas orientadas a fila.
- `Queue`: geralmente FIFO.
- `Deque`: fila de dupla extremidade (inicio e fim).

Implementacoes principais:

### `PriorityQueue`
- Ordena por prioridade (ordem natural/comparator), nao por insercao.
- Operacoes principais em `O(log n)` para insercao/remocao do topo.

### `ArrayDeque`
- Implementacao eficiente de `Deque`.
- Muito usada para pilha (`push/pop`) e fila (`offer/poll`).
- Nao permite `null`.

### `LinkedList`
- Tambem pode ser usada como `Queue`/`Deque`.

---

## 5) `Map<K, V>` (nao herda de `Collection`)

Embora faca parte do framework de colecoes, `Map` e separado porque trabalha com pares chave-valor.

Caracteristicas:
- Chaves unicas.
- Valores podem repetir.
- Operacoes: `put`, `get`, `remove`, `containsKey`.

Implementacoes principais:

### `HashMap`
- Nao garante ordem.
- Muito usado para acesso rapido por chave (`O(1)` medio).
- Permite uma chave `null` e varios valores `null`.

### `LinkedHashMap`
- Mantem ordem de insercao (ou acesso, se configurado).
- Bom para iteracao previsivel e caches simples.

### `TreeMap`
- Mantem chaves ordenadas.
- Operacoes em `O(log n)`.
- Nao permite chave `null` (ordem natural).

### `Hashtable` (legado)
- Sincronizado e antigo.
- Evitar em novos projetos.

---

## 6) Tabela rapida de comparacao

| Estrutura | Ordem | Duplicados | `null` | Custo medio |
|---|---|---|---|---|
| `ArrayList` | Insercao | Sim | Sim | `get O(1)`, inserir/remover meio `O(n)` |
| `LinkedList` | Insercao | Sim | Sim | acesso por indice `O(n)` |
| `HashSet` | Nao garante | Nao | 1 elemento `null` | `O(1)` medio |
| `LinkedHashSet` | Insercao | Nao | 1 elemento `null` | `O(1)` medio |
| `TreeSet` | Ordenada | Nao | Nao (ordem natural) | `O(log n)` |
| `HashMap` | Nao garante | Chave: nao / Valor: sim | 1 chave `null` | `O(1)` medio |
| `LinkedHashMap` | Insercao/Acesso | Chave: nao / Valor: sim | 1 chave `null` | `O(1)` medio |
| `TreeMap` | Chaves ordenadas | Chave: nao / Valor: sim | Chave `null`: nao | `O(log n)` |

---

## 7) Quando usar cada uma (regra pratica)

- Use `ArrayList` quando houver muitas leituras e pouco custo com insercao no meio.
- Use `LinkedList` quando houver muitas operacoes nas extremidades.
- Use `HashSet` para remover duplicidade sem precisar de ordem.
- Use `LinkedHashSet` para unicidade com ordem de insercao.
- Use `TreeSet` quando precisar de dados sempre ordenados.
- Use `HashMap` para busca rapida por chave.
- Use `LinkedHashMap` quando a ordem de iteracao importa.
- Use `TreeMap` quando as chaves precisam ficar ordenadas.

---

## 8) Interfaces concorrentes (visao rapida)

Para multithreading, prefira classes do pacote `java.util.concurrent` em vez de classes legadas sincronizadas:
- `ConcurrentHashMap`
- `CopyOnWriteArrayList`
- `ConcurrentLinkedQueue`
- `BlockingQueue` (ex.: `LinkedBlockingQueue`)

Essas estruturas oferecem melhor desempenho e semantica adequada para concorrencia.

