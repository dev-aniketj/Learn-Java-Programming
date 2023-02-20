package com.aniket.java.abstractclasses;

abstract class Base {
    public void f() {
        System.out.println("f() in Base");
    }

    public abstract void g();
}

// concrete class
class Derived extends Base {
    @Override
    public void g() {
        System.out.println("g() in Derived");
    }
}

public class AbstractClassesEx1 {
    public static void main(String[] args) {
        Base b; //reference variable
        b = new Derived();  //creating an object
        b.f();
        b.g();

        System.out.println();

        Derived d = new Derived();
        d.f();
        d.g();

    }
}
