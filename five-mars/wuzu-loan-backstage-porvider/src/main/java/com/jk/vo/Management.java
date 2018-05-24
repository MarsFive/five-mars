package com.jk.vo;

import java.io.Serializable;

public class Management implements Serializable {

    private static final long serialVersionUID = -7208334002105977591L;

    private Integer id;

    private String biaoid;

    private String borrowingtitle;

    private String investor;

    private Integer investortypeid;

    private String allottedtime;

    private String apr;

    private String amount;

    private String investmenttime;

    private String investortypename;

    private String buyersid;

    private String name;

    private Integer buyerstypeid;

    private String buyertypename;

    private String transferprice;

    private String restperiods;

    private String transferrates;

    private String creditorid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaoid() {
        return biaoid;
    }

    public void setBiaoid(String biaoid) {
        this.biaoid = biaoid;
    }

    public String getBorrowingtitle() {
        return borrowingtitle;
    }

    public void setBorrowingtitle(String borrowingtitle) {
        this.borrowingtitle = borrowingtitle;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public Integer getInvestortypeid() {
        return investortypeid;
    }

    public void setInvestortypeid(Integer investortypeid) {
        this.investortypeid = investortypeid;
    }

    public String getAllottedtime() {
        return allottedtime;
    }

    public void setAllottedtime(String allottedtime) {
        this.allottedtime = allottedtime;
    }

    public String getApr() {
        return apr;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getInvestmenttime() {
        return investmenttime;
    }

    public void setInvestmenttime(String investmenttime) {
        this.investmenttime = investmenttime;
    }

    public String getInvestortypename() {
        return investortypename;
    }

    public void setInvestortypename(String investortypename) {
        this.investortypename = investortypename;
    }

    public String getBuyersid() {
        return buyersid;
    }

    public void setBuyersid(String buyersid) {
        this.buyersid = buyersid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuyertypename() {
        return buyertypename;
    }

    public void setBuyertypename(String buyertypename) {
        this.buyertypename = buyertypename;
    }

    public Integer getBuyerstypeid() {
        return buyerstypeid;
    }

    public void setBuyerstypeid(Integer buyerstypeid) {
        this.buyerstypeid = buyerstypeid;
    }

    public String getTransferprice() {
        return transferprice;
    }

    public void setTransferprice(String transferprice) {
        this.transferprice = transferprice;
    }

    public String getRestperiods() {
        return restperiods;
    }

    public void setRestperiods(String restperiods) {
        this.restperiods = restperiods;
    }

    public String getTransferrates() {
        return transferrates;
    }

    public void setTransferrates(String transferrates) {
        this.transferrates = transferrates;
    }

    public String getCreditorid() {
        return creditorid;
    }

    public void setCreditorid(String creditorid) {
        this.creditorid = creditorid;
    }

    @Override
    public String toString() {
        return "Management{" +
                "id=" + id +
                ", biaoid='" + biaoid + '\'' +
                ", borrowingtitle='" + borrowingtitle + '\'' +
                ", investor='" + investor + '\'' +
                ", investortypeid=" + investortypeid +
                ", allottedtime='" + allottedtime + '\'' +
                ", apr='" + apr + '\'' +
                ", amount='" + amount + '\'' +
                ", investmenttime='" + investmenttime + '\'' +
                ", investortypename='" + investortypename + '\'' +
                ", buyersid='" + buyersid + '\'' +
                ", name='" + name + '\'' +
                ", buyerstypeid=" + buyerstypeid +
                ", buyertypename='" + buyertypename + '\'' +
                ", transferprice='" + transferprice + '\'' +
                ", restperiods='" + restperiods + '\'' +
                ", transferrates='" + transferrates + '\'' +
                ", creditorid='" + creditorid + '\'' +
                '}';
    }
}