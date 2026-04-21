package br.com.java.switchexpressions;

public class Switchs {
    public static void main(String[] args) {
        //testName(null);
        testNameSuccess(null);
    }
    //static void testName(Object o){
    //    switch(o){//Invalid case label combination: 'null' can only be used as a single case label or paired only with 'default'
            /**
             *
             * Explicação: null é um caso especial que pode estar sozinho ou apenas com default, mas não com outros padrões como String s.
             *
             * case null -> ...                    // ✅ null sozinho
             * case null, default -> ...           // ✅ null com default
             * case String s -> ...                // ✅ outro padrão sozinho
             */
            //case null, String s -> System.out.println("Name: " + s.toString());//❌ Sintaxe inválida:

            /**
             * Explicação: default nunca usa case na frente. É sempre apenas default, nunca case default.
             * ✅ Sintaxe válida:
             * javadefault -> System.out.println("Default");
             */

            //case
            //default -> System.out.println("Default");//❌ Sintaxe inválida:
            //The label for the default case must only use the 'default' keyword, without 'case'
    //    }

    //}
    //metodo corrigido
    static void testNameSuccess(Object o){
        switch(o){
            case null -> System.out.println("Null");
            case String s -> System.out.println("Name: " + s.toString());
            default -> System.out.println("Default");  // ← Sem 'case'
        }
    }
}
