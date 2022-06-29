package com.fedormulashkin.objectsfromdocument.certificationorgan;

import java.util.Objects;

public class Expert {
    private String Surname;
    private String Name;
    private String Patronymic;

    public Expert() {
    }

    public Expert(String surname, String name, String patronymic) {
        this.Surname = surname;
        this.Name = name;
        this.Patronymic = patronymic;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.Patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Expert{" +
                "surname='" + Surname + '\'' +
                ", name='" + Name + '\'' +
                ", patronymic='" + Patronymic + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expert expert)) return false;
        return Objects.equals(Surname, expert.Surname) &&
                Objects.equals(Name, expert.Name) &&
                Objects.equals(Patronymic, expert.Patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Surname, Name, Patronymic);
    }
}
