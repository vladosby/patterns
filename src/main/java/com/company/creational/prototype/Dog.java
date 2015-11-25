package com.company.prototype;

/**
 * Created by kievn on 14.04.2015.
 */
public class Dog implements Prototype {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype doClone() {
        return new Dog(name);
    }
}
