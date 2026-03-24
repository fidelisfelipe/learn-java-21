package br.com.java.enumtypes;

import java.util.Scanner;

public class ColorTest {
    public static void main(String[] args) {
        Scanner inpout = new Scanner(System.in);
        System.out.println("Enter a color: ");
        String inputColor = inpout.next();

        try {
            Color color = Color.valueOf(inputColor.toUpperCase());
            switch (color) {
                case RED:
                    System.out.println("You chose RED!");
                    break;
                case GREEN:
                    System.out.println("You chose GREEN!");
                    break;
                case BLUE:
                    System.out.println("You chose BLUE!");
                    break;
                default:
                    System.out.println("Invalid color!");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Invalid color entered: " + inputColor);
        } finally {
            inpout.close();
        }
    }
}
