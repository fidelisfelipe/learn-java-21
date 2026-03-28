package br.com.java.streams;

import java.util.List;
import java.util.Optional;

public class ReducesExamples {
    public static void main(String[] args) {
        //number aleatorios
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sum1 = numbers.stream()
                //recebe dois argumentos
                //primeiro é a identidade, ele é o valor inicial da redução e o resultado padrão se não houver elementos
                //segundo é o acumulador, que recebe dois parametros: o resultado parcial da redução e o próximo elemento do fluxo
                //as operacoes de reducao sao paralelizadas
                //.reduce(0, (a,b) -> a + b);
                .reduce((a,b) -> a + b);
        sum1.ifPresent(System.out::println);

        int sum2 = numbers.stream()
                .reduce(0, (a,b) -> a + b);
        System.out.println(sum2);

        int elementProduct = numbers.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println("Product: " + elementProduct);

        Optional<Integer> max = numbers.stream().reduce((a,b) -> a > b ? a : b);
        max.ifPresent(n -> System.out.println("Max: " + n));

        Optional<Integer> min = numbers.stream().reduce((a,b) -> a < b ? a : b);
        min.ifPresent(n -> System.out.println("Min: " + n));

        List<Employee> employees = List.of(
                new Employee("Alice", 50000, Employee.Sex.FEMALE),
                new Employee("Bob", 60000, Employee.Sex.MALE),
                new Employee("Ana", 70000, Employee.Sex.FEMALE)
        );

        employees.stream().reduce((e1, e2)-> e1.getSalary() > e2.getSalary() ? e1 : e2)
                .ifPresent(e -> System.out.println("Highest Salary: " + e.getName() + " - " + e.getSalary()));

        int sumsSalary = employees.stream()
                .filter(e -> e.getGender() == Employee.Sex.FEMALE)
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println("Total Salary: " + sumsSalary);

        String concatNAmes = employees.stream()
                .map(Employee::getName)
                .reduce("", (a,b) -> a + " " + b);
        System.out.println("Concatenated Names: " + concatNAmes.trim());


    }
}
