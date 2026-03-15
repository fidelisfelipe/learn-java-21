package br.com.java.wrappers;

public class AutoBoxingAutoUnboxing {
    public static void main(String[] args) {
        Double db = 2.0;//Auto-boxing
        double d = db;//Auto-unboxing

        Double db1 = null;
        double d2 = db1; //Unboxing of 'db1' may produce 'NullPointerException'
    }
}
