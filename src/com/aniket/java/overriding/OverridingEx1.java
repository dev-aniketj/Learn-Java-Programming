package com.aniket.java.overriding;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("name is - " + name);
    }
}

class Contact extends Person {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    //method overriding
//    public void print() {
//        System.out.println("address is - " + address);
//    }

    //using super to avoid method overriding
    @Override
    public void print() {
        super.print();
        System.out.println("address is - " + address);
    }
}

public class OverridingEx1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("A");
        p1.print();

        System.out.println();

        Contact c1 = new Contact();
        c1.setName("B");
        c1.setAddress("xyz");
        c1.print();

    }
}
