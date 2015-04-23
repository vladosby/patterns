package com.company.factory;

/**
 * Created by kievn on 14.04.2015.
 */
public class AnimalFactory {
    public Animal getAnimal(String type) {
        if("squirrel".equalsIgnoreCase(type)) {
            return new Squirrel();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }

        return null;
    }
}
