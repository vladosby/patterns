package com.company.factory;

/**
 * Created by kievn on 14.04.2015.
 */
public class Cat implements Animal {
    private String sound;

    public Cat() {
        sound = "Cat";
    }

    @Override
    public void doSound() {
        System.out.println(sound);
    }
}
