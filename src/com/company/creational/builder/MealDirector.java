package com.company.builder;

/**
 * Created by kievn on 13.04.2015.
 */
public class MealDirector {
    private MealBulder mealBulder;

    public MealDirector(MealBulder mealBulder) {
        this.mealBulder = mealBulder;
    }

    public void constructMeal() {
        mealBulder.buildDrink();
        mealBulder.buildMainCourse();
    }

    public Meal getMeal() {
        return mealBulder.getMeal();
    }
}
