package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kievn on 25.04.2015.
 */
public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory;

    private Map<String, Flyweight> flyweightPool;

    private FlyweightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();
    }

    public static FlyweightFactory getInstance() {
        if (flyweightFactory == null) {
            flyweightFactory = new FlyweightFactory();
        }
        return flyweightFactory;
    }

    public Flyweight getFlyweight(String key) {
        if (flyweightPool.containsKey(key)) {
            return flyweightPool.get(key);
        } else {
            Flyweight flyweight;
            if ("add".equals(key)) {
                flyweight = new FlyweightAdder();
            } else {
                flyweight = new FlyweightMultiplier();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }

}
