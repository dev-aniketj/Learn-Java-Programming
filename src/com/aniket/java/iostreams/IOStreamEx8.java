package com.aniket.java.iostreams;

import java.io.*;

/**
 * Serialization - converting object to stream of bytes.
 * Deserialization - converting stream of bytes to object.
 */

public class IOStreamEx8 {
    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(4, 2);
        Rectangle r2 = new Rectangle(5, 3);

        FileOutputStream fileOutputStream = new FileOutputStream("rectangle.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(r1);
        objectOutputStream.writeObject(r2);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("rectangle.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Rectangle r3, r4;
        r3 = (Rectangle) objectInputStream.readObject();
        r4 = (Rectangle) objectInputStream.readObject();

        r3.print();
        r4.print();

        int a = 10, b = 20;
        boolean c;
        c = a++ > 10 && b++ > 20;
        System.out.println(a + "\n" + b + "\n" + c);

    }
}

// Serializable interface is a mark able interface, & it is null.

class Rectangle implements Serializable {
    private double w, h;
    private double area;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public void print() {
        System.out.println("width - " + w + ", height - " + h + ", area - " + getArea());
    }

    public double getArea() {
        return w * h;
    }

}