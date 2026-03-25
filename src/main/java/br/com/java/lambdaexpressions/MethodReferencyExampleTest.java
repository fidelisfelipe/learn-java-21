package br.com.java.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencyExampleTest {
    public static void main(String[] args) {
        List<String> animals = List.of("dog", "cat", "rabbit", "hamster");
        Consumer<String> consumer = System.out::println;
        animals.forEach(consumer);//method referency
        Consumer<String> outherConsumer = animal -> System.out.println(animal);
        animals.forEach(outherConsumer);//lambda expression
        System.out.println("----------------------------");
        animals.forEach(animal -> {
            if(animal.contains("a"))
            System.out.println(animal);
        });
        System.out.println("----------------------------");
        //Static method reference
        //Integer.parseInt("123");
        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer integer = stringToInteger.apply("123");
        System.out.println(integer);
        System.out.println("----------------------------");
        String str = "hello world";
        Supplier<String> stringSupplier = str::toUpperCase;
        System.out.println(stringSupplier.get());
        //Calling constructor of a class
        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        ArrayList<String> stringList = arrayListSupplier.get();



    }
}
