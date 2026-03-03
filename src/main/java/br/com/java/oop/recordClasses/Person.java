package br.com.java.oop.recordClasses;
//nao aceita modificadores private ou protected
//aceita public e default
//nao permite abstract type
//aceita final(records são é implicitamente final a class e seus membros)
public record Person() implements Drink{//implementa mas nao extends
    //Instance field is not allowed in records
    //int number = 10;

    static int age = 10;
    static int day;
    final static int number = 10;//redundante pela natureza da record


    @Override
    public void canDrink() {

    }
}
