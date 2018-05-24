package com.jk.vo;

import java.io.Serializable;

/**
 * Created by liukang on 2018/5/18.
 */
public class Personal implements Serializable{
    private static final long serialVersionUID = -5732877106599982155L;
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
    private String cardID;
    private String userName;
    private String riskAssessment;
    private String riskCount;

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

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    public String getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(String riskCount) {
        this.riskCount = riskCount;
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

    @Override
    public String toString() {
        return "Personal{" +
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
                ", cardID='" + cardID + '\'' +
                ", userName='" + userName + '\'' +
                ", riskAssessment='" + riskAssessment + '\'' +
                ", riskCount='" + riskCount + '\'' +
                '}';
    }
}
