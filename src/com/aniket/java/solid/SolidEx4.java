package com.aniket.java.solid;

/**
 * I - Interface Segregation Principle
 */

interface VegRestaurant {
    void vegMeals();
}

interface NonVegRestaurant {
    void nonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant {

    @Override
    public void vegMeals() {
        System.out.println("provide veg meals");
    }
}

class XYZVegRestaurant implements VegRestaurant, NonVegRestaurant {

    @Override
    public void vegMeals() {
        System.out.println("provide veg meals");
    }

    @Override
    public void nonVegMeals() {
        System.out.println("provide non-veg meals");
    }
}

public class SolidEx4 {
    public static void main(String[] args) {

        ABCVegRestaurant restaurant1 = new ABCVegRestaurant();
        restaurant1.vegMeals();

        System.out.println();

        XYZVegRestaurant restaurant2 = new XYZVegRestaurant();
        restaurant2.vegMeals();
        restaurant2.nonVegMeals();

    }
}
