package br.com.java.basics;

/**
 * Tipos de dados em Java - char
 *
 * O tipo de dado char é usado para armazenar um único caractere, como uma letra, um número ou um símbolo.
 * Ele é representado por aspas simples (' ') e ocupa 2 bytes de memória, pois é baseado no padrão Unicode, que permite representar uma ampla variedade de caracteres de diferentes idiomas e símbolos.
 *
 * O char é um tipo de dado primitivo em Java, o que significa que ele armazena diretamente o valor do caractere, em vez de uma referência a um objeto.
 * O valor de um char é um número inteiro que representa o código Unicode do caractere.
 * Por exemplo, o caractere 'A' tem o código Unicode 65, então atribuir 'A' a uma variável char é equivalente a atribuir o número 65 a essa variável.
 *
 * O char é comumente usado para armazenar caracteres individuais, como letras, dígitos ou símbolos, e pode ser manipulado usando operações de comparação, concatenação e conversão para outros tipos de dados.
 */
public class DataTypeChar {

    public static void main(String[] args) {
        char charValue = 82;
        System.out.println("Char value: " + charValue);

        // Convertendo char para int (código Unicode)
        int unicodeValue = charValue;
        System.out.println("Unicode value of '" + charValue + "': " + unicodeValue);

        // Convertendo int para char
        char anotherChar = (char) unicodeValue;
        System.out.println("Char value from Unicode " + unicodeValue + ": " + anotherChar);

        //isLetter() verifica se o caractere é uma letra (a-z ou A-Z)
        System.out.println("Is '" + charValue + "' a letter? " + Character.isLetter(charValue));

        //isDigit() verifica se o caractere é um dígito (0-9)
        System.out.println("Is '" + charValue + "' a digit? " + Character.isDigit(charValue));
    }
}
