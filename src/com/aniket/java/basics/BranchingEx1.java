package com.aniket.java.basics;

public class BranchingEx1 {
    public static void main(String[] args) {
        /**
         * if-else
         */
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("a is Big.");
        } else if (b > a) {
            System.out.println("b is Big.");
        } else {
            System.out.println("a is equal to b.");
        }
        /**
         * switch
         */
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Some Other Day.");
        }
    }
}
