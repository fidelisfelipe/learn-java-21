package br.com.java.controlFlow;

import java.util.Scanner;

public class WhileLoopStatement {
    public static void main(String[] args) {

        int i = 0;

        String []  animais = {"gato", "cachorro", "periquito"};

        while(i < animais.length){
            System.out.println(animais[i++]);
        }

        //fatorial

        //n! = n*(n-1)*(n-2)*...*1
        //5! = 5 * 4 * 3 * 2 * 1 = 120
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number < 0){
            System.out.println(number + "! is undefined");
        } else if (number == 0 || number == 1){
            System.out.println(number + "! = 1");
        } else{
            long result = 1;
            int enterednumber = number;
            while(number > 0){
                result *= number;
                number--;
            }
            System.out.println(enterednumber + "! = "+ result);
        }
        sc.close();

    }
}
