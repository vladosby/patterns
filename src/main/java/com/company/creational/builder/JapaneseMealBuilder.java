package com.company.builder;

/**
 * Created by kievn on 13.04.2015.
 */
public class JapaneseMealBuilder implements MealBulder {
    private Meal meal;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Sake");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Chicken");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
