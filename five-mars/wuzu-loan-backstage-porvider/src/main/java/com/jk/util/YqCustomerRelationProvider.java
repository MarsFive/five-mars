package com.jk.util;

import com.jk.vo.ZxyDhk;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/17.
 */
public class YqCustomerRelationProvider {

    public String listByYqAttr(Map<String, Object> params) {
        ZxyDhk qo = (ZxyDhk) params.get("dhk");
       Integer yfei=qo.getYfei();
        SQL querySql = new SQL();
        querySql.SELECT("*")
                .FROM("z_dhk")
                .WHERE("ydate > 30 and ydate < 60");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }
        Integer jilu = qo.getJilu();
        if (jilu != null) {
            querySql.WHERE(" jilu = "+jilu);
        }

        Integer page = (Integer)params.get("page");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+","+rows;
    }


    public String countByYqAttr(Map<String, Object> params){
        ZxyDhk qo = (ZxyDhk) params.get("dhk");
        Integer yfei=qo.getYfei();
        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("z_dhk")
                .WHERE("ydate > 30 and ydate < 60");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }
        Integer jilu = qo.getJilu();
        if (jilu != null) {
            querySql.WHERE(" jilu = "+jilu);
        }
        return querySql.toString();
    }
}
