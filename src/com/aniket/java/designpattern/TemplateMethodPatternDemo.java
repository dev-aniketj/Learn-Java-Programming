package com.aniket.java.designpattern;

import java.util.Scanner;

abstract class SearchAlgo {

    // Main Algorithm
    public int search(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (match(a[i], element))
                return i;
        }
        return -1;
    }

    public abstract boolean match(int value, int element);
}

class EqualitySearchAlgo extends SearchAlgo {
    @Override
    public boolean match(int value, int element) {
        return value == element;
    }
}

class InEqualitySearchAlgo extends SearchAlgo {
    @Override
    public boolean match(int value, int element) {
        return value != element;
    }
}

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        int[] arr = {10, 10, 30, 40, 50, 60};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the search element : ");
        int elem = scanner.nextInt();

        SearchAlgo searchAlgo;

        searchAlgo = new EqualitySearchAlgo();
        int index = searchAlgo.search(arr, elem);
        if (index != -1) System.out.println("found at " + index);
        else System.out.println("not found");


        searchAlgo = new InEqualitySearchAlgo();
        index = searchAlgo.search(arr, elem);
        if (index != -1) System.out.println("found different element at " + index);
        else System.out.println("not found");

    }
}
