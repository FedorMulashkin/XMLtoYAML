package com.fedormulashkin.objectsfromdocument.product;

import java.util.Objects;

public class TechRegs {
    private String TechReg;
    private String TechRegInfo;

    public TechRegs() {
    }

    public TechRegs(String techReg, String techRegInfo) {
        this.TechReg = techReg;
        this.TechRegInfo = techRegInfo;
    }

    public String getTechReg() {
        return TechReg;
    }

    public void setTechReg(String techReg) {
        this.TechReg = techReg;
    }

    public String getTechRegInfo() {
        return TechRegInfo;
    }

    public void setTechRegInfo(String techRegInfo) {
        this.TechRegInfo = techRegInfo;
    }

    @Override
    public String toString() {
        return "TechRegs{" +
                "techReg='" + TechReg + '\'' +
                ", techRegInfo='" + TechRegInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TechRegs techRegs)) return false;
        return Objects.equals(TechReg, techRegs.TechReg) &&
                Objects.equals(TechRegInfo, techRegs.TechRegInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TechReg, TechRegInfo);
    }
}