package com.company.prototype;

/**
 * Created by kievn on 14.04.2015.
 */
public class Car implements Prototype {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public Prototype doClone() {
        return new Car(model);
    }
}
