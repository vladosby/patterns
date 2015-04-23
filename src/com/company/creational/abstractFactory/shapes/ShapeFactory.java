package com.company.abstractFactory.shapes;

import com.company.abstractFactory.ConcreteFactory;
import com.company.abstractFactory.ShapeOrColor;
import com.company.abstractFactory.colors.Color;

/**
 * Created by KieVN on 08.04.2015.
 */
public class ShapeFactory implements ConcreteFactory{
    @Override
    public Shape getShape(ShapeOrColor shape) {
        if (ShapeOrColor.RECTANGLE.equals(shape)) {
            return new Rectangle();
        } else if (ShapeOrColor.SQUARE.equals(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(ShapeOrColor shape) {
        return null;
    }
}
