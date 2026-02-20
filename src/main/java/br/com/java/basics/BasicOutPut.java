package br.com.java.basics;

/**
 * Uso do System.out.println() para imprimir mensagens no console.
 * Uso do System.out.print() para imprimir mensagens sem quebra de linha.
 * Uso do System.out.printf() para formatar a saída de mensagens.
 * Uso de variáveis para armazenar valores e utilizá-los na saída formatada.
 * Uso de caracteres de formatação como %s para strings e %d para inteiros.
 * Uso de \n para criar uma nova linha na saída.
 * Uso de %S para imprimir uma string em maiúsculas.
 * Exemplo de concatenação de strings usando o operador +.
 * Exemplo de cálculo de uma expressão dentro do printf.
 *
 */
public class BasicOutPut {
    public static void main(String [] args) {
        System.out.println("Hello World - 2026");
        System.out.println("Hello World" + " - " + 2026);

        System.out.print("Hello World");
        System.out.print(" - ");
        System.out.println(2026);

        int milenium = 2000;
        int ano = 26;

        // O compilador considera uma declaração como uma cadeia de caracteres e as concatena.
        System.out.println("\n" + "Hello World" + " - " + milenium + ano);

        // para evitar este comportamento, podemos usar o printf para formatar a saída e garantir que os valores sejam tratados como inteiros

        // ou usar parênteses para garantir que a expressão seja avaliada antes da concatenação
        System.out.println("\n" + "Hello World" + " - " + (milenium + ano));

        System.out.printf("%s %s %d", "Hello World", "-", (milenium + ano));

        System.out.print("\n");

        System.out.printf("%S %s %d", "Hello World", "-", (milenium + ano));



    }
}
