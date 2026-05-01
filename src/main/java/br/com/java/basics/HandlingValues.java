package br.com.java.basics;

public class HandlingValues {
    public static void main(String[] args) {

        //which of these local array (inside a method) declarations and initializations are legal?

//        ´var' is not allowed as an element type of an array
        var i = new int[] {1,2};

        //Array initializer is not allowed here
        //'var' is not allowed as an element type of an array
//        var i[][] = { {1,2}, {1}, {}, {1,2,3} };

        var i2 = new int [][] { {1,2,3}, {4,5,6} };

        // o erro ocorre por conta do [4]
        //
        //var i3[4] = new int[] {1,2,3,4};

        //Array initializer is not allowed here
        //clarificando:
        //o erro "Array initializer is not allowed here" ocorre porque a sintaxe de inicialização de array usando chaves {}
        // é permitida apenas no momento da declaração do array.
        // Quando você tenta usar essa sintaxe em uma atribuição posterior,
        // o compilador não reconhece isso como uma forma válida de inicializar o array, resultando no erro mencionado.
        //var i4 = {{1,2}, new int[2]};

        //declaracoes validas
        //nenhuma declara tamanho do array, entao o compilador consegue inferir o tipo e o tamanho do array a partir dos valores fornecidos na inicializacao
        var i5 = new int[] {1,2,3,4};
        var i6 = new int[4];
        var i7 = new int[][] { {1,2}, {1}, {}, {1,2,3} };
        var i8 = new int[4][];
        var i9 = new int[4][2];

        //se for declarado o tamanho deve ser sem a inicializacao, entao o compilador consegue inferir o tipo do array a partir do tipo declarado
        var i10 = new int[4];
        var i11 = new int[4][];
        var i12 = new int[4][2];
        var i13 = new int[4][2];
        var i14 = new int[4][2];

        //se tiver string
        //ocorre a mesma situacao
        //var names [] = new String{"name1", "name2"};

        //isso sim seria valido, pois o compilador pode inferir o tipo do array a partir dos valores fornecidos na inicialização,
        // e o tamanho do array é determinado pelo número de elementos fornecidos.
        var names = new String[] {"name1", "name2"};

    }
}
