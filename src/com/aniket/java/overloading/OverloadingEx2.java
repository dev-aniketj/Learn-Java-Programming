package com.aniket.java.overloading;

/**
 * Method Overloading Example
 *
 * @author Aniket Jain
 * @version 2.0
 */

class SearchUtil {
    //return index if element is found.
    public static int search(int[] arr, int item) {
        return search(arr, 0, item);
    }

    public static int search(int[] arr, int pos, int item) {
        for (int i = pos + 1; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}

public class OverloadingEx2 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 10, 20, 40, 50, 20, 50, 30, 20, 10, 60, 10};
        int element = 20;
        int index = -1;
        System.out.println("Array A : ");
        //find the same repeat element in an array, using recursion.
        do {
            index = SearchUtil.search(a, (index + 1), element);
            if (index != -1) {
                System.out.println("found at " + index);
            }
        } while (index != -1);


        int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        element = 60;
        index = SearchUtil.search(b, 2, element);
        System.out.println("\nArray B :");
        if (index != -1) System.out.println("Element is found at " + index + " index.");
        else System.out.println("Element is not found.");
    }
}
