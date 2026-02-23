package br.com.java.operators;

/**
 * Operadores de Atribuição
 *
 * Operadores de atribuição são usados para atribuir valores a variáveis.
 * O operador de atribuição mais comum é o sinal de igual (=), que atribui o valor do lado direito à variável do lado esquerdo.
 * Além disso, existem operadores de atribuição compostos que combinam uma operação aritmética com a atribuição, como +=, -=, *=, /= e %=.
 */
public class OperatorsAssignment {

    public static void main(String[] args) {
        int x = 20, y = 15, z = 0;

        z = x + y; // Atribuição simples
        System.out.println("Valor de z após atribuição simples: " + z);

        z += x; // Equivalente a z = z + x
        System.out.println("Valor de z após z += x: " + z);

        z -= y; // Equivalente a z = z - y
        System.out.println("Valor de z após z -= y: " + z);

        z *= 2; // Equivalente a z = z * 2
        System.out.println("Valor de z após z *= 2: " + z);

        z /= 5; // Equivalente a z = z / 5
        System.out.println("Valor de z após z /= 5: " + z);

        z %= 3; // Equivalente a z = z % 3
        System.out.println("Valor de z após z %= 3: " + z);
    }

}
