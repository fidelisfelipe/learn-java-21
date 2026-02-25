package br.com.java.arrays;

/**
 * Arrays são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo.
 * Eles são usados para armazenar e manipular conjuntos de dados relacionados.
 * Os arrays são objetos que podem ser criados para armazenar tipos primitivos ou objetos.
 */
public class ArraysSimple {

    //declarando

    int[] arrayName1; //isso é declaraćão valido
    int arrayName2 []; //isso é uma declaraćão válido

    public static void main(String[] args) {

        //quando usamos o tamanho nao podemos inicializar ao mesmo tempo
        //ou declara com tamanho fixo e atribui valores
        //ou declara com tamanho indefinido e atribui valores
        //int ages[] = new int [4] {1,2,3,4};

        int numberArray[];

        numberArray = new int [5]; //criando um array de inteiros com 5 elementos

        numberArray[0] = 1;

        numberArray[4] = 2;

        System.out.println(java.util.Arrays.toString(numberArray));

        indiceNaoExiste(numberArray);

        int outherArray[] = {(int)1.1, 2, 3, 4, 5}; //criando e inicializando um array de inteiros com 5 elementos

        System.out.println(java.util.Arrays.toString(outherArray));

        Object objectArray[] = {1, "Hello", 3.14, true}; //criando e inicializando um array de objetos com diferentes tipos de elementos

        System.out.println(java.util.Arrays.toString(objectArray));

    }

    private static void indiceNaoExiste(int[] numberArray) {
        try {
            numberArray[5] = 3; //tentando acessar um índice que não existe, isso vai lançar uma exceção ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: Índice fora dos limites do array. " + e.getMessage());
        }
    }
}
