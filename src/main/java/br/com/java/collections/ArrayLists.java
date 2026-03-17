package br.com.java.collections;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);

        System.out.println("ages: "+ ages);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("Java");
        objects.add(10);
        objects.add(true);

        System.out.println("objects: "+ objects);

        ArrayList<String> animals = new ArrayList<>();
        System.out.println("size: "+ animals.size());
        System.out.println("empty: "+ animals.isEmpty());
        animals.add("gato");
        animals.add("mouse");
        animals.add(2, "dog");
        animals.add(1, "gata");

        System.out.println("animals: "+ animals);

        animals.removeFirst();

        System.out.println("animals: "+ animals);

        animals.removeLast();

        System.out.println("animals: "+ animals);

        animals.remove("mouse");

        System.out.println("animals: "+ animals);

        animals.set(0, "ant");

        System.out.println("animals: "+ animals);

        animals.remove(animals.getFirst());

        System.out.println("animals: "+ animals);

        ArrayList<String> items1 = new ArrayList<>();
        items1.add("a");
        items1.add("b");

        ArrayList<Object> items2 = new ArrayList<>();
        items2.add("a");
        items2.add("b");

        System.out.println(items2.equals(items1));//compare in order

    }
}
