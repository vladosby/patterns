package com.company.builder;

/**
 * Created by kievn on 13.04.2015.
 */
public class Meal {
    private String drink;
    private String mainCourse;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    @Override
    public String toString() {
        return "drink = " + drink + " Main Course = " + mainCourse;
    }
}
