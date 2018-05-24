package com.jk.vo;

import java.io.Serializable;

public class Investortype implements Serializable {

    private static final long serialVersionUID = -44570703458368167L;

    private Integer id;

    private String investortypename;

    public Integer getId() {
        return id;
    }

    public String getInvestortypename() {
        return investortypename;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setInvestortypename(String investortypename) {
        this.investortypename = investortypename;
    }

    @Override
    public String toString() {
        return "Investortype{" +
                "id=" + id +
                ", investortypename='" + investortypename + '\'' +
                '}';
    }
}
