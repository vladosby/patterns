package com.company.structural.proxy;

/**
 * Created by kievn on 24.04.2015.
 */
public class SlowThing extends Thing {
    public SlowThing() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
