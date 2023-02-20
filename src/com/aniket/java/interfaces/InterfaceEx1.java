package com.aniket.java.interfaces;

interface Calculator {
    double PI = 3.14;   //public static final

    int add(int a, int b);  //public abstract

    int sub(int a, int b);

    double sin(double deg);
}

class BasicCalc implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin((deg * PI) / 180);
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        Calculator calculator;  //ref variable
        calculator = new BasicCalc();
        System.out.println(calculator.add(11, 20));
        System.out.println(calculator.sub(20, 1));
        System.out.println(calculator.sin(90));
    }
}
