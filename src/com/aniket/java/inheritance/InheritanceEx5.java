package com.aniket.java.inheritance;

class Point2D {
    protected int x, y;

    public Point2D() {
        this(0, 0);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("(%d, %d)\n", x, y);
    }
}

class Point3D extends Point2D {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void print() {
        System.out.printf("(%d, %d, %d)\n", x, y, z);
    }
}

public class InheritanceEx5 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        p1.print();
        Point3D p2 = new Point3D(2, 6, -2);
        p2.print();
        Point3D p3 = new Point3D();
        p3.print();
    }
}
