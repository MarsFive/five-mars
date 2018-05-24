package com.jk.vo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/5/18.
 */
public class ZxyCui implements Serializable {


    private Integer id;
    private Integer jid;
    private String  jname;
    private Integer cfan;
    private String  cpeople;
    private String  cdate;
    private String  jinfo;
    private String  bzhu;

    private String startDate;
    private String endDate;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public Integer getCfan() {
        return cfan;
    }

    public void setCfan(Integer cfan) {
        this.cfan = cfan;
    }

    public String getCpeople() {
        return cpeople;
    }

    public void setCpeople(String cpeople) {
        this.cpeople = cpeople;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getJinfo() {
        return jinfo;
    }

    public void setJinfo(String jinfo) {
        this.jinfo = jinfo;
    }

    public String getBzhu() {
        return bzhu;
    }

    public void setBzhu(String bzhu) {
        this.bzhu = bzhu;
    }

    @Override
    public String toString() {
        return "ZxyCui{" +
                "id=" + id +
                ", jid=" + jid +
                ", jname='" + jname + '\'' +
                ", cfan=" + cfan +
                ", cpeople='" + cpeople + '\'' +
                ", cdate='" + cdate + '\'' +
                ", jinfo='" + jinfo + '\'' +
                ", bzhu='" + bzhu + '\'' +
                '}';
    }
}
