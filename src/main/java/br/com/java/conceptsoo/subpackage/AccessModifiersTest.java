package br.com.java.conceptsoo.subpackage;

public class AccessModifiersTest {

    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        access.publicMethod();
        access.defaultMethod();
        access.protectedMethod();
        //'privateMethod()' has private access in 'br.com.java.conceptsoo.subpackage.AccessModifiers'
        //access.privateMethod();
    }

}
