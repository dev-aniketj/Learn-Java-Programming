package com.aniket.java.collections;

import java.util.HashMap;

public class CollectionsEx6 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        // store -> put(key, value)
        hashMap.put("apple", 80);
        hashMap.put("banana", 35);
        hashMap.put("orange", 55);

        Integer applePrice = hashMap.get("banana");
        System.out.println(applePrice);

        System.out.println("content of hashMap : ");
        for (String key : hashMap.keySet()) {
            Integer price = hashMap.get(key);
            System.out.println(key + "\t--\t" + price);
        }

    }
}
