package com.company.abstractFactory;

import com.company.abstractFactory.colors.Color;
import com.company.abstractFactory.shapes.Shape;

/**
 * Created by KieVN on 08.04.2015.
 */
public interface ConcreteFactory {
    public Shape getShape(ShapeOrColor shape);
    public Color getColor(ShapeOrColor shape);
}
