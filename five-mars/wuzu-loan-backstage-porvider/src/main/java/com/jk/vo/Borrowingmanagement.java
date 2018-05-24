package com.jk.vo;

import java.io.Serializable;

public class Borrowingmanagement implements Serializable {

    private static final long serialVersionUID = 4667559477065490589L;

    private Integer xuhao;

    private String biaoid;

    private Integer productid;

    private String borrowingtitle;

    private String loanaccount;

    private String amountloan;

    private String investmenta;

    private String apr;

    private String deadline;

    private String processingtime;

    private Integer repaymentid;

    private Integer stateid;

    private Integer identifyingid;

    private Integer attributesid;

    private String reward;

    private Integer payment;

    private Integer dated;

    private String transactionrate;

    private String managementrate;

    private String latepenalty;

    private String fundraisingdeadline;

    private String investmentamount;

    private String maxinvestmentamount;

    private Integer activitymode;

    private Integer investmentside;

    private String markicon;

    private String describe;

    //类型name
    private String attributesname;

    private String identifyingname;

    private String productname;

    private String repaymentname;

    private String statename;

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getBiaoid() {
        return biaoid;
    }

    public void setBiaoid(String biaoid) {
        this.biaoid = biaoid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getBorrowingtitle() {
        return borrowingtitle;
    }

    public void setBorrowingtitle(String borrowingtitle) {
        this.borrowingtitle = borrowingtitle;
    }

    public String getLoanaccount() {
        return loanaccount;
    }

    public void setLoanaccount(String loanaccount) {
        this.loanaccount = loanaccount;
    }

    public String getAmountloan() {
        return amountloan;
    }

    public void setAmountloan(String amountloan) {
        this.amountloan = amountloan;
    }

    public String getInvestmenta() {
        return investmenta;
    }

    public void setInvestmenta(String investmenta) {
        this.investmenta = investmenta;
    }

    public String getApr() {
        return apr;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getProcessingtime() {
        return processingtime;
    }

    public void setProcessingtime(String processingtime) {
        this.processingtime = processingtime;
    }

    public Integer getRepaymentid() {
        return repaymentid;
    }

    public void setRepaymentid(Integer repaymentid) {
        this.repaymentid = repaymentid;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public Integer getIdentifyingid() {
        return identifyingid;
    }

    public void setIdentifyingid(Integer identifyingid) {
        this.identifyingid = identifyingid;
    }

    public Integer getAttributesid() {
        return attributesid;
    }

    public void setAttributesid(Integer attributesid) {
        this.attributesid = attributesid;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getDated() {
        return dated;
    }

    public void setDated(Integer dated) {
        this.dated = dated;
    }

    public String getTransactionrate() {
        return transactionrate;
    }

    public void setTransactionrate(String transactionrate) {
        this.transactionrate = transactionrate;
    }

    public String getManagementrate() {
        return managementrate;
    }

    public void setManagementrate(String managementrate) {
        this.managementrate = managementrate;
    }

    public String getLatepenalty() {
        return latepenalty;
    }

    public void setLatepenalty(String latepenalty) {
        this.latepenalty = latepenalty;
    }

    public String getFundraisingdeadline() {
        return fundraisingdeadline;
    }

    public void setFundraisingdeadline(String fundraisingdeadline) {
        this.fundraisingdeadline = fundraisingdeadline;
    }

    public String getInvestmentamount() {
        return investmentamount;
    }

    public void setInvestmentamount(String investmentamount) {
        this.investmentamount = investmentamount;
    }

    public String getMaxinvestmentamount() {
        return maxinvestmentamount;
    }

    public void setMaxinvestmentamount(String maxinvestmentamount) {
        this.maxinvestmentamount = maxinvestmentamount;
    }

    public Integer getActivitymode() {
        return activitymode;
    }

    public void setActivitymode(Integer activitymode) {
        this.activitymode = activitymode;
    }

    public Integer getInvestmentside() {
        return investmentside;
    }

    public void setInvestmentside(Integer investmentside) {
        this.investmentside = investmentside;
    }

    public String getMarkicon() {
        return markicon;
    }

    public void setMarkicon(String markicon) {
        this.markicon = markicon;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAttributesname() {
        return attributesname;
    }

    public void setAttributesname(String attributesname) {
        this.attributesname = attributesname;
    }

    public String getIdentifyingname() {
        return identifyingname;
    }

    public void setIdentifyingname(String identifyingname) {
        this.identifyingname = identifyingname;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getRepaymentname() {
        return repaymentname;
    }

    public void setRepaymentname(String repaymentname) {
        this.repaymentname = repaymentname;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    @Override
    public String toString() {
        return "Borrowingmanagement{" +
                "xuhao=" + xuhao +
                ", biaoid='" + biaoid + '\'' +
                ", productid=" + productid +
                ", borrowingtitle='" + borrowingtitle + '\'' +
                ", loanaccount='" + loanaccount + '\'' +
                ", amountloan='" + amountloan + '\'' +
                ", investmenta='" + investmenta + '\'' +
                ", apr='" + apr + '\'' +
                ", deadline='" + deadline + '\'' +
                ", processingtime='" + processingtime + '\'' +
                ", repaymentid=" + repaymentid +
                ", stateid=" + stateid +
                ", identifyingid=" + identifyingid +
                ", attributesid=" + attributesid +
                ", reward='" + reward + '\'' +
                ", payment=" + payment +
                ", dated=" + dated +
                ", transactionrate='" + transactionrate + '\'' +
                ", managementrate='" + managementrate + '\'' +
                ", latepenalty='" + latepenalty + '\'' +
                ", fundraisingdeadline='" + fundraisingdeadline + '\'' +
                ", investmentamount='" + investmentamount + '\'' +
                ", maxinvestmentamount='" + maxinvestmentamount + '\'' +
                ", activitymode=" + activitymode +
                ", investmentside=" + investmentside +
                ", markicon='" + markicon + '\'' +
                ", describe='" + describe + '\'' +
                ", attributesname='" + attributesname + '\'' +
                ", identifyingname='" + identifyingname + '\'' +
                ", productname='" + productname + '\'' +
                ", repaymentname='" + repaymentname + '\'' +
                ", statename='" + statename + '\'' +
                '}';
    }
}
