package br.com.java.oop.interfaces;

public class InterfacesMethodsAllow {
    //ok
    static void print1(){
        System.out.println("Static method in interface");
    }
    //Illegal combination of modifiers 'abstract' and 'static'
    //static e anstract nao podem ser usados juntos,
    // pois um metodo estatico nao pode ser sobrescrito
    // e um metodo abstrato deve ser sobrescrito
    //static abstract void print2();

    //Illegal combination of modifiers 'abstract' and 'default'
    //default e abstract nao podem ser usados juntos,
    // pois um metodo default tem uma implementacao padrao e nao precisa ser sobrescrito
    // e um metodo abstrato deve ser sobrescrito
    //default abstract void print3(){
    //
    //}

    
}
