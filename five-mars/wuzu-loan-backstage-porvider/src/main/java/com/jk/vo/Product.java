package com.jk.vo;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 5346725141764620484L;

    private Integer id;

    private String productname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                '}';
    }
}
