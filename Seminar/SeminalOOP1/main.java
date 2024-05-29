package Seminar.SeminalOOP1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Cat barsik = new Cat("sdsd", LocalDate.of(1211, 4, 3), new owner2());
        Animal2 animal2 = new Animal2("Animal2", LocalDate.now());

        // System.out.println(barsik.birthDate());

        barsik.setName("Mfd");

        System.out.println(barsik.getType());

        Animal2 animalCat = new Cat("Cat2", LocalDate.now(), new owner2());

    }
}
