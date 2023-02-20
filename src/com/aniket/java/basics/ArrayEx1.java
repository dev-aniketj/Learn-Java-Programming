package com.aniket.java.basics;

public class ArrayEx1 {
    //Method Overloading
    static void show_array(int a[]) {
        for (int i : a) System.out.println(i);
    }

    static void show_array(float a[]) {
        for (float f : a) {
            System.out.printf("%.2f", f);
            System.out.println();
        }
    }

    static void show_array(String a[]) {
        for (String s : a) System.out.println(s);
    }

    static void show_array(char a[]) {
        for (char c : a) System.out.println(c);
    }

    public static void main(String[] args) {
        int array1[] = {10, 20, 30};
        char array2[];
        array2 = new char[]{'a', 'g', 'f', 'h', '7', '1'};
        float array3[] = new float[3];
        array3[0] = 7.2231f;
        array3[1] = 8.4322f;
        array3[2] = 9.1f;
        String array4[] = new String[]{"Aniket", "Divya", "Chirag", "Ishita", "Deepika"};
        System.out.println(array1[0]);
        System.out.println(array2[1]);
        System.out.println(array3[2]);
        System.out.println(array4[3]);
        System.out.println("Array 1 address is + " + array1);
        System.out.println("Array 2 address is + " + array2);
        System.out.println("Array 3 address is + " + array3);
        System.out.println("Array 4 address is + " + array4);
        show_array(array1);
        show_array(array2);
        show_array(array3);
        show_array(array4);
    }
}
