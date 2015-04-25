package com.company.structural.flyweight;

/**
 * Created by kievn on 25.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);

            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doMath(i, i);
        }
    }
}
