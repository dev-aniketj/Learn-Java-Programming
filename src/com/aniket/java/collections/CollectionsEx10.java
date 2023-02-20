package com.aniket.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionsEx10 {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new ScoreComparator());

        students.add(new Student(95, "Aniket", 89.23));
        students.add(new Student(86, "Deepika", 84.74));
        students.add(new Student(8, "Ayush", 79));
        students.add(new Student(125, "Chirag", 88.6));
        students.add(new Student(95, "Aniket", 89.23));

        // without Comparator interface can't print the TreeSet<Student> values.
        System.out.println(students);


    }
}

// comparator.compare(s1, s2);
class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getScore() - o2.getScore());
    }
}

class Student {
    private int sno;
    private String name;
    private double score;

    public Student(int sno, String name, double score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}