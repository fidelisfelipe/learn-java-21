package br.com.java.io;

import java.io.*;
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

            InputStream is = new FileInputStream("output.txt");
            int lenght = is.available();
            System.out.println("Lenght: "+ lenght);
            System.out.println("Reading data...");
            int readCharAsdecimal = is.read();
            System.out.println("Read readCharAsdecimal: "+ readCharAsdecimal);
            while(readCharAsdecimal != -1){
                char readChar = (char) readCharAsdecimal;
                String readCharAsString = String.valueOf(readChar);
                System.out.print(readCharAsString);
                readCharAsdecimal = is.read();
            }
            is.close();


            //outro detalhe
            InputStream iss = new FileInputStream("output.txt");

            int lenghtIss = iss.available();

            byte[] arrays = new byte[lenghtIss];

            iss.skip(1);

            for(int offset = 0; offset < 11; offset++) {
                System.out.print(new String(arrays, offset, 1));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Fim do programa.");

    }
}
