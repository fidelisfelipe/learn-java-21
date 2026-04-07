package br.com.java.io;

public class Readers {
    public static void main(String[] args) {
            try (java.io.Reader reader = new java.io.FileReader("output.txt")) {
                reader.skip(5);// skip the first 5 characters
                int data;
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            //lendo agora um intervalo
            try (java.io.Reader reader = new java.io.FileReader("output.txt")) {
                char[] buffer = new char[11];
                reader.skip(5); // skip the first 5 characters
                int numCharsRead = reader.read(buffer, 0, buffer.length);
                if (numCharsRead != -1) {
                    System.out.println("\nCharacters read: " + new String(buffer, 0, numCharsRead));
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
    }
}
