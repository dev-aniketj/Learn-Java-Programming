package com.aniket.java.basics;

public class ArrayEx2 {
    static int f(int a, int b) {
        //logic
        if (a > b)
            return a;
        else
            return b;
    }

    static void print(int a[]) {
        for (int i : a) //using foreach
            System.out.println(i);
    }

    public static void main(String[] args) {
        int value1, value2;
        value1 = f(5, 7);
        System.out.println(value1);
        value2 = f(13, 9);
        System.out.println(value2);
        int arr[] = new int[]{11, 22, 33, 44};
        print(arr);
    }
}
