package br.com.java.controlFlow;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String... outher){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = 1;

        int c = a == b ? a++ : b--;

        System.out.printf("a: %s \nb: %s\nc: %s", a, b, c);

        sc.close();

    }

}
