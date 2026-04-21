package br.com.java.basics;
class Course{
    String name;
    //static String name;// that action below code to compile

    public void getName(String name) {
        this.name = name;
        System.out.print(name);

    }
/**
    public static void getName(){
        name = "Java name";//Non-static field 'name' cannot be referenced from a static context
        System.out.print(name);

    }**/
}
public class Statics {
    public static void main(String[] args) {
        var c = new Course();
        c.getName("Java");
    }
}
