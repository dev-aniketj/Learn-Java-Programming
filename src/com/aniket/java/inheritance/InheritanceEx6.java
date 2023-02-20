package com.aniket.java.inheritance;

/**
 * final modifier
 */
class Base1 {
    public final void print()   //now we do not override the print() method in Derived1 class
    {
        System.out.println("print in Base");
    }
}

class Derived1 extends Base1 {

}

public class InheritanceEx6 {
    public static void main(String[] args) {
        Derived1 derived1 = new Derived1();
        derived1.print();
    }
}
