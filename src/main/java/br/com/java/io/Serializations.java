package br.com.java.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
    transient
    final String name;

    final String location;
    Person(String name, String location){
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
public class Serializations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> list = new ArrayList<>();
        list.add(new Person("nome", "local"));

        serialization(list, "person.txt");
        deserializable("person.txt");

    }

    private static void deserializable(String file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(is);
        Object personObject = in.readObject();
        System.out.println("Object deserialized successfully.");
        System.out.println(personObject);
        in.close();
        is.close();

    }

    private static void serialization(List<Person> list, String fileName) throws IOException {
        OutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(list);
        out.flush();
        out.close();
        fileOut.close();
        System.out.println("Object serialized successfully.");
    }
}
