package com.fedormulashkin.objectsfromdocument;

import java.util.Objects;

public class Manufacturer {
    private String Type;
    private ManufacturerUl ManufacturerUl;
    private ManufacturerAl ManufacturerAl;
    private ManufacturerFl ManufacturerFl;

    public Manufacturer() {
    }

    public Manufacturer(String type, ManufacturerUl manufacturerUl, ManufacturerAl manufacturerAl, ManufacturerFl manufacturerFl) {
        this.Type = type;
        this.ManufacturerUl = manufacturerUl;
        this.ManufacturerAl = manufacturerAl;
        this.ManufacturerFl = manufacturerFl;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public ManufacturerUl getManufacturerUl() {
        return ManufacturerUl;
    }

    public void setManufacturerUl(ManufacturerUl manufacturerUl) {
        this.ManufacturerUl = manufacturerUl;
    }

    public ManufacturerAl getManufacturerAl() {
        return ManufacturerAl;
    }

    public void setManufacturerAl(ManufacturerAl manufacturerAl) {
        this.ManufacturerAl = manufacturerAl;
    }

    public ManufacturerFl getManufacturerFl() {
        return ManufacturerFl;
    }

    public void setManufacturerFl(ManufacturerFl manufacturerFl) {
        this.ManufacturerFl = manufacturerFl;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "type='" + Type + '\'' +
                ", manufacturerUl=" + ManufacturerUl +
                ", manufacturerAl=" + ManufacturerAl +
                ", manufacturerFl=" + ManufacturerFl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer that)) return false;
        return Objects.equals(Type, that.Type) &&
                Objects.equals(ManufacturerUl, that.ManufacturerUl) &&
                Objects.equals(ManufacturerAl, that.ManufacturerAl) &&
                Objects.equals(ManufacturerFl, that.ManufacturerFl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type, ManufacturerUl, ManufacturerAl, ManufacturerFl);
    }
}
