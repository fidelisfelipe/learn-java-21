package br.com.java.operators;

/**
 * Operador - são símbolos que realizam operações aritiméticas, lógicas, etc  <br />
 *
 * Operando - é o valor ou expressão sobre o qual o operador atua ou limite superior <br />
 *
 * Ex: 5 + 4 - o operador é o + e os operandos são 5 e 4
 *
 * Operadores Aritiméticos
 *
 * Aritimética
 *
 */
public class OperatorsArithmetic {

    public static void main(String[] args) {
            double a = 8.4, b = 4.2;

            // Operadores Aritméticos
            double sum = a + b; // Adição
            double difference = a - b; // Subtração
            double product = a * b; // Multiplicação
            double quotient = a / b; // Divisão
            int remainder = (int) (a % b); // Módulo

            System.out.println("Soma +: " + sum);
            System.out.println("Diferença -: " + difference);
            System.out.println("Produto *: " + product);
            System.out.println("Quociente /: " + quotient);
            System.out.println("Resto %: " + remainder);

            String strA = "Hello ";
            String strB = "World";

            //concatenação de strings usando o operador +
            String concatenatedString = strA + strB; // Concatenação
            System.out.println("Concatenação de strings usando +: " + concatenatedString);

    }
}
