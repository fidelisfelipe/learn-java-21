package br.com.java.oop.constructor;

public class Constructor extends ConstructorPai{

    private int i;
    private char n;

    //simples
    public Constructor(){
        //nenhum code é permitido antes de chamadas a construtor
        //System.out.println("Constructor init simple");
        this(1);
        System.out.println("Constructor finish simple");
    }


    //sobre carga
    public Constructor(int i){
        System.out.println("Constructor(int i) init simple");
        this.i = i;
        System.out.println("Constructor(int i) finish simple");
    }

    public void sum(){
        this.i += 1;
        System.out.println("Constructor.sum call");
    }

    private Constructor(char n){
        System.out.println("Constructor(char n) init simple");
        this.n = n;
        System.out.println("Constructor(char n) finish simple");
    }

}
