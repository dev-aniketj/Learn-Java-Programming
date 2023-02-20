package com.aniket.java.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx5 {

    private static void display(Collection<Integer> collection) {
//        for (Integer value : collection) {
//            System.out.println(value);
//        }

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println("values in the list are : ");
        display(list);

    }
}
