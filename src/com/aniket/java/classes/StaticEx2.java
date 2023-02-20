package com.aniket.java.classes;

class ArrayUtils {
    public static int search(int a[], int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                return i;
        }
        return -1;
    }
}

public class StaticEx2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int searchElem = 30;
        int index = ArrayUtils.search(arr, searchElem);
        if (index != -1) System.out.println("Found at " + index + ".");
        else System.out.println("Not found.");
    }
}
