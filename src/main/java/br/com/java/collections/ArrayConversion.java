package br.com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConversion {
    public static void main(String[] args) {


        //List to Array
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);

        System.out.println("a "+list);

        //use toArray by List
        var arrays = list.toArray();

        System.out.println("b "+Arrays.toString(arrays));

        //ou with array origin
        Object[] results = list.toArray(arrays);

        System.out.println("c "+Arrays.toString(results));

        //Array to List

        // use asList
        List<Object> resultList = Arrays.asList(results);//apos criar com asList nao podemos mais add itens na lista
        List<Object> novaList = new ArrayList<>();

        System.out.println("d "+resultList);

        //use addAll
        Object[] outroArray = new Object[1];
        outroArray[0] = 2;
        Collections.addAll(novaList, outroArray);

        System.out.println("e "+Arrays.toString(novaList.toArray()));

        Collections.addAll(resultList, outroArray);//java.lang.UnsupportedOperationException

        System.out.println("f "+Arrays.toString(resultList.toArray()));
    }
}
