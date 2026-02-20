package br.com.java.basics;

/**
 * O Tipo de Dado define os valores que uma variável pode assumir<br />
 * Precisamos definir o tipo de dado de uma variável no momento da declaração. <br />
 * Java é statically-typed, ou seja, o tipo de dado de uma variável é verificado em tempo de compilação. <br />
 *
 * Existem dois tipos de dados em Java: <br />
 * - Tipos primitivos: são 8 os tipos de dados mais básicos e incluem byte, short, int, long, float, double, char e boolean. <br />
 *   - São nomeados por palavras chave reservadas<br />
 *   - São imutáveis, ou seja, seu valor não pode ser alterado depois de atribuído<br />
 *   - São armazenados diretamente na memória, o que os torna mais eficientes em termos de desempenho. <br />
 *   - São usados para armazenar valores simples, como números, caracteres e valores booleanos. <br />
 *   - byte, short, int e long são usados para armazenar números inteiros<br />
 *   - float e double são usados para armazenar números de ponto flutuante<br />
 *   - char é usado para armazenar caracteres individuais<br />
 *   - boolean é usado para armazenar valores verdadeiros ou falsos. <br />
 *   <br />
 * - Tipos não primitivos (ou tipos de referência): são tipos de dados mais complexos que podem armazenar objetos e incluem classes, interfaces, enums e arrays. <br />
 */
public class DataTypes {

    /**
     * 1 byte, 8 bit, -128 a 127, value default: 0
     * recomendado para economizar memória em grandes arrays, onde o intervalo de valores é conhecido e pequeno
     * não é recomendado para cálculos matemáticos, pois pode causar estouro de valor (overflow) se o resultado exceder o limite do byte
     */
     byte byteValue;

    /**
     * 2 bytes, 16 bit, -32.768 a 32.767, value default: 0
     * recomendado para economizar memória em grandes arrays, onde o intervalo de valores é conhecido e pequeno, mas maior do que o byte
     * não é recomendado para cálculos matemáticos, pois pode causar estouro de valor (overflow) se o resultado exceder o limite do short
     */
    short shortValue;

    /**
     * 4 bytes, 32 bit, -2.147.483.648(-2³¹) a 2.147.483.647(2³¹-1) , value default: 0
     * recomendado para armazenar números inteiros em geral, a menos que seja necessário um intervalo maior ou menor
     * é o tipo de dado inteiro mais comumente usado em Java, pois oferece um bom equilíbrio entre capacidade de armazenamento e eficiência de desempenho
     */
    int intValue;

    /**
     * 8 bytes, 64 bit, -9.223.372.036.854.775.808(-2⁶³) a 9.223.372.036.854.775.807(2⁶³-1), value default: 0L
     * recomendado para armazenar números inteiros muito grandes, como identificadores únicos ou contadores de alta precisão
     * não é recomendado para cálculos matemáticos, pois pode causar estouro de valor (overflow) se o resultado exceder o limite do long
     */
    long longValue;

    /**
     * 4 bytes, 32 bit, ±1.4E-45 a ±3.4028235E38, 32-bit floating point, value default: 0.0f
     * recomendado para armazenar números de ponto flutuante com precisão simples, como coordenadas ou medidas que não exigem alta precisão
     * não é recomendado para cálculos matemáticos que exigem alta precisão, pois pode causar perda de precisão devido à representação de ponto flutuante
     * Precisão simples: usa menos memória, mas menos exatidão (~7 dígitos)
     */
    float floatValue;

    /**
     * 8 bytes, 64 bit, ±4.9E-324 a ±1.7976931348623157E308, 64-bit floating point, value default: 0.0d
     * recomendado para armazenar números de ponto flutuante com precisão dupla, como cálculos científicos ou financeiros que exigem alta precisão
     * Precisão dupla: usa o dobro de memória que float, mas maior exatidão (~16 dígitos)
     */
    double doubleValue;

    /**
     * 2 bytes, 16 bit, valor Unicode, value default: '\u0000' (null character)
     * recomendado para armazenar caracteres individuais, como letras, dígitos ou símbolos
     * não é recomendado para armazenar texto ou strings, pois cada caractere ocupa 2 bytes e pode ser ineficiente em termos de memória
     */
    char charValue;

    /**
     * 1 byte, 8 bit, true ou false, value default: false
     * recomendado para armazenar valores booleanos, como flags ou condições de controle de fluxo
     */
    boolean booleanValue;

    public static void main(String ...args){

        boolean a = true;
        char b = 'R';
        byte c = 12;
        short d = -356;
        int e = 4567;
        long f = 123456789L;
        float g = 3.14159F;
        double h = 2.71828;

        System.out.println("Boolean value: " + a);
        System.out.println("Char value: " + b);
        System.out.println("Byte value: " + c);
        System.out.println("Short value: " + d);
        System.out.println("Int value: " + e);
        System.out.println("Long value: " + f);
        System.out.println("Float value: " + g);
        System.out.println("Double value: " + h);

        // String class - imutable, após declarada, não pode ser alterada.
        // Não é um tipo primitivo, mas é amplamente utilizado para representar texto em Java
        String str = "Esta é uma string";
        System.out.println("String value: " + str);

        //long nao declarado com ´L´ ou ´l´ no final, o compilador interpreta como int e pode causar erro de compilação se o valor exceder o limite do int
        //long money = 1000000000000; // 1 trilhão

        //para evitar este problema, devemos declarar o long com o sufixo L para indicar que é um valor do tipo long
        //o underline (_) é permitido em literais numéricos para melhorar a legibilidade, mas não afeta o valor real da variável
        //o underline pode ser usado dentro do valor da declaração mas nunca no inicio ou no final
        //long money = _1_000_000_000_000l; // 1 trilhão
        long money = 1_000_000_000_000l; // 1 trilhão
        System.out.println("Money value with underscore: " + money);

        float floatValue = 3.141_59F;//usar ´F´ ou ´f´ para evitar erro de compilação, pois o compilador interpreta como double por padrão
        System.out.println("Float value with underscore: " + floatValue);

    }

}
