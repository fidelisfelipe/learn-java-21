package br.com.java.arrays;

public class ArraysSearching {

    public static void main(String... args) {

        buscaUmElementoExistente();
        buscaUmElementoInexistente();

    }

    private static void buscaUmElementoExistente() {
        int array[] = {1, 2, 4, 3, 5};// array não ordenado

        int indexOf3 = java.util.Arrays.binarySearch(array, 3);
        System.out.println("Índice do elemento 3: " + indexOf3);

        java.util.Arrays.sort(array); // ordenando o array

        indexOf3 = java.util.Arrays.binarySearch(array, 3);

        System.out.println("Índice do elemento 3 após ordenação: " + indexOf3);
    }

    private static void buscaUmElementoInexistente() {
        int array[] = {1, 2, 4, 3, 5};// array não ordenado

        int indexOf6 = java.util.Arrays.binarySearch(array, 6);
        System.out.println("Índice do elemento 6: " + indexOf6);

        java.util.Arrays.sort(array); // ordenando o array

        indexOf6 = java.util.Arrays.binarySearch(array, 6);

        System.out.println("Índice do elemento 6 após ordenação: " + indexOf6);
    }

}
