package com.aniket.java.overloading;

class Print {
    static void print(int a) {
        System.out.println(a);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(double d) {
        System.out.println(d);
    }

    static void print(float f) {
        System.out.println(f);
    }
}

public class OverloadingEx1 {
    public static void main(String[] args) {
        Print.print(10);    //int
        Print.print(50.221);    //double
        Print.print("Hello World"); //string
        Print.print(23.021f);   //float
    }
}
