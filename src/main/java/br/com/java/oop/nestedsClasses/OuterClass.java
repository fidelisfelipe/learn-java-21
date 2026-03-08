package br.com.java.oop.nestedsClasses;

public class OuterClass {

    static String person = "Nome";
    private static String personTwo = "Nome 2";
    public String personThree = "Nome 3";

    static class NestedClass{
        void print(){
            System.out.println("person: "+ person);
            System.out.println("person 2: "+ personTwo);
            //Falha pois nao acessa itens nao statics
            //System.out.println("person 3: "+ personThree);//Non-static field 'personThree' cannot be referenced from a static context
        }
    }

    class InnerNestedNonStaticClass{
        void print(){
            System.out.println("person: "+ person);
            System.out.println("person 2: "+ personTwo);
            System.out.println("person 3: "+ personThree);
        }
    }
}
