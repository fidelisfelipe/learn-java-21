package br.com.java.oop.recordClasses;

public class RecordTest {
    public static void main(String[] args) {
        System.out.println(new PersonTwo("um nome", 10));

        var a = new PersonTwo("um nome", 10);
        var b = new PersonTwo("um nome", 10);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(new PersonRecord("um nome", 10));

        var c = new PersonRecord("um nome", 5);
        var d = new PersonRecord("um nome", 10);

        System.out.println(c.equals(d));
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println(new PersonRecord.PersonRecordInner(true));
    }
}
