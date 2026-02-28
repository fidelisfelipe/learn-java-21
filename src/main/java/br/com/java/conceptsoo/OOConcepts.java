package br.com.java.conceptsoo;

public class OOConcepts {
    /**
     * O que fica na Stack?
     *
     * Frames de execução
     *
     * Variáveis locais
     *
     * Parâmetros de métodos
     *
     * Referências para objetos
     *
     * Exemplo:
     *
     * Person p = new Person();
     *
     * p (referência) → Stack
     *
     * objeto Person → Heap
     *
     * atributos da Person → Heap (dentro do objeto)
     *
     */

    /**
     * Segundo a especificação:
     *
     * | Elemento              | Onde fica |
     * | --------------------- | --------- |
     * | Objeto                | Heap      |
     * | Variável de instância | Heap      |
     * | Variável local        | Stack     |
     * | Referência            | Stack     |
     *
     * Logo: Instance variables and objects in heap.
     *
     * Todos os objetos são alocados na Heap
     * Arrays também são objetos → ficam na Heap
     *
     * “All class instances and arrays are allocated on the heap.”
     * (JVMS §2.5.3 – Heap)
     */
}
