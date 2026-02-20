package br.com.java.basics;

/**
 * Variáveis são usadas para armazenar dados em um programa. <br />
 *<br />
 * Contém valor<br />
 * reserva espaço na memória<br />
 * cada uma reserva um tipo de dados<br />
 * contém uma quantidade de valores<br />
 *<br />
 * Dependem de duas etapas para serem usadas:<br />
 *<br />
 * Declaração: é o processo de criar uma variável atribuindo um nome e associá-la a um tipo de dados específico. <br />
 * Inicialização: é o processo de atribuir um valor a uma variável já declarada. <br />
 *<br />
 * Temos 3 tipos de variáveis em Java:<br />
 *<br />
 *
 * Variáveis de instância:<br />
 * - são declaradas dentro de uma classe, mas fora de qualquer método
 * - e cada objeto da classe tem sua própria cópia dessas variáveis. <br />
 *<br />
 *
 * Variáveis de classe (ou variáveis estáticas):<br />
 * - são declaradas dentro de uma classe mas fora da declaração de um método e com a palavra-chave static<br />
 * - são inicializadas apenas uma vez no início do programa e compartilhadas por todas as instancias da classe. <br />
 * - dever ser inicializadas primeiro, antes das variáveis de instância. <br />
 *<br />
 *
 * Variáveis locais:<br />
 * - são declaradas dentro de um método, construtor ou bloco e só podem ser usadas dentro desse escopo. <br />
 * - não são inicializadas automaticamente e devem ser atribuídas um valor antes de serem usadas. <br />
 */
public class Variables {

    public static void main(String[] args) {
        declaracaoSimples();
        declaracaoEmLinha();
        variaveisValidas();
        variaveisInvalidas();
    }

    private static void variaveisInvalidas() {
        System.out.println("Variáveis inválidas:");
        // Variáveis inválidas
        // int 3age; // Não pode começar com um número
        // int age!; // Não pode conter caracteres especiais como ! * - + /
        // int class; // Não pode usar palavras reservadas
    }

    private static void variaveisValidas() {
        System.out.println("Variáveis válidas:");
        // Variáveis válidas
        int age, _age, $age, age3, áve, não;
        //por convenção o $ nunca é usado, mas é permitido
        //acentos também são permitidos, mas por convensão não utilizados
    }

    private static void declaracaoEmLinha() {
        System.out.println("Declaração em linha:");
        //declaração em linha
        int a = 10, b = 20, c = a+b; // declaração e inicialização em linha

        System.out.println("A soma de a e b é: " + c);
    }

    private static void declaracaoSimples() {
        System.out.println("Declaração simples:");

        //declaraćão simples
        int a = 10; // Inicialização de a
        int b = 20; /// Inicialização de b
        int c = a + b; // Inicialização de c

        System.out.println("A soma de a e b é: " + c);
    }
}
