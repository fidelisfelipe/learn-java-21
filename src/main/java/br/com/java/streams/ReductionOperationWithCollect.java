package br.com.java.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReductionOperationWithCollect {
    public static void main(String[] args) {
        //uma lista
        List<String> names = Arrays.asList("John", "Janet", "Jack", "Jill", "Marie", "Janet");
        System.out.println(names);

        var namesWithFivePlus = names.stream()
                .filter(s -> s.length() > 4)//apenas nomes com mais de 4 characteres
                .collect(Collectors.toList());
        System.out.println(namesWithFivePlus);

        Set<String> namesNotRepeted = names.stream()
                .filter(s -> s.length() > 4)
                .collect(Collectors.toSet());
        System.out.println(namesNotRepeted);

        String namesJoined = names.stream()
                .collect(Collectors.joining("|", "[", "]"));
        System.out.println(namesJoined);

        Map<Integer, List<String>> groupeByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupeByLength);

        Map<Boolean, List<String>> partitioningBy = names.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println(partitioningBy);

        LinkedList<String> linkedListNames = names.stream()
                .filter(n -> n.length() > 4)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedListNames);

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, Employee.Sex.FEMALE),
                new Employee("Bob", 60000, Employee.Sex.MALE),
                new Employee("Ana", 70000, Employee.Sex.FEMALE),
                new Employee("John", 55000, Employee.Sex.MALE));

        Map<Employee.Sex, Integer> totalByGender = employees.stream()
                .collect(
                        Collectors.groupingBy(
                            Employee::getGender,
                            Collectors.summingInt(Employee::getSalary))
                );

        System.out.println(totalByGender);

        SalaryCollector salaryCollector = employees.stream()
                .map(Employee::getSalary)
                .collect(
                        SalaryCollector::new,//fornecedor
                        SalaryCollector::accept,//acumulador //operacoes paralelas
                        SalaryCollector::combine//combinador //operacoes paralelas
                );
        System.out.println("Total Salary: " + salaryCollector.getTotal());

        Map<Employee.Sex, SalaryCollector> totalSalaryByGenderWithCustomCollector = employees.stream()
                .collect(
                   Collectors.groupingBy(
                           Employee::getGender,
                           Collectors.mapping(
                                   Employee::getSalary,
                                   Collector.of(
                                           SalaryCollector::new,
                                           SalaryCollector::accept,
                                           (salary1, salary2) ->{
                                               salary1.combine(salary2);
                                               return salary1;
                                           }
                                   )
                           )
                   )
                );
        totalSalaryByGenderWithCustomCollector.forEach(
                (g, s) -> System.out.println(g + ": " + s.getTotal())
        );


    }
}
