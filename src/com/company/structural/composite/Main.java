package com.company.structural.composite;

/**
 * Created by kievn on 17.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        LineLeaf lineLeaf1 = new LineLeaf();
        LineLeaf lineLeaf2 = new LineLeaf();
        lineLeaf2.setSize(10);
        lineLeaf2.setColor("red");

        LineComposite lineComposite = new LineComposite();
        lineComposite.add(lineLeaf1);
        lineComposite.add(lineLeaf2);
        lineComposite.setColor("black");
        lineComposite.setSize(11);
        lineComposite.drow();
        System.out.println();

        LineLeaf lineLeaf3 = new LineLeaf();
        lineLeaf3.setSize(10);
        lineLeaf3.setColor("red");
        lineComposite.add(lineLeaf3);
        lineComposite.drow();
    }
}
