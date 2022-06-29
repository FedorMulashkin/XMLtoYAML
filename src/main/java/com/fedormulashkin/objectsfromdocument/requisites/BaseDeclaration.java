package com.fedormulashkin.objectsfromdocument.requisites;

import java.util.Objects;

public class BaseDeclaration {
    private String Documents;
    private String Schema;
    private Base Base;
    private Laboratory Laboratory;

    public BaseDeclaration() {
    }

    public BaseDeclaration(String documents, String schema, Base base, Laboratory laboratory) {
        Documents = documents;
        Schema = schema;
        Base = base;
        Laboratory = laboratory;
    }

    public String getDocuments() {
        return Documents;
    }

    public void setDocuments(String documents) {
        Documents = documents;
    }

    public String getSchema() {
        return Schema;
    }

    public void setSchema(String schema) {
        Schema = schema;
    }

    public com.fedormulashkin.objectsfromdocument.requisites.Base getBase() {
        return Base;
    }

    public void setBase(com.fedormulashkin.objectsfromdocument.requisites.Base base) {
        Base = base;
    }

    public com.fedormulashkin.objectsfromdocument.requisites.Laboratory getLaboratory() {
        return Laboratory;
    }

    public void setLaboratory(com.fedormulashkin.objectsfromdocument.requisites.Laboratory laboratory) {
        Laboratory = laboratory;
    }

    @Override
    public String toString() {
        return "BaseDeclaration{" +
                "Documents='" + Documents + '\'' +
                ", Schema='" + Schema + '\'' +
                ", Base=" + Base +
                ", Laboratory=" + Laboratory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseDeclaration that)) return false;
        return Objects.equals(Documents, that.Documents) &&
                Objects.equals(Schema, that.Schema) &&
                Objects.equals(Base, that.Base) &&
                Objects.equals(Laboratory, that.Laboratory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Documents, Schema, Base, Laboratory);
    }
}
