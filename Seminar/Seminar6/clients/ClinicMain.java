package Seminar.Seminar6.clients;

import java.time.LocalDate;

import Seminar.SeminalOOP1.owner2;
import Seminar.Seminar6.Clinic.Clients.Owner;
import Seminar.Seminar6.clients.patients.animal;

public class ClinicMain {

    public static void main(String[] args) {

        // Owner Sasha = new Owner(1, "John");

        animal cat = new animal(1l, "Tom", "Siam", LocalDate.of(2023, 5, 12), new Owner());

        // Owner boris = new Owner();
        // boris.name = "Boris";
        // cat.f();

        System.out.println(cat.getName());
    }
}
