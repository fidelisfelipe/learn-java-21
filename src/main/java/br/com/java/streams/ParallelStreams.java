package br.com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> listIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        listIntegers.parallelStream()
                .forEach(System.out::println);

        listIntegers.parallelStream()
                .forEachOrdered(System.out::println);

        //Concurrent Reduction - deve atender aos 3 criterios - Parallel, CONCURRENT, UNORDERED
        ConcurrentMap<Boolean, List<Integer>> groupedNumbers = listIntegers
                .parallelStream()//deve ser paralela
                .unordered()//deve ser nao ordenada
                .collect(Collectors.groupingByConcurrent(n-> n % 2 == 0));//deve ser concorrente

        Set<Collector.Characteristics> characteristics = Collectors.groupingByConcurrent(n -> true).characteristics();
        System.out.println("characteristics: " + characteristics);

        //Ordering
        listIntegers.stream().forEach( n -> System.out.println(n + " "));
        System.out.println();

        Comparator<Integer> reverse = Comparator.reverseOrder();
        listIntegers.sort(reverse);
        listIntegers.stream().forEach( n -> System.out.println(n + " "));



        System.out.println("groupedNumbers" + groupedNumbers);
        //lazinies
        listIntegers.parallelStream()
                .filter(
                        n -> {
                            System.out.println("filter: " + n + " thread: " + Thread.currentThread().getName());
                            return n % 2 == 0;
                        })
                .map(
                        n -> {
                            System.out.println("map: " + n + " thread: " + Thread.currentThread().getName());
                            return n * 2;
                        });

        //interference yes
        listIntegers.parallelStream()
                .forEach(
                        n->{
                            if(n == 3){
                                try {
                                    listIntegers.remove(n);//java.lang.UnsupportedOperationException: remove
                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                            }
                        }
                );

        //interference no
        var result = listIntegers.parallelStream()
                .filter(n -> n != 3)
                .collect(Collectors.toList());
        System.out.println("result:"+result);



        //statefull no thread-safe
        listIntegers.parallelStream()
                .map(n->{
                    result.add(n);//statefull usage
                    return n*2;
                })
                .forEachOrdered(n->System.out.println("number: "+n));

        //statefull thread-safe
        var resultThreadSafe = listIntegers.parallelStream()
                .map(n-> n * 2)
                .collect(Collectors.toList());

        System.out.println("resultThreadSafe:"+resultThreadSafe);


    }
}
