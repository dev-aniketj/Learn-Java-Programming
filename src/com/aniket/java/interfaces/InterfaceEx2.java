package com.aniket.java.interfaces;

interface Sample {
    void f();

    void g();
}

abstract class Base implements Sample {
    @Override
    public void f() {
        System.out.println("f() in Base");
    }

    public abstract void h();
}

class Derived extends Base {
    @Override
    public void g() {
        System.out.println("g() in Derived");
    }

    @Override
    public void h() {
        System.out.println("h() in Derived");
    }

    public void i() {
        System.out.println("i() in Derived");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        Derived d1 = new Derived();

        System.out.println("Derived : ");
        d1.f();
        d1.g();
        d1.h();
        d1.i();

        System.out.println("Base : ");
        Base b1 = d1;   //b = new Derived();
        b1.f();
        b1.g();
        b1.h();
        //b1.i();

        System.out.println("Sample : ");
        Sample s1 = new Derived();  //s1 = d1;
        s1.f();
        s1.g();
        //s1.h();
        //s1.i();

    }
}
