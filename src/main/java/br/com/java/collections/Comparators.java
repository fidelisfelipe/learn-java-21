package br.com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        List<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('C');
        list2.add('D');
        list2.add('B');
        list2.add('A');
        list2.add('b');
        list2.add('5');

        //unsorted list
        System.out.println("unsorted list2"+ list2);

        Collections.sort(list2, new MyChars());

        System.out.println("sorted list2"+ list2);

        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("mercedes", 2026, 10000));
        cars.add(new Cars("bmw", 2020, 20000));
        cars.add(new Cars("ferrari", 2000, 30000));

        Comparator<Cars> comparator = Comparator.comparing(Cars::year);

        Collections.sort(cars, comparator);

        System.out.println("sorted cars"+ cars);
    }
}

class MyChars implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        if(o1 > o2)
            return 1;
        else if (o1 < o2)
            return -1;
        else
        return 0;
    }
}

record Cars(String name, int year, int price){
}

