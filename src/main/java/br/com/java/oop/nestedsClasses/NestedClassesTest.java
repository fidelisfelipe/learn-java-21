package br.com.java.oop.nestedsClasses;
import br.com.java.oop.nestedsClasses.OuterClass.NestedClass;
import br.com.java.oop.nestedsClasses.OuterClass.InnerNestedNonStaticClass;
public class NestedClassesTest {
    public static void main(String[] args) {
        OuterClass.NestedClass test = new OuterClass.NestedClass();
        NestedClass object = new NestedClass();

        OuterClass parent = new OuterClass();

        InnerNestedNonStaticClass inner = parent.new InnerNestedNonStaticClass();
        inner.print();

        test.print();
        object.print();
    }
}
