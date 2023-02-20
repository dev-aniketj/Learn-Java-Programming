package com.aniket.java.abstractclasses;

abstract class Demo {
    public void f() {
        System.out.println("f() in Demo");
    }
}

class Sample extends Demo {
}

public class AbstractClassEx3 {
    public static void main(String[] args) {
        Demo demo;
        //demo = new Demo();
        demo = new Sample();
        demo.f();
    }
}
