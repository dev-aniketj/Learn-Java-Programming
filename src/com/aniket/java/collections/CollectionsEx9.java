package com.aniket.java.collections;

import java.util.Objects;
import java.util.TreeSet;

public class CollectionsEx9 {
    public static void main(String[] args) {
        TreeSet<SomeFruit> set = new TreeSet<>();

        set.add(new SomeFruit("apple"));
        set.add(new SomeFruit("banana"));
        set.add(new SomeFruit("orange"));
        set.add(new SomeFruit("APPLE"));    //should not be display, but it is display,
        // now we are solving this error using equal() ,hashCode(), compareTo()
        System.out.println(set);

    }
}

class SomeFruit implements Comparable<SomeFruit> {
    private String name;

    public SomeFruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomeFruit)) return false;
        SomeFruit someFruit = (SomeFruit) o;
        return Objects.equals(name, someFruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // f1.compareTo(f2);
    @Override
    public int compareTo(SomeFruit o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
