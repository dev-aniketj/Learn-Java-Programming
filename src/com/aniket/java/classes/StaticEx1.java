package com.aniket.java.classes;

class Student {
    //static data member : they belong to class
    private static String board;    //class member

    //static method only use static data members.
    public static void writeToBoard(String s) {
        board = s;
    }

    //non-static : related to object(student)
    private String note;    //instance member

    public void writeNote(String s) {
        note = s;
    }

    public void print() {
        System.out.println("Content on the Board : " + board);
        System.out.println("My copy Note : " + note + "\n");
    }
}

public class StaticEx1 {
    public static void main(String[] args) {

        Student.writeToBoard("Hello World 123456789");

        Student s1 = new Student();
        Student s2 = new Student();

        s1.writeNote("Hello 123");
        s2.writeNote("World 456");


        s1.print();
        s2.print();

    }
}
