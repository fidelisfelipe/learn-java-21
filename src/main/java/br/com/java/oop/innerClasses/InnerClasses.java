package br.com.java.oop.innerClasses;

public class InnerClasses {
    public static void main(String[] args) {
        InnerClasses test = new InnerClasses();
        test.init();
        test.checkNumber(3);
    }

    private void init() {
        System.out.println("init");
    }

    public void checkNumber(int number){
        //var local
        int result = 0;
        //local inner class
        class NumberChecker {
            //atribute local
            final boolean check;

            //constructor
            public NumberChecker(int number){
                check = number % 2 == result;
            }

            //method
            public void print(){
                System.out.println("number is "+ number);
            }
        }
        //instance local inner class
        var check = new NumberChecker(number);
        check.print();
    }
}
