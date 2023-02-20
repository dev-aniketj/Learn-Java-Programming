package com.aniket.java.exceptions;

class MyExp extends Exception {
}

public class ExceptionHandlingEx5 {

    static void f(int a) {
        try {
            System.out.println("inside try-block");

            if (a == 1)
                return;
            //System.exit(1);

            if (a == 2)
                throw new MyExp();

            System.out.println("last statement of try-block");
        } catch (MyExp e) {
            System.out.println("catch-block");
        } finally {
            System.out.println("finally-block");
        }
        System.out.println("after finally-block");
    }

    public static void main(String[] args) {
        f(6);
    }
}
