package br.com.java.operators;

/**
 * Unary Operators - Operadores Unários
 *
 * Operadores unários são operadores que operam em um único operando.
 * Eles podem ser usados para realizar operações como incremento, decremento, negação lógica, etc.
 *
 * Exemplos de operadores unários incluem:
 *
 * - Incremento (++) - aumenta o valor de uma variável em 1.
 * - Decremento (--) - diminui o valor de uma variável em 1.
 * - Negação lógica (!) - inverte o valor booleano de uma expressão.
 * - Negação aritmética (-) - inverte o sinal de um número.
 *
 */
public class OperatorsUnary {

    public static void main(String[] args) {
        double number = 7.6;
        boolean ischeck = true;

        // Operadores unários
        System.out.println("Valor original de number: " + number);
        System.out.println("Valor original de ischeck: " + ischeck);

        // Positivo
        System.out.println("+number: " + +number); // O operador + não altera o valor, apenas reafirma que é positivo

        // Negação aritmética
        System.out.println("-number: " + -number); // O operador - inverte o sinal do número, tornando-o negativo

        // Incremento
        System.out.println("++number: " + ++number); // O operador ++ incrementa o valor de number em 1 e retorna o valor incrementado
        System.out.println("--number: " + --number); // O operador -- decrementa o valor de number em 1 e retorna o valor decrementado

        // Negação lógica
        System.out.println("!ischeck: " + !ischeck); // O operador ! inverte o valor booleano de ischeck, tornando-o false

        double result = 4.7;
        System.out.println("result: " + result);
        System.out.println("result++: " + result++); // O operador result++ retorna o valor atual de result e depois incrementa o valor de result em 1
        System.out.println("result: " + result); // O valor de result agora é 5.7, pois foi incrementado após a operação result++
        System.out.println("result--: " + result--); // O operador result-- retorna o valor atual de result e depois decrementa o valor de result em 1
        System.out.println("result: " + result); // O valor de result agora é
        // 4.7, pois foi decrementado após a operação result--





    }
}
