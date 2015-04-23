package com.company.structural.adapter;

/**
 * Created by kievn on 16.04.2015.
 */
public class TemperatureAdapter2 implements TemperatureInfo {
    private TemperatureReport temperatureReport = new TemperatureReport();

    @Override
    public int getTemperature() {
        return temperatureReport.getDegree();
    }

    @Override
    public void setTemperature(int temperature) {
        temperatureReport.setDegree(temperature);
    }

    @Override
    public void printTemperature() {
        System.out.println(temperatureReport.getDegree());
    }
}
