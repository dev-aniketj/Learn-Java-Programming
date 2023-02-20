package com.aniket.java.composition;

class BasicCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

//Scientific Calc is hsa a BasicCalc
class ScientificCalc {
    private final static double PI = 3.147;

    BasicCalc basicCalc = new BasicCalc();

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class CompositionEx1 {
    public static void main(String[] args) {
        BasicCalc bcalc1 = new BasicCalc();
        System.out.println("Testing Basic Calc..." + "\n"
                + bcalc1.add(5, 1) + "\n"
                + bcalc1.sub(7, 2));

        ScientificCalc scalc1 = new ScientificCalc();
        System.out.println("Testing Scientific Calc..." + "\n"
                + scalc1.add(6, 11) + "\n"
                + scalc1.sub(21, 12) + "\n"
                + scalc1.sin(90));
    }
}
