package com.aniket.java.inheritance;

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class ScientificCalculator extends BasicCalculator {
    private static final double PI = 3.147;

    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class InheritanceEx1 {
    public static void main(String[] args) {
        BasicCalculator bcalc1 = new BasicCalculator();
        System.out.println("Testing Basic Calc..." + "\n"
                + bcalc1.add(5, 1) + "\n"
                + bcalc1.sub(7, 2));

        ScientificCalculator scalc1 = new ScientificCalculator();
        System.out.println("Testing Scientific Calc..." + "\n"
                + scalc1.add(6, 11) + "\n"
                + scalc1.sub(21, 12) + "\n"
                + scalc1.sin(90));
    }
}
