package com.aniket.java.collections;

import java.util.TreeSet;

public class CollectionsEx4 {
    public static void main(String[] args) {
        int a[] = {10, 20, 40, 10, 30, 20};

        TreeSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            if (!set1.add(a[i])) {
                System.out.println("duplicate found at " + i);
            }
        }

        //accessing the individual element of the collections
        System.out.println("Values in the Collection : ");
        for (Integer value : set1) {
            System.out.println(value);
        }

    }
}
