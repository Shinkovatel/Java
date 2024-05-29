package Seminar.SeminalOOP1;

import java.time.LocalDate;

public class Cat extends Animal2 {

    owner2 owner;

    public Cat(String name, LocalDate birthDate, owner2 owner) {
        super(name, birthDate);
        this.owner = owner;
    }

}
