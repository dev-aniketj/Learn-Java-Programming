package com.aniket.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsEx7 {
    public static void main(String[] args) {

        String sentence = "this is sample sentence this is for map example";
        String[] words = sentence.split(" ");

        //Map<String, Integer> wordMap = new HashMap<String, Integer>();
        Map<String, Integer> wordMap = new TreeMap<>();
        for (String word : words) {
            Integer value = wordMap.get(word);

            // checking number of particular word in the given sentence.
            if (value == null)
                value = 1;
            else
                value++;

            wordMap.put(word, value);

        }
        System.out.println(wordMap);
    }
}
