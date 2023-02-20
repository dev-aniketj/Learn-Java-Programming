package com.aniket.java.interfaces;

interface ITest {
    void f();

    default void g() {
        System.out.println("g() in ITest");
    }

    static void h() {
        System.out.println("h() in ITest");
    }
}

class Demo1 implements ITest {

    @Override
    public void f() {
        System.out.println("f() in Demo1");
    }

}

class Demo2 implements ITest {

    @Override
    public void f() {
        System.out.println("f() in Demo2");
    }

    @Override
    public void g() {
        System.out.println("g() in Demo2");
    }
}

public class InterfaceEx4 {

    static void Test(ITest i) {
        i.f();
        i.g();
    }

    public static void main(String[] args) {
        Test(new Demo1());

        System.out.println();
        Test(new Demo2());

        System.out.println();
        ITest.h();
    }
}
