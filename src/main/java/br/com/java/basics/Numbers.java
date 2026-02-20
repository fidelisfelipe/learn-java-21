package br.com.java.basics;

/**
 * Numeros em Java
 *
 * Decimal: int numero = 10; // base 10
 * Binário: int numero = 0b1010; // base 2, prefixo 0b ou 0B - usa apenas os dígitos 0 e 1 para representar os valores
 * Octal: int numero = 012; // base 8, prefixo 0 - usa os dígitos de 0 a 7 para representar os valores
 * Hexadecimal: int numero = 0xA; // base 16, prefixo 0x ou 0X - vão de 0 a 9 e de A a F (ou a a f) para representar os valores de 10 a 15
 */
public class Numbers {

    /**
     * Convertendo um binario em decimal
     *
     * O número binário 1010 pode ser convertido para decimal usando a fórmula:
     *
     * (1 * 2^3) + (0 * 2^2) + (1 * 2^1) + (0 * 2^0) = 8 + 0 + 2 + 0 = 10
     *
     * Pegamos o valor de cada binario
     *
     * - o último dígito (0) tem o valor de 0 * 2^0 = 0
     * - o penúltimo dígito (1) tem o valor de 1 * 2^1 = 2
     * - o antepenúltimo dígito (0) tem o valor de 0 * 2^2 = 0
     * - o primeiro dígito (1) tem o valor de 1 * 2^3 = 8
     *
     * Em seguida, somamos os valores de cada dígito para obter o valor decimal total: 0 + 2 + 0 + 8 = 10
     *
     * Portanto, o número binário 1010 é igual a 10 em decimal.
     *
     * Convertendo um octal em decimal
     *
     * O número octal 12 pode ser convertido para decimal usando a fórmula:
     *
     * (1 * 8^1) + (2 * 8^0) = 8 + 2 = 10
     *
     * Pegamos o valor de cada octal
     * - o último dígito (2) tem o valor de 2 * 8^0 = 2
     * - o primeiro dígito (1) tem o valor de 1 * 8^1 = 8
     *
     * Em seguida, somamos os valores de cada dígito para obter o valor decimal total: 2 + 8 = 10
     *
     * Portanto, o número octal 12 é igual a 10 em decimal.
     *
     * Convertendo um hexadecimal em decimal
     *
     * O número hexadecimal A pode ser convertido para decimal usando a fórmula:
     *
     * (10 * 16^0) = 10
     *
     * Pegamos o valor de cada hexadecimal
     * - o único dígito (A) tem o valor de 10 * 16^0 = 10 (onde A representa o valor decimal 10)
     *
     * Portanto, o número hexadecimal A é igual a 10 em decimal.
     *
     *
     */

    public static void main(String args[]) {
        int decimal = 10; // base 10
        int binario = 0b1010; // base 2
        int octal10 = 012; // base 8
        int octalNumber68 = 0104; // base 2, equivalente a 68 em decimal
        int sumOctal = octal10 + octalNumber68; // soma dos octais, equivalente a 80 em decimal

        System.out.println("Operações com octais:");

        System.out.println("Octal: " + octal10);
        System.out.println("Octal (68 em decimal): " + octalNumber68);
        System.out.println("Soma dos octais (78 em decimal): " + sumOctal);
        System.out.println("Octal (78 em octal): " + Integer.toOctalString(sumOctal)); // base 8, equivalente a 78 em decimal

        System.out.println("------------------------------");

        System.out.println("Operações com Hexadecimal:");

        int hexadecimal = 0xA; // base 16
        int hexadecimal47 = 0x2F; // base 16, equivalente a 47 em decimal
        int sumHexadecimal = hexadecimal + hexadecimal47; // soma dos hexadecimais, equivalente a 57 em decimal

        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Hexadecimal (47 em decimal): " + hexadecimal47);
        System.out.println("Soma dos hexadecimais (57 em decimal): " + sumHexadecimal);
        System.out.println("Hexadecimal (57 em hexadecimal): " + Integer.toHexString(sumHexadecimal)); // em hexadecimal é 39, equivalente a 57 em decimal

        System.out.println("------------------------------");

        System.out.println("Operações com Binario:");

        int binario1 = 0b1010; // base 2, equivalente a 10 em decimal
        int binario2 = 0b1011; // base 2, equivalente a 11 em decimal
        int sumBinario = binario1 + binario2; // soma dos binarios, equivalente a 21 em decimal

        System.out.println("Binário 1: " + binario1);
        System.out.println("Binário 2: " + binario2);
        System.out.println("Soma dos binários (21 em decimal): " + sumBinario);
        System.out.println("Binário (21 em binário): " + Integer.toBinaryString(sumBinario)); // base 2, equivalente a 21 em decimal
    }
}
