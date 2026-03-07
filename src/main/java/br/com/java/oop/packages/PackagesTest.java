package br.com.java.oop.packages;

import br.com.java.oop.recordClasses.PersonTwo;//User-defined Packages

import java.util.Scanner;//Build-in Packages

import static br.com.java.oop.packages.PackagesItem.printSum;//import static from method static

public class PackagesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var test = new Packages();//não tem import pois esta no mesmo pacote, sua visibilidade é default
        var testOuther = new br.com.java.oop.recordClasses.Person();// é de outro pacote e foi importado internamente, esse importe resolve conflict names
        var testExt = new PersonTwo("name", 10);
        System.out.println("age: "+ testExt.getAge());
        printSum();
    }
}
