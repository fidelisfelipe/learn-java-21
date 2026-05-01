package br.com.java.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try{
            new Exceptions().method();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }// finally{ nao pode ter 2 finally
         //   System.out.println("This block will also always execute.");
        //}
    }
    public void method() throws ArithmeticException{
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            var y = (int) 5/i;
            System.out.print("y: " + y);
        }
    }
}
