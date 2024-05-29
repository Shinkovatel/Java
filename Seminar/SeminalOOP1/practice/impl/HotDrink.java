package Seminar.SeminalOOP1.practice.impl;

import java.time.LocalDate;

//import Seminar.SeminalOOP1.practice.product2;
import Seminar.SeminalOOP1.practice.impl.WatelBottel;

public class HotDrink extends WatelBottel {
    protected int temperature; // температура
    protected String type; // тип горячего напитка

    public HotDrink(String name, double price, float volume1, String type, int temperature, String packed,
            LocalDate releaseDate) {
        super(name, price, volume1, releaseDate);
        this.temperature = temperature;
        this.packed = TPackage.Paper.getMaterial();
        this.type = type;

    }

    public int getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {

        return "HotDrink " + "{" + "name= " + name + '\'' + " ,price= " + price +
                " ,volume=" + volume1 + " ,type= " + type +
                " ,temperature= " + temperature +
                " ,packed= " + packed + " ,releaseDate= " + releaseDate + "}";
    }
}
