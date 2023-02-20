package com.aniket.java.classes;

/**
 * @author Aniket Jain
 * @version 1.1.0
 * class{ data + operations }
 */

class Sample {
    //data member
    int a;

    //methods / operations
    void set(int value) {
        this.a = value;
    }

    int get() {
        return a;
    }
}

public class ClassesEx1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.set(100);
        System.out.println(s1.get());
        Sample s2 = new Sample();
        s2.set(22);
        System.out.println(s2.get());
    }
}
