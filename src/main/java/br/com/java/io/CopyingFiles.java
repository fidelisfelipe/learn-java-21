package br.com.java.io;

import java.io.*;

public class CopyingFiles {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("output.txt");
        Writer writer = new FileWriter("copy.txt");
        if(reader.ready()){
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            writer.flush();
            writer.close();
            reader.close();
             System.out.println("File copied successfully.");
        }


    }
}
