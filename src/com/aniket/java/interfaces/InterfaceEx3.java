package com.aniket.java.interfaces;

interface A {
    void f();
}

interface B {
    void g();
}

interface C extends A, B {
    void h();
}

interface D {
    void i();
}

class SampleClass implements D, C {
    @Override
    public void f() {
        System.out.println("f() in SampleClass");
    }

    @Override
    public void g() {
        System.out.println("g() in SampleClass");
    }

    @Override
    public void h() {
        System.out.println("h() in SampleClass");
    }

    @Override
    public void i() {
        System.out.println("i() in SampleClass");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        A a = new SampleClass();
        System.out.println("A interface : ");
        a.f();

        B b = new SampleClass();
        System.out.println("B interface : ");
        b.g();

        C c = new SampleClass();
        System.out.println("C interface : ");
        c.f();
        c.g();
        c.h();

        D d = new SampleClass();
        System.out.println("D interface :  ");
        d.i();
    }
}
