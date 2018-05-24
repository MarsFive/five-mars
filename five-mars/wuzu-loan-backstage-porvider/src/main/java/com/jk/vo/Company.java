package com.jk.vo;

import java.io.Serializable;

/**
 * Created by liukang on 2018/5/18.
 */
public class Company implements Serializable{
    private static final long serialVersionUID = -162728170589327779L;
    private Integer id;
    private String name;
    private String pwd;
    private String phone;
    private String email;
    private String type;
    private String go;
    private String creatTime;
    private String userType;
    private String empNumber;
    private String startCreatTime;
    private String endCreatTime;
    private Integer isTrue;
    private Integer isInvestment;
    private String companyName;
    private String companyText;
    private String businessLicense;
    private String enterpriseTax;
    private String organ;
    private String registeredYear;
    private String registeredCapital;
    private String industry;
    private String scale;
    private String legalPerson;
    private String legalPersonID;
    private String assetValue;
    private String lastYearCash;
    private String certificateNumber;
    private String legalPersonPhone;
    private String legalPersonEmail;
    private String corporateContacts;
    private String ccPhone;
    private String companyNumber;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", go='" + go + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", userType='" + userType + '\'' +
                ", empNumber='" + empNumber + '\'' +
                ", startCreatTime='" + startCreatTime + '\'' +
                ", endCreatTime='" + endCreatTime + '\'' +
                ", isTrue=" + isTrue +
                ", isInvestment=" + isInvestment +
                ", companyName='" + companyName + '\'' +
                ", companyText='" + companyText + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", enterpriseTax='" + enterpriseTax + '\'' +
                ", organ='" + organ + '\'' +
                ", registeredYear='" + registeredYear + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                ", industry='" + industry + '\'' +
                ", scale='" + scale + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", legalPersonID='" + legalPersonID + '\'' +
                ", assetValue='" + assetValue + '\'' +
                ", lastYearCash='" + lastYearCash + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", legalPersonPhone='" + legalPersonPhone + '\'' +
                ", legalPersonEmail='" + legalPersonEmail + '\'' +
                ", corporateContacts='" + corporateContacts + '\'' +
                ", ccPhone='" + ccPhone + '\'' +
                ", companyNumber='" + companyNumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getStartCreatTime() {
        return startCreatTime;
    }

    public void setStartCreatTime(String startCreatTime) {
        this.startCreatTime = startCreatTime;
    }

    public String getEndCreatTime() {
        return endCreatTime;
    }

    public void setEndCreatTime(String endCreatTime) {
        this.endCreatTime = endCreatTime;
    }

    public Integer getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Integer isTrue) {
        this.isTrue = isTrue;
    }

    public Integer getIsInvestment() {
        return isInvestment;
    }

    public void setIsInvestment(Integer isInvestment) {
        this.isInvestment = isInvestment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyText() {
        return companyText;
    }

    public void setCompanyText(String companyText) {
        this.companyText = companyText;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getEnterpriseTax() {
        return enterpriseTax;
    }

    public void setEnterpriseTax(String enterpriseTax) {
        this.enterpriseTax = enterpriseTax;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getRegisteredYear() {
        return registeredYear;
    }

    public void setRegisteredYear(String registeredYear) {
        this.registeredYear = registeredYear;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonID() {
        return legalPersonID;
    }

    public void setLegalPersonID(String legalPersonID) {
        this.legalPersonID = legalPersonID;
    }

    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public String getLastYearCash() {
        return lastYearCash;
    }

    public void setLastYearCash(String lastYearCash) {
        this.lastYearCash = lastYearCash;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
    }

    public String getLegalPersonEmail() {
        return legalPersonEmail;
    }

    public void setLegalPersonEmail(String legalPersonEmail) {
        this.legalPersonEmail = legalPersonEmail;
    }

    public String getCorporateContacts() {
        return corporateContacts;
    }

    public void setCorporateContacts(String corporateContacts) {
        this.corporateContacts = corporateContacts;
    }

    public String getCcPhone() {
        return ccPhone;
    }

    public void setCcPhone(String ccPhone) {
        this.ccPhone = ccPhone;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }
}
