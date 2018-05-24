package com.jk.vo;

import java.io.Serializable;

public class Repayment implements Serializable {

    private static final long serialVersionUID = 1444555680283073722L;

    private Integer id;

    private String repaymentname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepaymentname() {
        return repaymentname;
    }

    public void setRepaymentname(String repaymentname) {
        this.repaymentname = repaymentname;
    }

    @Override
    public String toString() {
        return "Repayment{" +
                "id=" + id +
                ", repaymentname='" + repaymentname + '\'' +
                '}';
    }
}
