package com.aniket.java.constructor;

class Demo {
    Demo() {
        this(0);
        System.out.println("rest the code....\n");
    }

    Demo(int a) {
        System.out.println("some complicated inti.... with " + a);
    }
}

public class ConstructorEx4 {
    public static void main(String[] args) {
        Demo d1, d2, d3, d4, d5;
        d1 = new Demo(7);
        d2 = new Demo(12);
        d3 = new Demo();
        d4 = new Demo(8);
        d5 = new Demo(59);
    }
}
