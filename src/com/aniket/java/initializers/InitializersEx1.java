package com.aniket.java.initializers;

/**
 * Initializers
 * static initializer - runs once per the class (class level).
 * non-static initializer - runs once for each object (object level, instance level).
 */
class Sample {
    //static initializer
    static {
        System.out.println("static initializer");
    }

    //non-static initializer
    {
        System.out.println("non-static initializer");
    }
}

public class InitializersEx1 {
    public static void main(String[] args) {
        new Sample();
        new Sample();
        new Sample();
    }
}
