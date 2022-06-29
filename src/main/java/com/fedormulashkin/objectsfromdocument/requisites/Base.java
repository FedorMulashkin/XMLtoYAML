package com.fedormulashkin.objectsfromdocument.requisites;

import java.util.Objects;

public class Base {
    private String string;

    public Base() {
    }

    public Base(String string) {
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
        return "Base{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Base base)) return false;
        return Objects.equals(string, base.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
