package com.company.structural.flyweight;

/**
 * Created by kievn on 25.04.2015.
 */
public class FlyweightAdder implements Flyweight {
    private String operation;

    public FlyweightAdder() {
        this.operation = "adding";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
    }
}
