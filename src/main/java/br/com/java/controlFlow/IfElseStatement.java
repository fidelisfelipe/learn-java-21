package br.com.java.controlFlow;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String [] init){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero não par");
        }

        sc.close();

    }

}
