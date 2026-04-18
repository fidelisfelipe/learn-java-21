package br.com.java.collections;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> specialDays = List.of("NewYear", "Valentines", "Spring", "Labour");
        // verifico se todos os elementos da lista são iguais a "Labour" com allMatch
        System.out.print(specialDays.stream().allMatch(s -> s.equals("Labour")));
        // verifico se algum elemento da lista é igual a "Labour" com anyMatch
        System.out.print(specialDays.stream().anyMatch(s -> s.equals("Labour")));
        // verifico se nenhum elemento da lista é igual a "Labour" com noneMatch
        System.out.print(specialDays.stream().noneMatch(s -> s.equals("Helloween")));

        // verifico se a lista está vazia com findFirst
        System.out.print(specialDays.stream().findFirst());
    }
}
