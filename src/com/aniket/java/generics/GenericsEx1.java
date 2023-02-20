package com.aniket.java.generics;

class Sample<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}


public class GenericsEx1 {
    public static void main(String[] args) {
        Sample<Integer> s1 = new Sample<>();
        s1.setValue(10);
        System.out.println(s1.getValue());

        Sample<Float> s2 = new Sample<Float>();
        s2.setValue(10.12f);
        System.out.println(s2.getValue());

        Sample<String> s3 = new Sample<>();
        s3.setValue("hello world");
        System.out.println(s3.getValue());


    }
}
