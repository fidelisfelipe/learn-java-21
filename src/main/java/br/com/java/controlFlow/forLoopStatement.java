package br.com.java.controlFlow;

public class forLoopStatement {
    public static void main(String... loopArgs) {

        int y;

        for (y = 1; y<=10; y+=1){
            System.out.println(y);
        }

        System.out.println("Last number is: "+ y);

        int sum = 0;

        for(int k = 0; k<= 10; k+=2){
            sum += k;// sum = sum + k;
            System.out.println(k);
        }
        System.out.println("Sum of numbers: "+ sum);

        //na declaracao podemos ter mais de um termo, desde que os tipos sejam iguais
        //na condicao podemos ter mais de um termo
        //no incremento podemos ter mais de um termo
        for(int a = 0, b = 2, c = 4; a <= 6 && b <= 10; a++, b++){
            System.out.printf("a=%s\n", a);
            System.out.printf("b=%s\n", b);
            System.out.printf("c=%s\n", c);
        }

        // criação de uma matriz 3x3 (3 linhas × 3 colunas)
        int[][] matriz = new int[3][3];

        //loop externo - percorre as linhas (i = 0, 1, 2)
        for (int i = 0; i < matriz.length; i++) {

            // loop interno - percorre as colunas (j = 0, 1, 2)
            for (int j = 0; j < matriz[i].length; j++) {

                // preenche a posição [linha][coluna] com um valor
                // formula: (i * 3) + j + 1
                // resultado: valores de 1 a 9
                matriz[i][j] = (i * 3) + j + 1;
            }
        }

        // exibir a matriz preenchida
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // ← Imprime elemento
            }
            System.out.println(); // ← Quebra de linha após cada linha da matriz
        }




    }
}
