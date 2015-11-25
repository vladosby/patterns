package com.company.builder;

/**
 * Created by kievn on 13.04.2015.
 */
public class Main {

    public static void main(String[] args) {
        MealDirector mealDirector = new MealDirector(new ItalianMealBuilder());
        mealDirector.constructMeal();
        System.out.println(mealDirector.getMeal().toString());

        mealDirector = new MealDirector(new JapaneseMealBuilder());
        mealDirector.constructMeal();
        System.out.println(mealDirector.getMeal().toString());
    }
}
