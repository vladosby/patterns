package com.company.builder;

/**
 * Created by kievn on 13.04.2015.
 */
public class ItalianMealBuilder implements MealBulder {
    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Red wine");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Pizza");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
