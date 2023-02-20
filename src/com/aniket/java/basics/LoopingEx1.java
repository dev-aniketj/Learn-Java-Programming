package com.aniket.java.basics;

public class LoopingEx1 {
    public static void main(String[] args) {
        int i = 1;
        /*
         * while loop
         */
        while (i <= 5) {
            System.out.println("hello " + i++);
        }
        /*
          do-while
         */
        //i=5 from above.
        do {
            System.out.println("runs once " + i++);
        } while (i <= 1);
        /*
          for loop
         */
        for (i = 11; i <= 15; i++) {
            System.out.println("HELLO " + i);
        }
    }
}
