package com.jk.vo;

import java.io.Serializable;

public class Attributes implements Serializable {

    private static final long serialVersionUID = 7080232982248477663L;
    
    private Integer id;

    private String attributesname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttributesname() {
        return attributesname;
    }

    public void setAttributesname(String attributesname) {
        this.attributesname = attributesname;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id=" + id +
                ", attributesname='" + attributesname + '\'' +
                '}';
    }
}
