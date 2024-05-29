package Seminar.SeminalOOP1.practice.impl;

public enum TPackage {
    PLASTIC("пластик"), Glass("стекло"), Paper("бумага");

    private final String material;

    TPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
