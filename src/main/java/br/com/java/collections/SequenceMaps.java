package br.com.java.collections;

import java.util.LinkedHashMap;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

public class SequenceMaps {
    public static void main(String[] args) {
        SequencedMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();//Explicit type argument Integer, String can be replaced with <>
        myMap.put(1, "Apple");
        myMap.put(2, "Banana");
        myMap.put(3, "Cherry");
        myMap.put(4, "Date");

        myMap.putFirst(1, "Apple");
        myMap.putLast(4, "Date");

        System.out.println("First entry: " + myMap);

        SequencedMap<Integer, String> reversedMap = myMap.reversed();
        System.out.println("Reversed map: " + reversedMap);

        /**
         * SequencedSet:
         * Esta interface representa um conjunto de elementos que mantém a ordem de inserção.
         * Ele é uma extensão do Set, o que significa que não permite elementos duplicados,
         * mas também garante que a ordem em que os elementos foram adicionados seja preservada.
         * O SequencedSet é útil quando você precisa de um conjunto de elementos únicos,
         * mas também deseja manter a ordem em que eles foram inseridos.
         */
        SequencedSet<Integer> reverseSet = myMap.sequencedKeySet();
        System.out.println("Sequenced key set: " + reverseSet);

        SequencedCollection<String> myCollreverse = myMap.sequencedValues();
        System.out.println("Sequenced values: " + myCollreverse);
    }
}
