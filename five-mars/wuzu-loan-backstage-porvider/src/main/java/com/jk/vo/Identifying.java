package com.jk.vo;

import java.io.Serializable;

public class Identifying implements Serializable {

    private static final long serialVersionUID = -2084252753293155249L;

    private Integer id;

    private String identifyingname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifyingname() {
        return identifyingname;
    }

    public void setIdentifyingname(String identifyingname) {
        this.identifyingname = identifyingname;
    }

    @Override
    public String toString() {
        return "Identifying{" +
                "id=" + id +
                ", identifyingname='" + identifyingname + '\'' +
                '}';
    }
}
