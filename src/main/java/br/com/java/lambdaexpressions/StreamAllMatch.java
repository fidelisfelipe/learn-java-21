package br.com.java.lambdaexpressions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAllMatch {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Abc", "AA", "Ab");
        Predicate<String> predicate = s -> s.startsWith("A");
        boolean allMatch = stream.allMatch(predicate);
        System.out.println("All elements start with 'A': " + allMatch);
    }
}
