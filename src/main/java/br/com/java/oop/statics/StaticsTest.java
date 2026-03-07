package br.com.java.oop.statics;

public class StaticsTest {
    public static void main(String[] args) {
        Statics.name = "nome";
        System.out.println(Statics.getName());
        Statics.name = "nome2";
        System.out.println(Statics.getName());
    }
}
