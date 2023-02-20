package com.aniket.java.basics;

import java.util.Scanner;

public class ArrayEx3 {
    static int searchElement(int a[], int item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{10, 20, 30, 40, 50, 60, 70};
        System.out.println("Enter search element : ");
        int search_item = (new Scanner(System.in)).nextInt();
        int k = searchElement(arr, search_item);
        if (k != -1) {
            System.out.println("Found at " + k + " index");
        } else {
            System.out.println("Element is not found.");
        }
    }
}
