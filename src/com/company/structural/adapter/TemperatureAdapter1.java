package com.company.structural.adapter;

/**
 * Created by kievn on 16.04.2015.
 */
public class TemperatureAdapter1 extends TemperatureReport implements TemperatureInfo {
    @Override
    public int getTemperature() {
        return getDegree();
    }

    @Override
    public void setTemperature(int temperature) {
        setDegree(temperature);
    }

    @Override
    public void printTemperature() {
        System.out.println(getDegree());
    }
}
