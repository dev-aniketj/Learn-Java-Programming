package com.aniket.java.basics;

public class ArrayEx4 {
    public static void main(String[] args) {
        int a[][] = new int[3][4];

        int b[][] = new int[3][];
        b[0] = new int[4];
        b[1] = new int[3];
        b[2] = new int[5];

        System.out.println(b[0].length);
    }
}
