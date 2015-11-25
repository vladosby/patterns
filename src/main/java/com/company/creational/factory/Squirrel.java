package com.company.factory;

/**
 * Created by kievn on 14.04.2015.
 */
public class Squirrel implements Animal{
    private String sound;

    public Squirrel() {
        sound = "Squirrel";
    }

    @Override
    public void doSound() {
        System.out.println(sound);
    }
}
