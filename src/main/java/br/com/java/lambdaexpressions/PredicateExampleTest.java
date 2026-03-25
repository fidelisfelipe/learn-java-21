package br.com.java.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleTest {
    public static void main(String[] args) {
        Predicate<String> p0 = s -> (s.equals("java"));
        boolean result = p0.test("java");
        System.out.println(result);

        Predicate<Integer> p1 = i -> (i < 10);
        System.out.println(p1.test(5));

        Predicate<Integer> p2 = m -> m > 5;
        System.out.println(p1.and(p2).test(7));
        System.out.println(p1.or(p2).test(4));

        //list animals
        List<String> animals = new ArrayList<>(Arrays.asList("dog", "cat", "rabbit", "cat", "hamster"));
        System.out.println(animals);
        animals.removeIf(s -> s.equals("cat"));
        System.out.println(animals);
        Predicate<String> p3 = s -> s.equals("hamster");
        System.out.println(isAnimal("hamster", p3));

    }

    private static boolean isAnimal(String name, Predicate<String> predicate) {
        return predicate.test(name);
    }
}
