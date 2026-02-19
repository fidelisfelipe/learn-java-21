package br.com.java.basics;

/**
 * Comentários são instruções que não são executadas pelo compilador e pelo interpretador <br />
 * Eles são usados para explicar o código, fornecer informações adicionais ou descrever a lógica por trás de uma implementação. <br />
 * Escrever comentários é uma prática recomendada para tornar o código mais legível e compreensível para outros desenvolvedores (ou para você mesmo no futuro). <br />
 * Existem três tipos principais de comentários em Java: <br />
 * <p>
 * single-line comments (comentários de linha única) - iniciados com //, usados para comentários curtos e diretos. <br />
 * multi-line comments (comentários de múltiplas linhas) - iniciados com /* e
 * documentation comments (comentários de documentação) - iniciados com /**, usados para gerar documentação automática usando ferramentas como Javadoc. <br />
 * </p>
 * Também é possivel usar formatação dentro dos comentários, como negrito, itálico e listas, para tornar as informações mais claras e organizadas. <br />
 * Html tags como <b> para negrito, <i> para itálico e <ul> para listas não ordenadas podem ser usadas dentro dos comentários de documentação para melhorar a legibilidade. <br />
 *
 * Parametros como @param, @return e @throws são usados para documentar os métodos, descrevendo os parâmetros de entrada, o valor de retorno e as exceções que podem ser lançadas. <br />
 */
public class Comments {

    /**
     * O método main é o ponto de entrada de um programa Java. <br />
     * @param args
     */
    public static void main(String [] args) {
//        aqui teremos comentario de linha única
        System.out.println("Hello World - 2026"); // Aqui também temos um comentário de linha única

        /* aqui temos um comentário de múltiplas linhas
        que pode se estender por várias linhas, útil para explicar blocos de código ou fornecer detalhes adicionais.
        */


    }
}
