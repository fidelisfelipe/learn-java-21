package br.com.java.arrays;

import java.util.Arrays;

public class ArraysMultidimensional {

    public static void main(String[] args) {
        //2D array
        int  twoDimArray[][] = new int[3][3];//3 linhas , 3 colunas - corresponde a 3 matrizes de 1D e cada matriz tem 3 elementos

        /**
         * [X] [ ] [ ]
         * [ ] [ ] [ ]
         * [ ] [ ] [ ]
         */
        twoDimArray[0][0] = 0;

        /**
         * [ ] [X] [ ]
         * [ ] [ ] [ ]
         * [ ] [ ] [ ]
         */
        twoDimArray[0][1] = 1;

        System.out.println(Arrays.toString(twoDimArray[0]));

        /**
         * [ ] [ ] [ ]
         * [ ] [ ] [X]
         * [ ] [ ] [ ]
         **/
        twoDimArray[1][2] = 1;

        System.out.println(Arrays.toString(twoDimArray[1]));

        /**
         * -----------------------
         * [ ] [ ] [ ]
         * [ ] [ ] [ ]
         * [ ] [X] [ ]
         */
        twoDimArray[2][1] = 1;

        System.out.println(Arrays.toString(twoDimArray[2]));

        int [] ages [] = {
                {11, 12},
                {21, 22, 23},
                {31}
        };

        System.out.println(Arrays.toString(ages[0]));
        System.out.println(Arrays.toString(ages[1]));
        System.out.println(Arrays.toString(ages[2]));

        char [][][] threeDimArray = {
                {
                        {'a', 'b'},
                        {'c', 'd'}
                },
                {
                        {},
                        {}
                },
                {
                        {},
                        {},
                        {}
                }
        };

        System.out.println(Arrays.toString(threeDimArray[0][0]));
        System.out.println(Arrays.toString(threeDimArray[0][1]));

    }


}
