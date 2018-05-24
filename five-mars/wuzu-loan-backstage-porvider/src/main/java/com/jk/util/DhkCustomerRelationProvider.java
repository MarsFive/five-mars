package com.jk.util;


import com.jk.vo.ZxyDhk;
import org.apache.ibatis.jdbc.SQL;


import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class DhkCustomerRelationProvider {
    public String listByDhkAttr(Map<String, Object> params) {
        ZxyDhk qo = (ZxyDhk) params.get("dhk");

        SQL querySql = new SQL();
        querySql.SELECT("*")
                .FROM("z_dhk")
                .WHERE("ydate < 30");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }
        String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate >='"+startDate+"'");
        }
        String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate <='"+endDate+"'");
        }
        Integer page = (Integer)params.get("page");
        Integer rows = (Integer)params.get("rows");
        System.out.println(querySql.toString()+" limit "+page+","+rows);
        return querySql.toString()+" limit "+page+","+rows;
    }
    public String countByDhkAttr(Map<String, Object> params){
        ZxyDhk qo = (ZxyDhk) params.get("dhk");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("z_dhk")
                .WHERE("ydate < 30");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%"+title+"%'");
        }
        String nexthdate=qo.getNexthdate();
        String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate >='"+startDate+"'");
        }
        String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate <='"+endDate+"'");
        }
        return querySql.toString();
    }
}
