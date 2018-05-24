package com.jk.vo;

import java.io.Serializable;

public class HyMenu implements Serializable{
    private static final long serialVersionUID = -8533084235770249911L;
    private Integer id;
    private Integer pid;
    private String text;
    private String url;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPid() {
        return pid;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }
}
