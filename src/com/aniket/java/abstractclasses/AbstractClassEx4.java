package com.aniket.java.abstractclasses;

/**
 * Abstract Problem
 */

abstract class Graphic {
    protected int x1, y1, x2, y2;

    public void setStart(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setEnd(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public abstract void draw();
}

class Line extends Graphic {
    @Override
    public void draw() {
        System.out.printf("draw line from (%d, %d) to (%d, %d)", x1, y1, x2, y2);
    }
}

class Rectangle extends Graphic {
    @Override
    public void draw() {
        System.out.printf("draw rectangle from (%d, %d) to (%d, %d)", x1, y1, x2, y2);
    }
}

public class AbstractClassEx4 {

    // applicable for all Graphic (any subclass of Graphic)
    static void drawShape(int x1, int y1, int x2, int y2, Graphic g) {
        g.setStart(x1, y1);
        g.setEnd(x2, y2);
        g.draw();
    }


    public static void main(String[] args) {
//        Graphic g1, g2;     //reference variable
        //creating an object

//        Line g1 = new Line();
//        Rectangle g2 = new Rectangle();
//
//        g1.setStart(0, 0);
//        g1.setEnd(10, 20);
//        g2.setStart(10, 10);
//        g2.setEnd(30, 20);
//
//        g1.draw();
//        System.out.println();
//        g2.draw();

        drawShape(0, 0, 10, 20, new Line());
        System.out.println();
        drawShape(10, 10, 30, 22, new Rectangle());

    }
}
