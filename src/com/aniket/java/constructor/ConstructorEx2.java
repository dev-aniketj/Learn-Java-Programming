package com.aniket.java.constructor;

class PositiveInteger {
    private int x;

    //Default Constructor
    public PositiveInteger() {
        x = 0;
    }

    public PositiveInteger(int a) {
        if (a >= 0) {
            x = a;
        }
    }

    public void show() {
        System.out.println("Value is " + x);
    }

    public PositiveInteger getRef() {
        return this;
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {
        PositiveInteger p1, p2, p3, p4;
        p1 = new PositiveInteger();
        p2 = new PositiveInteger(90);
        p3 = new PositiveInteger(-21);
        p4 = p2.getRef();

        p1.show();
        p2.show();
        p3.show();
        p4.show();
    }
}
