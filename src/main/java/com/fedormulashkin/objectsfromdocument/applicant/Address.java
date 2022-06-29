package com.fedormulashkin.objectsfromdocument.applicant;

import java.util.Objects;

public class Address {
    private String string;

    public Address() {
    }

    public Address(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Address{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(string, address.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
