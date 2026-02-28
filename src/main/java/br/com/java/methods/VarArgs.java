package br.com.java.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String... varArgs) {
        mainIsvalid();//sem valores
        mainIsvalid("varArgs");//com um
        mainIsvalid("varArgs", "varArgs");//ou mais valores

    }
    public static void mainIsvalid(String ...args) {
        System.out.println(Arrays.toString(args));
    }

    public static void mainValid(String...args) {
        System.out.println(Arrays.toString(args));
    }

    public static void metodoValidoMasVarArgsDeveSerOUltimoArgumento(String nome, int idade, Integer ...diasDaSemana){

    }

    //Falha: Vararg parameter must be the last in the list
    //public static void metodoValidoMasVarArgsDeveSerOUltimoArgumento(Integer ...diasDaSemana, String nome, int idade){}
}
