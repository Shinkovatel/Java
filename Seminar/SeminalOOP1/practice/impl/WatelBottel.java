package Seminar.SeminalOOP1.practice.impl;

import Seminar.SeminalOOP1.practice.product2;
import java.time.LocalDate;

public class WatelBottel extends product2 {
    protected float volume1;
    protected String packed;
    protected boolean isSparky;

    public WatelBottel(String name, double price, float volume1, LocalDate releaseDate) {
        super(name, price, volume1, releaseDate);
        this.volume1 = volume1;
        this.isSparky = false;
        this.packed = TPackage.PLASTIC.getMaterial();
    }

    public WatelBottel(String name, double price, float volume1, LocalDate releaseDate, String packed,
            boolean isSparky) {
        super(name, price, volume1, releaseDate);
        this.volume1 = volume1;
        this.isSparky = false;
        this.packed = packed;

    }

    public float getVolume1() {
        return volume1;
    }

    public String getPacked() {
        return packed;
    }

    public boolean isSparky() {
        return isSparky;
    }

    @Override
    public String toString() {

        return "WaterBottel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume1 +
                ", pack='" + packed + '\'' +
                ", isSpark=" + isSparky +
                '}';

    }

}
