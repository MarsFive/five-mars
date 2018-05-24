package com.jk.vo;

import java.io.Serializable;

/**
 * Created by wangjie on 2018/5/15.
 */
public class User implements Serializable {


    private static final long serialVersionUID = -9043126064411243546L;
    private Integer userid;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                '}';
    }
}
