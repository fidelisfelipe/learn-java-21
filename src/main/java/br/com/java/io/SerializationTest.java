package br.com.java.io;

import java.io.*;

class Course implements Serializable{
    private static float averagePrice = 9.99f;
    private String description;
    private transient float price;

    public Course(String description, float price){
        this.description  = description;
        this.price = price;
    }

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        price = averagePrice;
    }

    public String toString(){
        return description + " " + price + " " + averagePrice;
    }

}
public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course c = new Course("Java 21", 19.99f);

        //escreve o objeto
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.txt"))) {
            out.writeObject(c);
        }
        //le o arquivo e transforma em objeto
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.txt"))) {
            c = (Course) in.readObject();
        }
        System.out.print(c);//Java 21 0.0 9.99
    }
    /**
     * 📌 Lição para o exame
     *
     * Quando você desserializa, o Java faz o seguinte:
     *
     * Cria o objeto SEM chamar o construtor
     * Executa o readObject() customizado
     *
     * Campos transient:
     *
     * ❌ Não são serializados
     * ✅ Após desserializar, recebem valor default (0.0f, 0, null, etc.)
     * ⚠️ MESMO se há readObject() customizado, se não for explicitamente restaurado, fica com default
     *
     * readObject() customizado:
     *
     * Deve chamar in.defaultReadObject() primeiro
     * Pode fazer lógica adicional com campos
     */
}
