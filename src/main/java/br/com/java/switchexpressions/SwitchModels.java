package br.com.java.switchexpressions;

import java.util.Arrays;

public class SwitchModels {
    public enum AI_MODEL{
        ML('A'),
        SL('B'),
        UL('C'),
        DL('D');
        char c;
        //Modifier 'private' is redundant for enum constructors
        private AI_MODEL(char c){
            this.c = c;
        }
    }
    public static void main(String[] args) {
        // drop while - descarta enquanto a condição for true
        Arrays.stream(AI_MODEL.values()).dropWhile(s-> s.equals(SwitchModels.AI_MODEL.SL));
        switch (AI_MODEL.valueOf("SL")){
            case ML -> System.out.println("Machine Learning");
            case SL -> System.out.println("Standard Learning");
            case UL -> System.out.println("Unsupervised Learning");
            case DL -> System.out.println("Deep Learning");
            default -> System.out.println("Invalid model");
        }
    }
}
