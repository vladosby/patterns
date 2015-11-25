package com.company.structural.proxy;

/**
 * Created by kievn on 24.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        FastThing fastThing = new FastThing();
        fastThing.sayHello();

        proxy.sayHello();

    }

}
