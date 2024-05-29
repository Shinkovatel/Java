package Seminar.SeminalOOP1.practice;

import java.time.LocalDate;
import Seminar.SeminalOOP1.practice.impl.WatelBottel;

public class product2 {
    protected String name;
    protected double price;
    protected LocalDate releaseDate;
    protected float volume1;
    protected int temperature;

    public product2(String name, double price, float volume1, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.volume1 = volume1;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getVolume1() { // перенес из WaterBottel для проверки идеи
        return volume1;
    }

    public int getTemperature() {// перенес из HotDrink для проверки идеи
        return temperature;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Product {" + "name=" + '\'' + name +
                " price=" + price +
                " releaseDate=" + releaseDate + '}';
    }
}
