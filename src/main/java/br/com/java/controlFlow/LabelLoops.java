package br.com.java.controlFlow;

public class LabelLoops {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;


        firstLoop:
        for(;x <= 5; x++){
            System.out.println(x);
            secondLoop:
            while(y <= 5){
                System.out.println(y++);
                if(y == 2)
                    break firstLoop;
            }
        }

        System.out.println("Fibonacci");

        int n = 10;
        int a = 0, b = 1;
        int count = 0;

        outerLoop:
        for (int i = 0; i < n; i++) {
            switch (count) {
                case 0:
                    System.out.println(a);
                    count++;
                    break;
                case 1:
                    System.out.println(b);
                    count++;
                    break;
                default:
                    int temp = a + b;
                    System.out.println(temp);
                    a = b;
                    b = temp;
                    count++;
                    if (count > n) {
                        break outerLoop;
                    }
            }
        }
    }
}
