package Seminar.SeminalOOP1.practice;

import java.util.ArrayList;
import java.util.List;
import Seminar.SeminalOOP1.practice.impl.WatelBottel;

public class VandingMachine {

    private List<product2> products1;

    public VandingMachine() {
        this.products1 = new ArrayList<>();
    }
    // public void initProduct(List<product> product) {
    // this.procects.addAll(product);
    // }

    public VandingMachine(List<product2> products) {
        this.products1 = products1;
    }

    public void addProduct1(List<product2> products1) {
        this.products1.addAll(products1);
    }

    public product2 getProducts1(String name, float volume1, int temperature) {

        for (product2 product : products1) {
            if (product.getName().equals(name) && (product.getVolume1() >= 0.2)
                    && (product.getTemperature() >= 50)) {
                // product result = product;
                products1.remove(product);
                return product;
            }
        }
        System.out.println("не найдена запись");
        return null;
    }

    public List<product2> getProduct1() {
        return products1;
    }

}
