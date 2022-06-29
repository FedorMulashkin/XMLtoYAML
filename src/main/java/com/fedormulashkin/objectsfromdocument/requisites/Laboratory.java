package com.fedormulashkin.objectsfromdocument.requisites;

import java.util.Date;
import java.util.Objects;

public class Laboratory {
    private String NumberReg;
    private String Name;
    private Date DateReg;
    private Date DateExpiry;
    private String Document;
    private String Info;

    public Laboratory() {
    }

    public Laboratory(String numberReg, String name, Date dateReg, Date dateExpiry, String document, String info) {
        NumberReg = numberReg;
        Name = name;
        DateReg = dateReg;
        DateExpiry = dateExpiry;
        Document = document;
        Info = info;
    }

    public String getNumberReg() {
        return NumberReg;
    }

    public void setNumberReg(String numberReg) {
        NumberReg = numberReg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateReg() {
        return DateReg;
    }

    public void setDateReg(Date dateReg) {
        DateReg = dateReg;
    }

    public Date getDateExpiry() {
        return DateExpiry;
    }

    public void setDateExpiry(Date dateExpiry) {
        DateExpiry = dateExpiry;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "NumberReg='" + NumberReg + '\'' +
                ", Name='" + Name + '\'' +
                ", DateReg=" + DateReg +
                ", DateExpiry=" + DateExpiry +
                ", Document='" + Document + '\'' +
                ", Info='" + Info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laboratory that)) return false;
        return Objects.equals(NumberReg, that.NumberReg) &&
                Objects.equals(Name, that.Name) &&
                Objects.equals(DateReg, that.DateReg) &&
                Objects.equals(DateExpiry, that.DateExpiry) &&
                Objects.equals(Document, that.Document) &&
                Objects.equals(Info, that.Info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NumberReg, Name, DateReg, DateExpiry, Document, Info);
    }
}
