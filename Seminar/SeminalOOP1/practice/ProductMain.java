package Seminar.SeminalOOP1.practice;

import Seminar.SeminalOOP1.practice.impl.HotDrink;
import Seminar.SeminalOOP1.practice.impl.TPackage;
import Seminar.SeminalOOP1.practice.impl.VendingHotDrink;
import Seminar.SeminalOOP1.practice.impl.WatelBottel;
import Seminar.SeminalOOP1.practice.impl.WaterVendingMashine1;
import java.time.LocalDate;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        product2 beer = new WatelBottel("Клинское", 200, 0.5f, LocalDate.of(2024, 5, 12));
        product2 Tonic = new WatelBottel("Tonic", 200, 1.5f, LocalDate.of(2024, 4, 29), TPackage.PLASTIC.getMaterial(),
                true);

        VandingMachine machine = new WaterVendingMashine1();

        System.out.println(machine.getProduct1());

        machine.addProduct1(List.of(beer, Tonic, beer, Tonic, beer, Tonic));

        System.out.println(machine.getProduct1());

        // machine.getProducts1("Клинское");

        System.out.println(machine.getProduct1());

        product2 Cacao = new HotDrink("Cacao", 170, 0.3f, "Mokko", 60, TPackage.Paper.getMaterial(),
                LocalDate.of(2024, 5, 29));
        product2 coffee = new HotDrink("coffee", 270, 0.5f, "Latte", 50, TPackage.Paper.getMaterial(),
                LocalDate.of(2024, 5, 29));
        product2 coffee2 = new HotDrink("coffee2", 270, 0.4f, "Americano", 50, TPackage.Paper.getMaterial(),
                LocalDate.of(2024, 5, 29));

        VandingMachine CoffeeMachine = new VendingHotDrink();

        System.out.println(CoffeeMachine.getProduct1());

        CoffeeMachine.addProduct1(List.of(Cacao, coffee2, coffee, coffee2, Cacao));

        System.out.println(CoffeeMachine.getProduct1());

        CoffeeMachine.getProducts1("coffee2", 0.4f, 50);

        System.out.println(CoffeeMachine.getProduct1());

    }
}