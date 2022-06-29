package com.fedormulashkin.objectsfromdocument;

import com.fedormulashkin.objectsfromdocument.certificationorgan.Expert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CertificationOrgan {

    private String FullName;
    private String Number;
    private Date DateReg;
    private String Organ;
    private String Head;
    private String AddressLegal;
    private String Address;
    private String Phone;
    private String Fax;
    private String Email;
    private String Ogrn;
    private ArrayList<Expert> Experts;

    public CertificationOrgan() {
    }

    public CertificationOrgan(String fullName, String number, Date dateReg,
                              String organ, String head, String addressLegal,
                              String address, String phone, String fax,
                              String email, String ogrn, ArrayList<Expert> experts) {
        this.FullName = fullName;
        this.Number = number;
        this.DateReg = dateReg;
        this.Organ = organ;
        this.Head = head;
        this.AddressLegal = addressLegal;
        this.Address = address;
        this.Phone = phone;
        this.Fax = fax;
        this.Email = email;
        this.Ogrn = ogrn;
        this.Experts = experts;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public Date getDateReg() {
        return DateReg;
    }

    public void setDateReg(Date dateReg) {
        this.DateReg = dateReg;
    }

    public String getOrgan() {
        return Organ;
    }

    public void setOrgan(String organ) {
        this.Organ = organ;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        this.Head = head;
    }

    public String getAddressLegal() {
        return AddressLegal;
    }

    public void setAddressLegal(String addressLegal) {
        this.AddressLegal = addressLegal;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        this.Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getOgrn() {
        return Ogrn;
    }

    public void setOgrn(String ogrn) {
        this.Ogrn = ogrn;
    }

    public ArrayList<Expert> getExperts() {
        return Experts;
    }

    public void setExperts(ArrayList<Expert> experts) {
        this.Experts = experts;
    }

    @Override
    public String toString() {
        return "CertificationOrgan{" +
                "fullName='" + FullName + '\'' +
                ", number='" + Number + '\'' +
                ", dateReg=" + DateReg +
                ", organ='" + Organ + '\'' +
                ", head='" + Head + '\'' +
                ", addressLegal='" + AddressLegal + '\'' +
                ", address='" + Address + '\'' +
                ", phone='" + Phone + '\'' +
                ", fax='" + Fax + '\'' +
                ", email='" + Email + '\'' +
                ", ogrn='" + Ogrn + '\'' +
                ", experts=" + Experts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CertificationOrgan that)) return false;
        return Objects.equals(FullName, that.FullName) &&
                Objects.equals(Number, that.Number) &&
                Objects.equals(DateReg, that.DateReg) &&
                Objects.equals(Organ, that.Organ) &&
                Objects.equals(Head, that.Head) &&
                Objects.equals(AddressLegal, that.AddressLegal) &&
                Objects.equals(Address, that.Address) &&
                Objects.equals(Phone, that.Phone) &&
                Objects.equals(Fax, that.Fax) &&
                Objects.equals(Email, that.Email) &&
                Objects.equals(Ogrn, that.Ogrn) &&
                Objects.equals(Experts, that.Experts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName, Number, DateReg, Organ, Head,
                AddressLegal, Address, Phone, Fax, Email, Ogrn, Experts);
    }
}
