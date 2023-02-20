package com.aniket.java.classes;

class PositiveInteger {
    private int x;

    void set(int value) {
        if (value >= 0) {
            x = value;
        }
    }

    int get() {
        return x;
    }
}

public class ClassesEx2 {
    public static void main(String[] args) {
        //reference variable
        PositiveInteger n1;
        //RHS : creating an object and assigned its reference to n1.
        n1 = new PositiveInteger();
        n1.set(10);
        System.out.println(n1.get());
        n1.set(-5);
        System.out.println(n1.get());

        //reference variable
        PositiveInteger n2;
        //RHS : creating an object and assigned its reference to n2.
        n2 = new PositiveInteger();
        n2.set(-20);
        System.out.println(n2.get());
        n2.set(20);
        System.out.println(n2.get());
    }
}
