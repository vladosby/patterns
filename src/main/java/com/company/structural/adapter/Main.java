package com.company.structural.adapter;

/**
 * Created by kievn on 16.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        TemperatureInfo temperatureInfo = new TemperatureAdapter1();
        temperatureInfo.printTemperature();
        temperatureInfo.setTemperature(10);
        temperatureInfo.printTemperature();

        TemperatureInfo temperatureInfo1 = new TemperatureAdapter2();
        temperatureInfo1.setTemperature(11);
        temperatureInfo1.printTemperature();
    }
}
