package br.com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsExamples {
    public static void main(String[] args) {
        Predicate<Integer> apenasPares = n -> n % 2 == 0;
        Predicate<Integer> maiorQue = n -> n > 4;
        Function<Integer, Integer> addUm = n -> n + 1;
        List<Integer> numbers = Arrays.asList(9, 7, 8, 6, 4, 3, 1, 5, 2, 10, 10);
        numbers.stream()
                .filter(apenasPares.and(maiorQue))
                .map(addUm)
                .sorted()
                .distinct()
                .forEach(System.out::println);

        //Terminal Operation Methods - do not return a stream
        //Intermediate Operation Methods - return a stream

        //Lista de animais
        List<String> animals = Arrays.asList("dog", "cat", "rabbit", "hamster");
        Stream<String> animalStream = animals.stream();
        animalStream
                .map(String::toUpperCase)
                .forEach(System.out::println);
        animalStream
                .map(String::toLowerCase)
                .forEach(System.out::println);

    }
}
