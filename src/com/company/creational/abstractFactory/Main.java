package com.company.abstractFactory;

import com.company.abstractFactory.colors.Color;

/**
 * Created by KieVN on 08.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        ConcreteFactory factory = abstractFactory.getFactory(ShapeOrColor.COLOR);
        Color color = factory.getColor(ShapeOrColor.WHITE);
        color.fill();

    }
}
