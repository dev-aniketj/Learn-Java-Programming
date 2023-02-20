package com.aniket.java.constructor;

class ComplexNumber {
    private int real, img;

    public ComplexNumber() {
        real = img = 0;
    }

    public ComplexNumber(int real) {
        this.real = real;
    }

    public ComplexNumber(int real, int img) {
        this(real);
        this.img = img;
    }

    public void print() {
        System.out.printf("(%d) + (%di)\n", real, img);
    }
}

public class ConstructorEx3 {
    public static void main(String[] args) {
        ComplexNumber c1, c2, c3, c4;
        c1 = new ComplexNumber();
        c2 = new ComplexNumber(10);
        c3 = new ComplexNumber(3, 45);
        c4 = new ComplexNumber(9, -12);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
