package com.aniket.java.constructor;

class Sample {
    //no argument constructor
    public Sample() {
        System.out.println("No argument constructor");
    }

    public Sample(int a) {
        System.out.println("Argument Constructor, Value is " + a);
    }
}

public class ConstructorEx1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample(200);
    }
}
