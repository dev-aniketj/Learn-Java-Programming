package com.aniket.java.collections;

import java.util.HashSet;
import java.util.Objects;

public class CollectionsEx8 {
    public static void main(String[] args) {
        HashSet<Fruit> set = new HashSet<>();

        set.add(new Fruit("apple"));
        set.add(new Fruit("banana"));
        set.add(new Fruit("orange"));
        set.add(new Fruit("apple"));    //should not be display, but it is display,
        // now we are solving this error using equal() & hashCode()
        System.out.println(set);

    }
}

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Fruit) || o == null)
            return false;

        return name.equalsIgnoreCase(((Fruit) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
