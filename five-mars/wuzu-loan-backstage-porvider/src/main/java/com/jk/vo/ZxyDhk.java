package com.jk.vo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/5/15.
 */
public class ZxyDhk implements Serializable {

    private Integer id;
    private String  title;
    private String  name;
    private Integer  jkuan;
    private String  qshu;
    private Integer  bhuan;
    private Integer  shuan;
    private String  nextdate;
    private String  nexthdate;
    private Integer  yfei;
    private String  cdate;
    private Integer ydate;
    private Integer cfan;
    private Integer stuas;
    private String startDate;
    private String endDate;
    private Integer jilu;
    private String  cpeople;


    public Integer getYdate() {
        return ydate;
    }

    public void setYdate(Integer ydate) {
        this.ydate = ydate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJkuan() {
        return jkuan;
    }

    public void setJkuan(Integer jkuan) {
        this.jkuan = jkuan;
    }

    public String getQshu() {
        return qshu;
    }

    public void setQshu(String qshu) {
        this.qshu = qshu;
    }

    public Integer getBhuan() {
        return bhuan;
    }

    public void setBhuan(Integer bhuan) {
        this.bhuan = bhuan;
    }

    public Integer getShuan() {
        return shuan;
    }

    public void setShuan(Integer shuan) {
        this.shuan = shuan;
    }

    public String getNextdate() {
        return nextdate;
    }

    public void setNextdate(String nextdate) {
        this.nextdate = nextdate;
    }

    public String getNexthdate() {
        return nexthdate;
    }

    public void setNexthdate(String nexthdate) {
        this.nexthdate = nexthdate;
    }

    public Integer getYfei() {
        return yfei;
    }

    public void setYfei(Integer yfei) {
        this.yfei = yfei;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public Integer getCfan() {
        return cfan;
    }

    public void setCfan(Integer cfan) {
        this.cfan = cfan;
    }

    public Integer getStuas() {
        return stuas;
    }

    public void setStuas(Integer stuas) {
        this.stuas = stuas;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getJilu() {
        return jilu;
    }

    public void setJilu(Integer jilu) {
        this.jilu = jilu;
    }

    public String getCpeople() {
        return cpeople;
    }

    public void setCpeople(String cpeople) {
        this.cpeople = cpeople;
    }

    @Override
    public String toString() {
        return "ZxyDhk{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", jkuan=" + jkuan +
                ", qshu='" + qshu + '\'' +
                ", bhuan=" + bhuan +
                ", shuan=" + shuan +
                ", nextdate='" + nextdate + '\'' +
                ", nexthdate='" + nexthdate + '\'' +
                ", yfei=" + yfei +
                ", cdate='" + cdate + '\'' +
                ", ydate=" + ydate +
                ", cfan=" + cfan +
                ", stuas=" + stuas +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", jilu=" + jilu +
                ", cpeople='" + cpeople + '\'' +
                '}';
    }
}
