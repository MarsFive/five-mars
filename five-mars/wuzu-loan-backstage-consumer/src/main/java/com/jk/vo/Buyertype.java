package com.jk.vo;

import java.io.Serializable;

public class Buyertype implements Serializable {

    private static final long serialVersionUID = -5893584168425585165L;

    private Integer id;

    private String buyertypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyertypename() {
        return buyertypename;
    }

    public void setBuyertypename(String buyertypename) {
        this.buyertypename = buyertypename;
    }

    @Override
    public String toString() {
        return "Buyertype{" +
                "id=" + id +
                ", buyertypename='" + buyertypename + '\'' +
                '}';
    }
}
