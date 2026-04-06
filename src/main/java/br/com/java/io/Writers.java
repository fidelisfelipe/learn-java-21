package br.com.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Writers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        Writer writer = new FileWriter("writer.txt");
        writer.write("Hello, " + name + "!\n");
        writer.flush();
        writer.close();

    }
}
