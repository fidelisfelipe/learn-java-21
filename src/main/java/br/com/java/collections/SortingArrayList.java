package br.com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(1.0);
        list.add(4.0);
        list.add(-2.0);
        list.add(-1.0);

        //unsorted list
        System.out.println("unsorted list"+ list);

        Collections.sort(list);

        System.out.println("sorted list"+ list);

        List<String> list1 = new ArrayList<>();
        list1.add("Um");
        list1.add("Dois");
        list1.add("Tres");
        list1.add("Quatro");
        list1.add("Cinco");

        //unsorted list
        System.out.println("unsorted list1"+ list1);

        Collections.sort(list1);

        System.out.println("sorted list1"+ list1);

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

        Collections.sort(list2);

        System.out.println("sorted list2"+ list2);

        List<String> list3 = new ArrayList<>();
        list3.add("3");
        list3.add("300");
        list3.add("20");
        list3.add("35");
        list3.add("37");
        list3.add("31");
        list3.add("70");
        list3.add("4");

        //unsorted list
        System.out.println("unsorted list3"+ list3);

        Collections.sort(list3);

        System.out.println("sorted list3"+ list3);
    }
}
