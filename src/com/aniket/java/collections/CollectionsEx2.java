package com.aniket.java.collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsEx2 {
    public static void main(String[] args) {

        int[] a = {10, 30, 20, 10, 40, 20, 10};

        //HashSet<Integer> set1= new HashSet<>();
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        //TreeSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            if (!set1.add(a[i])) {
                System.out.println("found duplicate at " + i);
            }
        }

        System.out.println(set1);

    }
}
