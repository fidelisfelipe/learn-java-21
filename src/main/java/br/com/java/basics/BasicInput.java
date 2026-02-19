package br.com.java.basics;

import java.util.Scanner;

/**
 *
 * O Scanner é uma classe do pacote java.util que facilita a leitura de dados do console, arquivos e outras fontes de entrada. <br />
 * Ele é amplamente utilizado para criar programas interativos que exigem entrada do usuário. <br />
 * Ele recebe um InputStream como argumento, e o System.in é um InputStream que representa a entrada padrão do console. <br />
 * O método nextInt() lê o próximo token do console como um inteiro, enquanto o método <br />
 * nextLine() lê a próxima linha de texto do console. <br />
 * É importante fechar o Scanner após o uso para liberar os recursos associados a ele, embora em programas simples isso possa ser opcional. <br />
 * <br />
 * Uso da classe Scanner para ler dados do console. <br />
 * Uso do método nextInt() para ler um número inteiro do console. <br />
 * Uso do método nextLine() para ler uma linha de texto do console. <br />
 * Uso do método close() para fechar o Scanner após o uso. <br />
 * Exemplo de leitura de múltiplos tipos de dados (inteiro e string) do console. <br />
 * Exemplo de interação com o usuário solicitando entrada de dados. <br />
 *
 */
public class BasicInput {

    public static void main(String [] args){
        //passamos o ponto de entrada do stream que utilizaremos
        //System.in é uma abstract InputStream que usaremos como entrada padrão
        Scanner input = new Scanner(System.in);
        System.out.println("informe um numero: ");
        int num = input.nextInt();
        System.out.println("numero informado: "+ num);

        System.out.println("informe outro numero: ");
        System.out.println("outro numero informado: "+ input.nextInt());


        System.out.println("informe um texto: ");
        System.out.println("texto informado: "+ input.nextLine());

        input.close();//fechamos para eficiência do sistema, detalhes na seção sobre JavaIO
    }

}
