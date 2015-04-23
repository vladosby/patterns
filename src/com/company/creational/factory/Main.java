package com.company.factory;

/**
 * Created by kievn on 14.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal squirrel = animalFactory.getAnimal("Squirrel");
        squirrel.doSound();

        Animal cat = animalFactory.getAnimal("cat");
        cat.doSound();

    }
}
