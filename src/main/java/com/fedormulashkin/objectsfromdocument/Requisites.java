package com.fedormulashkin.objectsfromdocument;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fedormulashkin.objectsfromdocument.requisites.BaseDeclaration;

import java.util.Date;
import java.util.Objects;

@JsonTypeName
public class Requisites {
    private String Status;
    private String Section;
    private Date DateReg;
    private Date DateExpiry;
    private String Number;
    private Object NoExpiry;
    private BaseDeclaration BaseDeclaration;
    private Object Discontinued;

    public Requisites() {
    }

    public Requisites(String status, String section, Date dateReg,
                      Date dateExpiry, String number, Object noExpiry,
                      BaseDeclaration baseDeclaration, Object discontinued) {
        this.Status = status;
        this.Section = section;
        this.DateReg = dateReg;
        DateExpiry = dateExpiry;
        this.Number = number;
        this.NoExpiry = noExpiry;
        this.BaseDeclaration = baseDeclaration;
        this.Discontinued = discontinued;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        this.Section = section;
    }

    public Date getDateReg() {
        return DateReg;
    }

    public void setDateReg(Date dateReg) {
        this.DateReg = dateReg;
    }

    public Date getDateExpiry() {
        return DateExpiry;
    }

    public void setDateExpiry(Date dateExpiry) {
        DateExpiry = dateExpiry;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public Object getNoExpiry() {
        return NoExpiry;
    }

    public void setNoExpiry(Object noExpiry) {
        this.NoExpiry = noExpiry;
    }

    public BaseDeclaration getBaseDeclaration() {
        return BaseDeclaration;
    }

    public void setBaseDeclaration(BaseDeclaration baseDeclaration) {
        this.BaseDeclaration = baseDeclaration;
    }

    public Object getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(Object discontinued) {
        this.Discontinued = discontinued;
    }

    @Override
    public String toString() {
        return "Requisites{" +
                "status='" + Status + '\'' +
                ", section='" + Section + '\'' +
                ", dateReg=" + DateReg +
                ", DateExpiry=" + DateExpiry +
                ", number='" + Number + '\'' +
                ", noExpiry=" + NoExpiry +
                ", baseDeclaration=" + BaseDeclaration +
                ", discontinued=" + Discontinued +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Requisites that)) return false;
        return Objects.equals(Status, that.Status) &&
                Objects.equals(Section, that.Section) &&
                Objects.equals(DateReg, that.DateReg) &&
                Objects.equals(DateExpiry, that.DateExpiry) &&
                Objects.equals(Number, that.Number) &&
                Objects.equals(NoExpiry, that.NoExpiry) &&
                Objects.equals(BaseDeclaration, that.BaseDeclaration) &&
                Objects.equals(Discontinued, that.Discontinued);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Status, Section, DateReg, DateExpiry,
                Number, NoExpiry, BaseDeclaration, Discontinued);
    }
}
