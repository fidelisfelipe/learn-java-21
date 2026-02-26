package br.com.java.controlFlow;

public class ForeachLoopStatement {

    public static void main(String[] args) {
        char letras[] = {
                'a', 'b', 'c'
        };

        for (int i = 0; i< letras.length; i++){
            System.out.print(letras[i]);
        }
        System.out.println();
        for(char letra : letras){
            System.out.print(letra);
        }
        System.out.println();
        String filme = "Titanic";

        for (char letra : filme.toCharArray()){
            System.out.print(letra);
        }
    }

}
