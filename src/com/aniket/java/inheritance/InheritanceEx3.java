package com.aniket.java.inheritance;

/**
 * Dynamic Binding
 */


class Base {
    void f() {
        System.out.println("f() in Base");
    }

    void g() {
        System.out.println("g() in Base");
    }
}

class Derived extends Base {
    @Override
    void f() {
        System.out.println("f() in Derived");
    }

    void h() {
        System.out.println("h() in Derived");
    }
}

public class InheritanceEx3 {
    public static void main(String[] args) {

        test(new Base());    //decided during the run-time

        System.out.println();

        test(new Derived());
    }


    static void test(Base b) {
        b.f();
        b.g();
        if (b instanceof Derived)
            ((Derived) b).h();
    }
}
