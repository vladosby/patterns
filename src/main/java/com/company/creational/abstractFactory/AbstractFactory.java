package com.company.abstractFactory;

import com.company.abstractFactory.colors.ColorFactory;
import com.company.abstractFactory.shapes.ShapeFactory;

/**
 * Created by KieVN on 08.04.2015.
 */
public class AbstractFactory {
    public ConcreteFactory getFactory(ShapeOrColor type){
        if(ShapeOrColor.SHAPE.equals(type)){
            return new ShapeFactory();
        } else if(ShapeOrColor.COLOR.equals(type)) {
            return new ColorFactory();
        }
        return null;
    }
}
