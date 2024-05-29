package Seminar.Seminar6.clients.patients;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.xml.crypto.Data;

import Seminar.Seminar6.Clinic.Clients.Owner;
import Seminar.Seminar6.clients.patients.Support.Vaccination;

public class animal {

    private Long id; // приватное поле доступно только внутри класса

    private String name;

    private String breed;

    private LocalDate birthDate;

    private Owner owner;

    protected List<Vaccination> vaccinations = new ArrayList<>();

    // public void f() {
    // name = "dfdf";
    // }

    // у каждого класса есть конструктор, который вызывается через new, его задача
    // проиницализировать, в поля класса какие либо значения.
    // положить

    public animal(long id, String name, String breed, LocalDate birthDate, Owner owner) {
        this.id = id; // id = относиться к полю класс
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.owner = owner;

    }

    public String getName() { // метод Геттер если
        return name;
    }
}
