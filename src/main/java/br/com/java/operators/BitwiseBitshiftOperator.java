package br.com.java.operators;

/**
 * Operadores Bitwise e Bitshift
 *
 * Operadores bitwise são usados para realizar operações em nível de bit em números inteiros.
 * Eles operam diretamente nos bits dos operandos, permitindo manipulações eficientes de dados binários.
 *
 * Operadores bitwise comuns incluem:
 *
 * - AND bitwise (&): Retorna um bit 1 se ambos os bits correspondentes dos operandos forem 1, caso contrário, retorna 0.
 * - OR bitwise (|): Retorna um bit 1 se pelo menos um dos bits correspondentes dos operandos for 1, caso contrário, retorna 0.
 * - XOR bitwise (^): Retorna um bit 1 se os bits correspondentes dos operandos forem diferentes, caso contrário, retorna 0.
 * - NOT bitwise (~): Inverte os bits do operando, transformando 0 em 1 e 1 em 0.
 * - Shift left (<<): Desloca os bits do operando para a esquerda, preenchendo os bits à direita com zeros.
 * - Shift right (>>): Desloca os bits do operando para a direita, preenchendo os bits à esquerda com o bit de sinal (0 para números positivos e 1 para números negativos).
 * - Unsigned shift right (>>>): Desloca os bits do operando para a direita, preenchendo os bits à esquerda com zeros, independentemente do bit de sinal.
 *
 */
public class BitwiseBitshiftOperator {

    public static void main(String[] args) {
        //Bitwise AND (&)
        int num1 = 8; // Em binário: 1000
        int num2 = 9; // Em binário: 0101

        System.out.println("Número 1 (binário): " + Integer.toBinaryString(num1));
        System.out.println("Número 2 (binário): " + Integer.toBinaryString(num2));

        System.out.println("Número 1 & Número 2 (binário): " + Integer.toBinaryString(num1 & num2));
        System.out.println("Número 1 & Número 2 (decimal): " + (num1 & num2));

        //Bitwise OR (|)
        System.out.println("Número 1 | Número 2 (binário): " + Integer.toBinaryString(num1 | num2));
        System.out.println("Número 1 | Número 2 (decimal): " + (num1 | num2));

        //Bitwise XOR (^)
        System.out.println("Número 1 ^ Número 2 (binário): " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("Número 1 ^ Número 2 (decimal): " + (num1 ^ num2));

        //Bitwise NOT (~)
        System.out.println("~Número 1 (binário): " + Integer.toBinaryString(~num1));
        System.out.println("~Número 1 (decimal): " + (~num1));

        //Shift left (<<)
        System.out.println("Número 1 << 2 (binário): " + Integer.toBinaryString(num1 << 2));
        System.out.println("Número 1 << 2 (decimal): " + (num1 << 2));

        //Shift right (>>)
        System.out.println("Número 1 >> 2 (binário): " + Integer.toBinaryString(num1 >> 2));
        System.out.println("Número 1 >> 2 (decimal): " + (num1 >> 2));

        //Unsigned shift right (>>>)
        System.out.println("Número 1 >>> 2 (binário): " + Integer.toBinaryString(num1 >>> 2));
        System.out.println("Número 1 >>> 2 (decimal): " + (num1 >>> 2));

    }
}
