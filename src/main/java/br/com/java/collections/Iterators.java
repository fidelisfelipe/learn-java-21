package br.com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<Object> numbers = List.of(1, 2, 3, 4, 5);
        Iterator<Object> iterator = numbers.iterator();

        // hasNext - se houver pelo menos um elemento para iterar
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            if (next.equals(numbers.get(numbers.size() - 2))) {
                System.out.println("Removing last element: " + next);
                try {
                    iterator.remove();
                } catch (UnsupportedOperationException e) {
                    System.out.println("Cannot remove element: " + e.getMessage());
                }
            }
        }

        List<Integer> numberList = new ArrayList<>();
        int i = 1;
        while (i < 51) {
            numberList.add(i++);
        }
        System.out.println("Original list: " + numberList);

        Iterator<Integer> iterator1 = numberList.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            if(next % 2 == 0) {
                iterator1.remove();
            }
        }
        System.out.println("Original sem par list: " + numberList);

        ListIterator<Integer> listIterator = numberList.listIterator();

        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            if(next % 2 != 0) {
                listIterator.add(next+1);
            }
        }
        System.out.println("Original com pares list: " + numberList);
    }
}
