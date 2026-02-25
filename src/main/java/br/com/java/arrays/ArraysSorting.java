package br.com.java.arrays;

public class ArraysSorting {

    public static void main(String args[]) {
        //sorting arrays
        int unsortedArray[] = {5, 2, 8, 1, 3};

        System.out.println(java.util.Arrays.toString(unsortedArray));

        java.util.Arrays.sort(unsortedArray); //ordenando o array usando o método sort da classe Arrays

        System.out.println(java.util.Arrays.toString(unsortedArray));

        char charArray[] = {'z', 'a', 'A', 'b', 'B'};

        System.out.println(java.util.Arrays.toString(charArray));

        java.util.Arrays.sort(charArray); //ordenando o array de caracteres usando o método sort da classe Arrays

        System.out.println(java.util.Arrays.toString(charArray));

        String stringArray[] = {"banana", "apple", "grape", "orange", "kiwi"};

        System.out.println(java.util.Arrays.toString(stringArray));

        java.util.Arrays.sort(stringArray); //ordenando o array de strings usando o método sort da classe Arrays

        System.out.println(java.util.Arrays.toString(stringArray));

        String stringArray2[] = {"3", "300", "20", "35", "37", "4", "27", "1"};

        System.out.println(java.util.Arrays.toString(stringArray2));

        java.util.Arrays.sort(stringArray2); //ordenando o array de strings usando o método sort da classe Arrays

        System.out.println(java.util.Arrays.toString(stringArray2));

    }
}
