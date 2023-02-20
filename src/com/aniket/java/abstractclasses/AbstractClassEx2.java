package com.aniket.java.abstractclasses;

abstract class A {
    public void f() {
        System.out.println("f() in A");
    }

    public abstract void g();

    public abstract void h();
}

abstract class B extends A {
    @Override
    public void g() {
        System.out.println("g() in B");
    }
}

class C extends B {
    @Override
    public void h() {
        System.out.println("h() in C");
    }
}

public class AbstractClassEx2 {
    public static void main(String[] args) {
        A a;    //reference variable
        a = new C();    //creating an object, not using A,B classes because they are abstract
        a.f();
        a.g();
        a.h();
    }
}
