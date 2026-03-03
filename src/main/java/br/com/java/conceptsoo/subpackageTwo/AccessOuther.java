package br.com.java.conceptsoo.subpackageTwo;

import br.com.java.conceptsoo.subpackage.AccessModifiers;

public class AccessOuther extends AccessModifiers{
    public static void main(String[] args) {
        AccessModifiers test = new AccessModifiers();
        test.publicMethod();
        //'protectedMethod()' has protected access in 'br.com.java.conceptsoo.subpackage.AccessModifiers'
        //test.protectedMethod();
        //'defaultMethod()' is not public in 'br.com.java.conceptsoo.subpackage.AccessModifiers'. Cannot be accessed from outside package
        //test.defaultMethod();
        //'privateMethod()' has private access in 'br.com.java.conceptsoo.subpackage.AccessModifiers'
        //test.privateMethod();

        AccessOuther testHeranca = new AccessOuther();
        testHeranca.protectedSubPackage();
        testHeranca.publicMethod();
        testHeranca.protectedSubPackage();

    }
}
