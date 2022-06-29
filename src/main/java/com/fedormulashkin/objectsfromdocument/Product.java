package com.fedormulashkin.objectsfromdocument;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fedormulashkin.objectsfromdocument.product.TechRegs;

import java.util.Objects;

public class Product {
    private String DeclareType;
    private String DcOriginType;
    private String Name;
    private String ProductInfo;
    private String Okp;
    private String OkpdText;
    private String Standart;
    private String SizeNumber;
    private String DetailsShippingDocumentation;
    private String ContractInfo;
    private String Info;
    private String PlaceMark;
    private TechRegs TechRegs;

    public Product() {
    }

    public Product(String declareType, String dcOriginType, String name,
                   String productInfo, String okp, String okpdText,
                   String standart, String sizeNumber, String detailsShippingDocumentation,
                   String contractInfo, String info, String placeMark, TechRegs techRegs) {
        this.DeclareType = declareType;
        this.DcOriginType = dcOriginType;
        this.Name = name;
        this.ProductInfo = productInfo;
        this.Okp = okp;
        this.OkpdText = okpdText;
        this.Standart = standart;
        this.SizeNumber = sizeNumber;
        this.DetailsShippingDocumentation = detailsShippingDocumentation;
        this.ContractInfo = contractInfo;
        this.Info = info;
        this.PlaceMark = placeMark;
        this.TechRegs = techRegs;
    }

    public String getDeclareType() {
        return DeclareType;
    }

    public void setDeclareType(String declareType) {
        this.DeclareType = declareType;
    }

    public String getDcOriginType() {
        return DcOriginType;
    }

    public void setDcOriginType(String dcOriginType) {
        this.DcOriginType = dcOriginType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String productInfo) {
        this.ProductInfo = productInfo;
    }

    public String getOkp() {
        return Okp;
    }

    public void setOkp(String okp) {
        this.Okp = okp;
    }

    public String getOkpdText() {
        return OkpdText;
    }

    public void setOkpdText(String okpdText) {
        this.OkpdText = okpdText;
    }

    public String getStandart() {
        return Standart;
    }

    public void setStandart(String standart) {
        this.Standart = standart;
    }

    public String getSizeNumber() {
        return SizeNumber;
    }

    public void setSizeNumber(String sizeNumber) {
        this.SizeNumber = sizeNumber;
    }

    public String getDetailsShippingDocumentation() {
        return DetailsShippingDocumentation;
    }

    public void setDetailsShippingDocumentation(String detailsShippingDocumentation) {
        this.DetailsShippingDocumentation = detailsShippingDocumentation;
    }

    public String getContractInfo() {
        return ContractInfo;
    }

    public void setContractInfo(String contractInfo) {
        this.ContractInfo = contractInfo;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        this.Info = info;
    }

    public String getPlaceMark() {
        return PlaceMark;
    }

    public void setPlaceMark(String placeMark) {
        this.PlaceMark = placeMark;
    }

    @JsonIgnore
    public TechRegs getTechRegs() {
        return TechRegs;
    }

    public void setTechRegs(TechRegs techRegs) {
        this.TechRegs = techRegs;
    }

    @Override
    public String toString() {
        return "Product{" +
                "declareType='" + DeclareType + '\'' +
                ", dcOriginType='" + DcOriginType + '\'' +
                ", name='" + Name + '\'' +
                ", productInfo='" + ProductInfo + '\'' +
                ", okp='" + Okp + '\'' +
                ", okpdText='" + OkpdText + '\'' +
                ", standart='" + Standart + '\'' +
                ", sizeNumber='" + SizeNumber + '\'' +
                ", detailsShippingDocumentation='" + DetailsShippingDocumentation + '\'' +
                ", contractInfo='" + ContractInfo + '\'' +
                ", info='" + Info + '\'' +
                ", placeMark='" + PlaceMark + '\'' +
                ", techRegs=" + TechRegs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(DeclareType, product.DeclareType) &&
                Objects.equals(DcOriginType, product.DcOriginType) &&
                Objects.equals(Name, product.Name) &&
                Objects.equals(ProductInfo, product.ProductInfo) &&
                Objects.equals(Okp, product.Okp) &&
                Objects.equals(OkpdText, product.OkpdText) &&
                Objects.equals(Standart, product.Standart) &&
                Objects.equals(SizeNumber, product.SizeNumber) &&
                Objects.equals(DetailsShippingDocumentation, product.DetailsShippingDocumentation) &&
                Objects.equals(ContractInfo, product.ContractInfo) &&
                Objects.equals(Info, product.Info) &&
                Objects.equals(PlaceMark, product.PlaceMark) &&
                Objects.equals(TechRegs, product.TechRegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DeclareType, DcOriginType, Name, ProductInfo,
                Okp, OkpdText, Standart, SizeNumber,
                DetailsShippingDocumentation, ContractInfo, Info, PlaceMark, TechRegs);
    }
}
