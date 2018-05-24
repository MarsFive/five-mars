package com.jk.vo;

import java.io.Serializable;

public class State implements Serializable {

    private static final long serialVersionUID = 209832536682143563L;

    private Integer id;

    private String statename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", statename='" + statename + '\'' +
                '}';
    }
}
