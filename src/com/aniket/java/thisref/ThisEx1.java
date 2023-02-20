package com.aniket.java.thisref;

class Sample {
    private int x;

    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return x;
    }

    public Sample getRef() {
        return this;
    }
}

public class ThisEx1 {
    public static void main(String[] args) {
        Sample s1, s2, s3;
        s1 = new Sample();
        s2 = new Sample();
        s1.setX(10);
        s2.setX(20);
        s3 = s1.getRef();
        System.out.println(s1.getX());
        System.out.println(s2.getX());
        System.out.println(s3.getX());
    }
}
