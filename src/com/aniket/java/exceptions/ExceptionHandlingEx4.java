package com.aniket.java.exceptions;

class MyExp1 extends Exception {
}

class MyEpx2 extends Exception {
}

public class ExceptionHandlingEx4 {

    public static void f(int a) throws MyExp1, MyEpx2 {
        if (a == 1)
            throw new MyExp1();
        else if (a == 2)
            throw new MyEpx2();
        else
            System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            f(2);
        } catch (MyExp1 | MyEpx2 e) {
            System.out.println("Handle MyExp1, MyExp2 : " + e);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
