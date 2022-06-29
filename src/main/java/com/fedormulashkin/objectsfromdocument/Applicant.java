package com.fedormulashkin.objectsfromdocument;

import java.util.Objects;

public class Applicant {
    private String ApplicantType;
    private String DeclarantType;

    public Applicant() {
    }

    public Applicant(String applicantType, String declarantType) {
        this.ApplicantType = applicantType;
        this.DeclarantType = declarantType;
    }

    public String getApplicantType() {
        return ApplicantType;
    }

    public void setApplicantType(String applicantType) {
        this.ApplicantType = applicantType;
    }

    public String getDeclarantType() {
        return DeclarantType;
    }

    public void setDeclarantType(String declarantType) {
        this.DeclarantType = declarantType;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantType='" + ApplicantType + '\'' +
                ", declarantType='" + DeclarantType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Applicant applicant)) return false;
        return Objects.equals(ApplicantType, applicant.ApplicantType) &&
                Objects.equals(DeclarantType, applicant.DeclarantType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ApplicantType, DeclarantType);
    }
}
