package com.jk.util;


import com.jk.vo.Member;
import com.jk.vo.Personal;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class PersonalCustomerRelationProvider {
    public String listByPersonalAttr(Map<String, Object> params) {
        Personal qo = (Personal) params.get("personal");

        SQL querySql = new SQL();
        querySql.SELECT("a.*,b.cardID,b.userName,b.riskAssessment,b.riskCount")
                .FROM("t_member a,t_personal b")
                .WHERE(" a.id=b.id and a.userType='GR' ");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("a.name  like '%"+name+"%'");
        }
        String phone = qo.getPhone();
        if (phone != null && !"".equals(phone)) {
            querySql.WHERE("a.phone like '%"+phone+"%'");
        }
        String userName = qo.getUserName();
        if (userName != null && !"".equals(userName)) {
            querySql.WHERE("b.userName like '%"+userName+"%'");
        }
        String email = qo.getEmail();
        if (email != null && !"".equals(email)) {
            querySql.WHERE("a.email like '%"+email+"%'");
        }
        String empNumber = qo.getEmpNumber();
        if (empNumber != null && !"".equals(empNumber)) {
            querySql.WHERE("a.empNumber  like '%"+empNumber+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" a.creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" a.creatTime < #{member.endCreatTime}");
        }
        String go = qo.getGo();
        if (go != null && !"".equals(go)) {
            querySql.WHERE("a.go = '"+go+"'");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("a.type = '"+type+"'");
        }
        String userType = qo.getUserType();
        if (userType != null && !"".equals(userType)) {
            querySql.WHERE("a.userType = '"+userType+"'");
        }
        Integer start = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        System.out.println(querySql.toString()+" limit "+start+","+rows);
        return querySql.toString()+" limit "+start+","+rows;
    }
    public String countByPersonalAttr(Map<String, Object> params){
        Personal qo = (Personal) params.get("personal");

        SQL querySql = new SQL();
        querySql.SELECT("count(a.id)")
                .FROM("t_member a,t_personal b")
                .WHERE("a.id=b.id and a.userType='GR'");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("a.name like '%"+name+"%'");
        }
        String phone = qo.getPhone();
        if (phone != null && !"".equals(phone)) {
            querySql.WHERE("a.phone like '%"+phone+"%'");
        }
        String userName = qo.getUserName();
        if (userName != null && !"".equals(userName)) {
            querySql.WHERE("b.userName like '%"+userName+"%'");
        }
        String email = qo.getEmail();
        if (email != null && !"".equals(email)) {
            querySql.WHERE("a.email like '%"+email+"%'");
        }
        String empNumber = qo.getEmpNumber();
        if (empNumber != null && !"".equals(empNumber)) {
            querySql.WHERE("a.empNumber like '%"+empNumber+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" a.creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" a.creatTime < #{member.endCreatTime}");
        }
        String go = qo.getGo();
        if (go != null && !"".equals(go)) {
            querySql.WHERE("a.go = '"+go+"'");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("a.type = '"+type+"'");
        }
        String userType = qo.getUserType();
        if (userType != null && !"".equals(userType)) {
            querySql.WHERE("a.userType = '"+userType+"'");
        }
        return querySql.toString();
    }

}
