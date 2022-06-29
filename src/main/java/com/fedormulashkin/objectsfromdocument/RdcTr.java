package com.fedormulashkin.objectsfromdocument;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Objects;

@JsonDeserialize
public class RdcTr {
    private String Type;
    private Requisites Requisites;
    private Applicant Applicant;
    private ApplicantUl ApplicantUl;
    private ApplicantFl ApplicantFl;
    private ApplicantAl ApplicantAl;
    private ApplicantAu ApplicantAu;
    private Manufacturer Manufacturer;
    private Product Product;
    private DeclareAddInfo DeclareAddInfo;
    private CertificationOrgan CertificationOrgan;

    public RdcTr(String type, Requisites requisites, Applicant applicant,
                 ApplicantUl applicantUl, ApplicantFl applicantFl, ApplicantAl applicantAl,
                 ApplicantAu applicantAu, Manufacturer manufacturer, Product product,
                 DeclareAddInfo declareAddInfo, CertificationOrgan certificationOrgan) {
        this.Type = type;
        this.Requisites = requisites;
        this.Applicant = applicant;
        this.ApplicantUl = applicantUl;
        this.ApplicantFl = applicantFl;
        this.ApplicantAl = applicantAl;
        this.ApplicantAu = applicantAu;
        this.Manufacturer = manufacturer;
        this.Product = product;
        this.DeclareAddInfo = declareAddInfo;
        this.CertificationOrgan = certificationOrgan;
    }

    public RdcTr() {
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public Requisites getRequisites() {
        return Requisites;
    }

    public void setRequisites(Requisites requisites) {
        this.Requisites = requisites;
    }

    public Applicant getApplicant() {
        return Applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.Applicant = applicant;
    }

    public ApplicantUl getApplicantUl() {
        return ApplicantUl;
    }

    public void setApplicantUl(ApplicantUl applicantUl) {
        this.ApplicantUl = applicantUl;
    }

    public ApplicantFl getApplicantFl() {
        return ApplicantFl;
    }

    public void setApplicantFl(ApplicantFl applicantFl) {
        this.ApplicantFl = applicantFl;
    }

    public ApplicantAl getApplicantAl() {
        return ApplicantAl;
    }

    public void setApplicantAl(ApplicantAl applicantAl) {
        this.ApplicantAl = applicantAl;
    }

    public ApplicantAu getApplicantAu() {
        return ApplicantAu;
    }

    public void setApplicantAu(ApplicantAu applicantAu) {
        this.ApplicantAu = applicantAu;
    }

    public Manufacturer getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.Manufacturer = manufacturer;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product product) {
        this.Product = product;
    }

    public DeclareAddInfo getDeclareAddInfo() {
        return DeclareAddInfo;
    }

    public void setDeclareAddInfo(DeclareAddInfo declareAddInfo) {
        this.DeclareAddInfo = declareAddInfo;
    }

    public CertificationOrgan getCertificationOrgan() {
        return CertificationOrgan;
    }

    public void setCertificationOrgan(CertificationOrgan certificationOrgan) {
        this.CertificationOrgan = certificationOrgan;
    }

    @Override
    public String toString() {
        return "RdcTr{" +
                "type='" + Type + '\'' +
                ", requisites=" + Requisites +
                ", applicant=" + Applicant +
                ", applicantUl=" + ApplicantUl +
                ", applicantFl=" + ApplicantFl +
                ", applicantAl=" + ApplicantAl +
                ", applicantAu=" + ApplicantAu +
                ", manufacturer=" + Manufacturer +
                ", product=" + Product +
                ", declareAddInfo=" + DeclareAddInfo +
                ", certificationOrgan=" + CertificationOrgan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RdcTr rdcTr)) return false;
        return Objects.equals(Type, rdcTr.Type) &&
                Objects.equals(Requisites, rdcTr.Requisites) &&
                Objects.equals(Applicant, rdcTr.Applicant) &&
                Objects.equals(ApplicantUl, rdcTr.ApplicantUl) &&
                Objects.equals(ApplicantFl, rdcTr.ApplicantFl) &&
                Objects.equals(ApplicantAl, rdcTr.ApplicantAl) &&
                Objects.equals(ApplicantAu, rdcTr.ApplicantAu) &&
                Objects.equals(Manufacturer, rdcTr.Manufacturer) &&
                Objects.equals(Product, rdcTr.Product) &&
                Objects.equals(DeclareAddInfo, rdcTr.DeclareAddInfo) &&
                Objects.equals(CertificationOrgan, rdcTr.CertificationOrgan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type, Requisites, Applicant, ApplicantUl,
                ApplicantFl, ApplicantAl, ApplicantAu, Manufacturer,
                Product, DeclareAddInfo, CertificationOrgan);
    }

}
