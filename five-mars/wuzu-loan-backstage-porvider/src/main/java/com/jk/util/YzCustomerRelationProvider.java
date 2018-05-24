package com.jk.util;

import com.jk.vo.ZxyDhk;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/17.
 */
public class YzCustomerRelationProvider {


    public String listByYzAttr(Map<String, Object> params) {
        ZxyDhk qo = (ZxyDhk) params.get("dhk");

        SQL querySql = new SQL();
        querySql.SELECT("*")
                .FROM("z_dhk")
                .WHERE("ydate > 60");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }


        Integer page = (Integer)params.get("page");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+","+rows;
    }


    public String countByYzAttr(Map<String, Object> params){
        ZxyDhk qo = (ZxyDhk) params.get("dhk");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("z_dhk")
                .WHERE("ydate > 60");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }

        return querySql.toString();
    }
}
