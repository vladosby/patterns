package com.company.abstractFactory.colors;

import com.company.abstractFactory.ConcreteFactory;
import com.company.abstractFactory.ShapeOrColor;
import com.company.abstractFactory.shapes.Shape;

/**
 * Created by KieVN on 08.04.2015.
 */
public class ColorFactory implements ConcreteFactory {
    @Override
    public Color getColor(ShapeOrColor color) {
        if (ShapeOrColor.RED.equals(color)){
            return new Red();
        } else if(ShapeOrColor.WHITE.equals(color)) {
            return new White();
        }
        return null;
    }

    @Override
    public Shape getShape(ShapeOrColor shape) {
        return null;
    }
}
