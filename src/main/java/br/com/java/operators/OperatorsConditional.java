package br.com.java.operators;

/**
 * Operadores Condicionais
 *
 * Operadores condicionais são usados para realizar operações lógicas e controlar o fluxo de execução do programa com base em condições.
 *
 * Operadores condicionais comuns incluem:
 *
 * - E lógico (&&): Retorna true se ambas as expressões forem verdadeiras.
 * - OU lógico (||): Retorna true se pelo menos uma das expressões for verdadeira.
 * - Operador ternário (?:): Permite uma expressão condicional que retorna um valor com base em uma condição. A sintaxe é: condição ? valor_se_verdadeiro : valor_se_falso.
 *
 *
 */
public class OperatorsConditional {

    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        // Operadores condicionais
        boolean shouldTakeUmbrella = isRaining && !isSunny; // Retorna true se estiver chovendo e não estiver ensolarado
        boolean shouldGoOutside = isSunny || !isRaining; // Retorna true se estiver ensolarado ou não estiver chovendo

        System.out.println("Devo levar um guarda-chuva? " + shouldTakeUmbrella);
        System.out.println("Devo sair de casa? " + shouldGoOutside);

        // Exemplo do operador ternário
        String weatherMessage = isRaining ? "Está chovendo, leve um guarda-chuva!" : "O tempo está bom, aproveite o dia!";
        System.out.println(weatherMessage);

        int x = 5, y = 2;

        System.out.println(x & y);// Bitwise AND - Retorna um bit 1 se ambos os bits correspondentes dos operandos forem 1, caso contrário, retorna 0.
        System.out.println(x | y);// Bitwise OR - Retorna um bit 1 se pelo menos um dos bits correspondentes dos operandos for 1, caso contrário, retorna 0.
        System.out.println(x ^ y);// Bitwise XOR - Retorna um bit 1 se os bits correspondentes dos operandos forem diferentes, caso contrário, retorna 0.

    }
}
