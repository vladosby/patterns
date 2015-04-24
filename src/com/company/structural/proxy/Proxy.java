package com.company.structural.proxy;

import java.util.Date;

/**
 * Created by kievn on 24.04.2015.
 */
public class Proxy {
    SlowThing slowThing;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        slowThing.sayHello();
    }
}
