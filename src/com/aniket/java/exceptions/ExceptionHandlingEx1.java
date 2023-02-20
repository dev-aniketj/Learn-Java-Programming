package com.aniket.java.exceptions;

public class ExceptionHandlingEx1 {

    static int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(10, 2));
        System.out.println(div(10, 0));
    }
}
