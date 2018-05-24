package com.jk.util;


import com.jk.vo.Member;
import org.apache.ibatis.jdbc.SQL;


import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class MemberCustomerRelationProvider {
    public String listByMemberAttr(Map<String, Object> params) {
        Member qo = (Member) params.get("member");

        SQL querySql = new SQL();
        querySql.SELECT("*")
                .FROM("t_member")
                .WHERE("1=1");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name  like '%"+name+"%'");
        }
        String phone = qo.getPhone();
        if (phone != null && !"".equals(phone)) {
            querySql.WHERE("phone like '%"+phone+"%'");
        }
        String email = qo.getEmail();
        if (email != null && !"".equals(email)) {
            querySql.WHERE("email like '%"+email+"%'");
        }
        String empNumber = qo.getEmpNumber();
        if (empNumber != null && !"".equals(empNumber)) {
            querySql.WHERE("empNumber  like '%"+empNumber+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" creatTime < #{member.endCreatTime}");
        }
        String go = qo.getGo();
        if (go != null && !"".equals(go)) {
            querySql.WHERE("go = '"+go+"'");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("type = '"+type+"'");
        }
        String userType = qo.getUserType();
        if (userType != null && !"".equals(userType)) {
            querySql.WHERE("userType = '"+userType+"'");
        }
        Integer start = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+start+","+rows;
    }
    public String countByMemberAttr(Map<String, Object> params){
        Member qo = (Member) params.get("member");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_member")
                .WHERE("1=1");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("name like '%"+name+"%'");
        }
        String phone = qo.getPhone();
        if (phone != null && !"".equals(phone)) {
            querySql.WHERE("phone like '%"+phone+"%'");
        }
        String email = qo.getEmail();
        if (email != null && !"".equals(email)) {
            querySql.WHERE("email like '%"+email+"%'");
        }
        String empNumber = qo.getEmpNumber();
        if (empNumber != null && !"".equals(empNumber)) {
            querySql.WHERE("empNumber like '%"+empNumber+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" creatTime < #{member.endCreatTime}");
        }
        String go = qo.getGo();
        if (go != null && !"".equals(go)) {
            querySql.WHERE("go = '"+go+"'");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("type = '"+type+"'");
        }
        String userType = qo.getUserType();
        if (userType != null && !"".equals(userType)) {
            querySql.WHERE("userType = '"+userType+"'");
        }
        return querySql.toString();
    }
    public String updateMemberType(Map<String, Object> params){
        SQL querySql = new SQL();
        int id = (int)params.get("id");
        int flag = (int)params.get("flag");
        String temp = "";
        if (flag == 1) {
            temp = "SD";
        }else if (flag == 2){
            temp = "HMD";
        }else if (flag == 3){
            temp = "QY";
        }
        querySql.UPDATE(" t_member ")
                .SET(" type ='"+temp+"' ")
                .WHERE("id="+id);
        System.out.println(querySql.toString());
        return querySql.toString();
    }
}
