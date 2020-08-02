package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String vendor;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(vendor, that.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vendor);
    }

    public boolean matches(String search) {
        if (super.matches(search)) return true;
        if (vendor.equalsIgnoreCase(search)) return true;
        return false;
    }
}