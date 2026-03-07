package br.com.java.oop.constructor;

import com.sun.tools.javac.Main;

public class ConstructorTest {
    public static void main(String[] args) {
        //aqui o objeto é criado na stack e tem um ID, mas também faz referencia a memória reservada para a classe no heap
        var test = new Constructor();
        test.sum();
        System.out.println(test);
    }
}
