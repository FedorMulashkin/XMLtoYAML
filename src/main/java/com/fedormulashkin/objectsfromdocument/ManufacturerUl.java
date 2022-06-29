package com.fedormulashkin.objectsfromdocument;

import com.fedormulashkin.objectsfromdocument.applicant.Address;

import java.util.Date;
import java.util.Objects;

public class ManufacturerUl {
    private String OrganForm;
    private String FullName;
    private String ShortName;
    private String Head;
    private String HeadPost;
    private String HeadText;
    private Address Address;
    private String AddressActual;
    private String Phone;
    private String Fax;
    private String Email;
    private String Organ;
    private java.util.Date Date;
    private String Ogrn;
    private String Inn;
    private String RegInfo;
    private String Contract;

    public ManufacturerUl() {
    }

    public ManufacturerUl(String organForm, String fullName, String shortName, String head,
                          String headPost, String headText, Address address, String addressActual,
                          String phone, String fax, String email, String organ, Date date,
                          String ogrn, String inn, String regInfo, String contract) {
        OrganForm = organForm;
        FullName = fullName;
        ShortName = shortName;
        Head = head;
        HeadPost = headPost;
        HeadText = headText;
        Address = address;
        AddressActual = addressActual;
        Phone = phone;
        Fax = fax;
        Email = email;
        Organ = organ;
        Date = date;
        Ogrn = ogrn;
        Inn = inn;
        RegInfo = regInfo;
        Contract = contract;
    }

    public String getOrganForm() {
        return OrganForm;
    }

    public void setOrganForm(String organForm) {
        this.OrganForm = organForm;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        this.ShortName = shortName;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        this.Head = head;
    }

    public String getHeadPost() {
        return HeadPost;
    }

    public void setHeadPost(String headPost) {
        this.HeadPost = headPost;
    }

    public String getHeadText() {
        return HeadText;
    }

    public void setHeadText(String headText) {
        this.HeadText = headText;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        this.Address = address;
    }

    public String getAddressActual() {
        return AddressActual;
    }

    public void setAddressActual(String addressActual) {
        this.AddressActual = addressActual;
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

    public String getOrgan() {
        return Organ;
    }

    public void setOrgan(String organ) {
        this.Organ = organ;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        this.Date = date;
    }

    public String getOgrn() {
        return Ogrn;
    }

    public void setOgrn(String ogrn) {
        this.Ogrn = ogrn;
    }

    public String getInn() {
        return Inn;
    }

    public void setInn(String inn) {
        this.Inn = inn;
    }

    public String getRegInfo() {
        return RegInfo;
    }

    public void setRegInfo(String regInfo) {
        this.RegInfo = regInfo;
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String contract) {
        this.Contract = contract;
    }

    @Override
    public String toString() {
        return "ManufacturerUl{" +
                "OrganForm='" + OrganForm + '\'' +
                ", FullName='" + FullName + '\'' +
                ", ShortName='" + ShortName + '\'' +
                ", Head='" + Head + '\'' +
                ", HeadPost='" + HeadPost + '\'' +
                ", HeadText='" + HeadText + '\'' +
                ", Address=" + Address +
                ", AddressActual='" + AddressActual + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                ", Email='" + Email + '\'' +
                ", Organ='" + Organ + '\'' +
                ", Date=" + Date +
                ", Ogrn='" + Ogrn + '\'' +
                ", Inn='" + Inn + '\'' +
                ", RegInfo='" + RegInfo + '\'' +
                ", Contract='" + Contract + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManufacturerUl that)) return false;
        return Objects.equals(OrganForm, that.OrganForm) &&
                Objects.equals(FullName, that.FullName) &&
                Objects.equals(ShortName, that.ShortName) &&
                Objects.equals(Head, that.Head) &&
                Objects.equals(HeadPost, that.HeadPost) &&
                Objects.equals(HeadText, that.HeadText) &&
                Objects.equals(Address, that.Address) &&
                Objects.equals(AddressActual, that.AddressActual) &&
                Objects.equals(Phone, that.Phone) &&
                Objects.equals(Fax, that.Fax) &&
                Objects.equals(Email, that.Email) &&
                Objects.equals(Organ, that.Organ) &&
                Objects.equals(Date, that.Date) &&
                Objects.equals(Ogrn, that.Ogrn) &&
                Objects.equals(Inn, that.Inn) &&
                Objects.equals(RegInfo, that.RegInfo) &&
                Objects.equals(Contract, that.Contract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(OrganForm, FullName, ShortName, Head, HeadPost, HeadText, Address, AddressActual, Phone, Fax, Email, Organ, Date, Ogrn, Inn, RegInfo, Contract);
    }
}
