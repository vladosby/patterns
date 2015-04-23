package com.company.structural.composite;

/**
 * Created by kievn on 17.04.2015.
 */
public class LineLeaf implements LineComponent {
    private int size;
    private String color;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void drow() {
        System.out.println("Color = " + color + " Size = " + size);
    }
}
