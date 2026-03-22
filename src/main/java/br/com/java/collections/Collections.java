package br.com.java.collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //cria um hash set
        Set<String> setCollection1 = new HashSet<>();

        setCollection1.add("a");
        setCollection1.add("b");
        setCollection1.add("c");
        setCollection1.add("d");
        setCollection1.add("e");
        setCollection1.add("f");
        setCollection1.add("a");//nao add item repetido
        System.out.println("setCollection1:" +setCollection1);

        //remove
        setCollection1.remove("a");

        System.out.println("setCollection1:" +setCollection1);

        //contains a
        System.out.println("contem item: "+ setCollection1.contains("a"));

        //comparando duas colecoes de elementos

        Set<String> setCollection2 = new HashSet<>();
        setCollection2.add("c");
        setCollection2.add("d");
        setCollection2.add("b");
        setCollection2.add("e");
        setCollection2.add("f");
        System.out.println("collections sao iguais? "+setCollection1.equals(setCollection2));
        System.out.println("setCollection2: "+setCollection2);

        Set<String> intersection = new HashSet<>(setCollection1);
        intersection.retainAll(setCollection2);
        System.out.println("intersection: "+intersection);

        //Hashset com alguns items de carros
        Set<String> carros = new HashSet<>();
        carros.add(null);
        carros.add("Palio");
        carros.add("Celta");
        carros.add("Uno");
        carros.add("Corsa");
        carros.add("Fiesta");
        carros.add("Ka");
        carros.add("Siena");
        carros.add("Civic");
        carros.add("Corolla");
        carros.add("Focus");

        System.out.println("carros hashset: "+carros);

        //LinkedHashSet com alguns items de carros
        Set<String> carros2 = new LinkedHashSet<>();
        carros2.add(null);
        carros2.add("Palio");
        carros2.add("Celta");
        carros2.add("Uno");
        carros2.add("Corsa");
        carros2.add("Fiesta");
        carros2.add("Ka");
        carros2.add("Siena");
        carros2.add("Civic");
        carros2.add("Corolla");
        carros2.add("Focus");
        System.out.println("carros linkedhashset: "+carros2);

        //TreeSet com alguns items de carros
        TreeSet<String> carros3 = new TreeSet<>();//usa ordenacao natural, ou seja, ordena os itens em ordem alfabetica
        //carros3.add(null); Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
        carros3.add("Palio");
        carros3.add("Celta");
        carros3.add("Uno");
        carros3.add("Corsa");
        carros3.add("Fiesta");
        carros3.add("Ka");
        carros3.add("Siena");
        carros3.add("Civic");
        carros3.add("Corolla");
        carros3.add("Focus");
        System.out.println("carros treeset: "+carros3);

        //TreeSet com alguns itens characters
        TreeSet<Character> characters = new TreeSet<>();
        characters.add('f');
        characters.add('c');
        characters.add('b');
        characters.add('e');
        characters.add('a');
        characters.add('d');
        System.out.println("characters treeset: "+characters);
        System.out.println("characters treeset: "+characters.descendingSet());
        System.out.println("characters treeset: "+characters.first());
        System.out.println("characters treeset: "+characters.last());
        System.out.println("characters treeset: "+characters.headSet('d'));//retorna os itens menores que 'd'
        System.out.println("characters treeset: "+characters.headSet('d', true));//retorna os itens menores que 'd', incluindo 'd'
        System.out.println("characters treeset: "+characters.tailSet('d'));//retorna os itens maiores ou iguais a 'd'
        System.out.println("characters treeset: "+characters.tailSet('d', true));//retorna os itens maiores ou iguais a 'd', incluindo 'd'
        System.out.println("characters treeset: "+characters.subSet('b', 'e'));//retorna os itens entre 'b' e 'e', incluindo 'b' e excluindo 'e'
        System.out.println("characters treeset: "+characters.subSet('b', true, 'e', true));//retorna os itens entre 'b' e 'e', incluindo 'b' e 'e'
        //poll
        System.out.println("characters treeset: "+characters.pollFirst());//retorna o primeiro item e remove ele da coleção
        System.out.println("characters treeset: "+characters.pollLast());//retorna o ultimo item e remove ele da coleção

        //Queue - FIFO e FILO - Queue
        Queue<String> carsQueue = new LinkedList<>();
        carsQueue.add("Palio");//throw an exception se a fila estiver cheia
        carsQueue.offer("Celta");//retorna true se a fila tiver espaço, ou false se estiver cheia
        carsQueue.offer("Uno");
        carsQueue.offer("Corsa");
        carsQueue.offer("Fiesta");
        carsQueue.offer("Ka");
        carsQueue.offer("Siena");
        carsQueue.offer("Civic");
        carsQueue.offer("Corolla");
        carsQueue.offer("Focus");

        System.out.println("carsQueue: "+carsQueue);
        //fist, last, element, peek, poll
        System.out.println("carsQueue: "+carsQueue.element());//retorna o primeiro item da fila, ou throw an exception se a fila estiver vazia
        System.out.println("carsQueue: "+carsQueue.peek());//retorna o primeiro item da fila, ou null se a fila estiver vazia
        System.out.println("carsQueue: "+carsQueue.poll());//retorna o primeiro item da fila e remove ele da fila, ou null se a fila estiver vazia
        //remove
        carsQueue.remove("Uno");
        System.out.println("carsQueue: "+carsQueue);//sem Palio e sem Uno

        //Deque - FIFO e LIFO - usado para filas e pilhas pois permite adicionar e remover itens tanto no inicio quanto no final da fila
        Deque<String> carsDeque = new LinkedList<>();
        carsDeque.push("Palio");//add no inicio da fila, ou seja, o ultimo item adicionado sera o primeiro a ser removido (LIFO)
        carsDeque.add("Celta");//add no final da fila, ou seja, o primeiro item adicionado sera o primeiro a ser removido (FIFO)
        carsDeque.addFirst("Uno");//add no inicio da fila, ou seja, o ultimo item adicionado sera o primeiro a ser removido (LIFO)
        carsDeque.addLast("Corsa");//add no final da fila, ou seja, o primeiro item adicionado sera o primeiro a ser removido (FIFO)
        carsDeque.offerFirst("Fiesta");//add no inicio da fila, ou seja, o ultimo item adicionado sera o primeiro a ser removido (LIFO)
        carsDeque.offerLast("Ka");//add no final da fila, ou seja, o primeiro item adicionado sera o primeiro a ser removido (FIFO)
        carsDeque.push("Siena");

        System.out.println("carsDeque: "+carsDeque);

        //Map - chave e valor
        Map<String, String> map = new HashMap<>();
        map.put("BR", "Fusca");
        map.put("US", "Ferrari");
        map.put("UK", "Lamborghini");
        map.put("FR", "Polo");
        map.put("IT", "Fiat");
        map.put("ES", "Kia");
        map.put("DE", "Audi");
        map.put("JP", "Toyota");
        map.put("CN", "Renault");
        map.put("IN", "Hyundai");
        map.put("RU", "Mazda");

        System.out.println("map: "+map);
        System.out.println("map: "+map.get("BR"));
        System.out.println("map: "+map.containsKey("BR"));
        System.out.println("map: "+map.containsValue("Fusca"));
        System.out.println("map: "+map.replace("BR", "Outro Fusca"));
        System.out.println("map: "+map.size());
        System.out.println("map: "+map.isEmpty());
        System.out.println("map: "+map.keySet());
        System.out.println("map: "+map.values());
        System.out.println("map: "+map.entrySet());
        System.out.println("map: "+map.remove("BR"));
        //replace
        System.out.println("map: "+map.replace("RU", "Ferrari"));

        //TreeMap
        TreeMap<String, String> map2 = new TreeMap<>();
        map2.put("BR", "Fusca");
        map2.put("US", "Ferrari");
        map2.put("UK", "Lamborghini");
        map2.put("FR", "Polo");
        map2.put("IT", "Fiat");
        map2.put("ES", "Kia");
        map2.put("DE", "Audi");
        map2.put("JP", "Toyota");

        System.out.println("map2: "+map2);
        System.out.println("map2: "+map2.firstKey());
        System.out.println("map2: "+map2.lastKey());
        System.out.println("map2: "+map2.floorKey("BR"));
        System.out.println("map2: "+map2.ceilingKey("BR"));
        System.out.println("map2: "+map2.lowerKey("BR"));
        System.out.println("map2: "+map2.higherKey("BR"));
        System.out.println("map2: "+map2.navigableKeySet());
        System.out.println("map2: "+map2.descendingKeySet());
        System.out.println("map2: "+map2.subMap("BR", "US"));
        System.out.println("map2: "+map2.headMap("US"));
        System.out.println("map2: "+map2.tailMap("US"));
        System.out.println("map2: "+map2.subMap("BR", true, "US", true));
        System.out.println("map2: "+map2.headMap("US", true));
        System.out.println("map2: "+map2.tailMap("US", true));
        System.out.println("map2: "+map2.comparator());





    }
}
