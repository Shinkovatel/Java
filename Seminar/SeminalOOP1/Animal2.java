package Seminar.SeminalOOP1;

import java.time.LocalDate;

public class Animal2 {
    protected String name;
    protected LocalDate startDate;

    public Animal2(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public String getType() {
        return getClass().getSimpleName();
    }
}
