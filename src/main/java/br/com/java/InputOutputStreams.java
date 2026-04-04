package br.com.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {
        //recebe dados do user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        scanner.close();

        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            byte [] data = nome.getBytes();
            outputStream.write(data, 5, 11);//Java Programming Language
            outputStream.flush();
            outputStream.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fim do programa.");

    }
}
