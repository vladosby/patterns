package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kievn on 17.04.2015.
 */
public class LineComposite implements LineComponent {
    List<LineComponent> components = new ArrayList<LineComponent>();

    @Override
    public void setSize(int size) {
        for (LineComponent component : components) {
            component.setSize(size);
        }
    }

    @Override
    public void setColor(String color) {
        for (LineComponent component : components) {
            component.setColor(color);
        }
    }

    @Override
    public void drow() {
        for (LineComponent component : components) {
            component.drow();
        }
    }

    public List<LineComponent> getComponents() {
        return components;
    }

    public LineComponent getComponent(int index) {
        return components.get(index);
    }

    public void add(LineComponent component) {
        components.add(component);
    }

    public void remove(LineComponent component) {
        components.remove(component);
    }


}
