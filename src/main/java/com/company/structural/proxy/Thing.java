package com.company.structural.proxy;

import java.util.Date;

/**
 * Created by kievn on 24.04.2015.
 */
public abstract class Thing {
    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + " Create time = " + new Date());
    }
}
