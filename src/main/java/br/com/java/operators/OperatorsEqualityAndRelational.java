package br.com.java.operators;

/**
 * Operadores de Igualdade e Relacionais
 *
 * Operadores de igualdade e relacionais são usados para comparar valores e expressões, retornando um valor booleano (true ou false) com base na comparação.
 *
 * Operadores de igualdade:
 * - Igual a (==): Verifica se dois valores são iguais.
 * - Diferente de (!=): Verifica se dois valores são diferentes.
 *
 * Operadores relacionais:
 * - Maior que (>): Verifica se o valor à esquerda é maior que o valor à direita.
 * - Menor que (<): Verifica se o valor à esquerda é menor que o valor à direita.
 * - Maior ou igual a (>=): Verifica se o valor à esquerda é maior ou igual ao valor à direita.
 * - Menor ou igual a (<=): Verifica se o valor à esquerda é menor ou igual ao valor à direita.
 *
 */
public class OperatorsEqualityAndRelational {

    public static void main(String[] args) {
        int a = 2, b = 5;

        // Operadores de igualdade
        boolean isEqual = (a == b); // Verifica se a é igual a b
        boolean isNotEqual = (a != b); // Verifica se a é diferente de b

        // Operadores relacionais
        boolean isGreaterThan = (a > b); // Verifica se a é maior que b
        boolean isLessThan = (a < b); // Verifica se a é menor que b
        boolean isGreaterThanOrEqual = (a >= b); // Verifica se a é maior ou igual a b
        boolean isLessThanOrEqual = (a <= b); // Verifica se a é menor ou igual a b

        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        System.out.println("a <= b: " + isLessThanOrEqual);


    }
}
