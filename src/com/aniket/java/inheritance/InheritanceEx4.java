package com.aniket.java.inheritance;

/**
 * Dynamic Binding
 */

class BasicCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class ScientificCalc extends BasicCalc {
    private static final double PI = 3.147;

    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class InheritanceEx4 {
    public static void main(String[] args) {

        test(new ScientificCalc());

        System.out.println();

        test(new BasicCalc());
    }

    static void test(BasicCalc basicCalc) {
        System.out.println(basicCalc.add(10, 20));
        System.out.println(basicCalc.sub(10, 20));
        if (basicCalc instanceof ScientificCalc)
            System.out.println(((ScientificCalc) basicCalc).sin(90));
    }
}
