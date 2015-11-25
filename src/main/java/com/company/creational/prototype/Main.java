package com.company.prototype;

/**
 * Created by kievn on 14.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car bmw2 = (Car) bmw.doClone();
        System.out.println(bmw2.getModel());

        Dog dog = new Dog("Dog");
        Dog dog2 = (Dog) dog.doClone();
        System.out.println(dog2.getName());
    }
}
