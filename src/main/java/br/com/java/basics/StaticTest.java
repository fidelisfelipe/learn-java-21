package br.com.java.basics;
import static br.com.java.basics.StaticTest.print;
public class StaticTest {
    static int x = 10;

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Local variable in main x: " + x);
        new StaticTest().test();

        print(1,5);
    }

    //primeiro ele escolhe o metodo com as assinaturas primitivas
    protected static void print(int x, int y) {
        System.out.println("int , int");
    }

    //caso nao encontre, entao escolheria o varargs
    private static void print(int ...x) {
        System.out.println("var args int");
    }

    public void test(){
        //x = 2;
        System.out.println("Local variable in test x: " + x);
    }
}
