package com.jk.util;


import com.jk.vo.Company;
import com.jk.vo.Personal;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class companyCustomerRelationProvider {
    public String listByCompanyAttr(Map<String, Object> params) {
        Company qo = (Company) params.get("company");

        SQL querySql = new SQL();
        querySql.SELECT("b.*,a.name,a.pwd,a.phone,a.email,a.type,a.go,a.creatTime,a.userType,a.empNumber")
                .FROM("company b,t_member a")
                .WHERE(" a.id=b.id and a.userType='QY' ");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("a.name  like '%"+name+"%'");
        }
        String companyName = qo.getCompanyName();
        if (companyName != null && !"".equals(companyName)) {
            querySql.WHERE("b.companyName like '%"+companyName+"%'");
        }
        String corporateContacts = qo.getCorporateContacts();
        if (companyName != null && !"".equals(companyName)) {
            querySql.WHERE("b.corporateContacts like '%"+corporateContacts+"%'");
        }
        String ccPhone = qo.getCcPhone();
        if (ccPhone != null && !"".equals(ccPhone)) {
            querySql.WHERE("b.ccPhone  like '%"+ccPhone+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" a.creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" a.creatTime < #{member.endCreatTime}");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("a.type = '"+type+"'");
        }
        Integer investment = qo.getIsInvestment();
        if (investment != null) {
            querySql.WHERE("b.isInvestment = "+investment);
        }
        Integer start = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        System.out.println(querySql.toString()+" limit "+start+","+rows);
        return querySql.toString()+" limit "+start+","+rows;
    }
    public String countByCompanyAttr(Map<String, Object> params){
        Company qo = (Company) params.get("company");
        SQL querySql = new SQL();
        querySql.SELECT("count(b.id)")
                .FROM("company b,t_member a")
                .WHERE(" a.id=b.id and a.userType='QY' ");
        String name = qo.getName();
        if (name != null && !"".equals(name)) {
            querySql.WHERE("a.name  like '%"+name+"%'");
        }
        String companyName = qo.getCompanyName();
        if (companyName != null && !"".equals(companyName)) {
            querySql.WHERE("b.companyName like '%"+companyName+"%'");
        }
        String corporateContacts = qo.getCorporateContacts();
        if (companyName != null && !"".equals(companyName)) {
            querySql.WHERE("b.corporateContacts like '%"+corporateContacts+"%'");
        }
        String ccPhone = qo.getCcPhone();
        if (ccPhone != null && !"".equals(ccPhone)) {
            querySql.WHERE("b.ccPhone  like '%"+ccPhone+"%'");
        }
        String startCreatTime = qo.getStartCreatTime();
        if (startCreatTime != null && !"".equals(startCreatTime)) {
            querySql.WHERE(" a.creatTime > #{member.startCreatTime}");
        }
        String endCreatTime = qo.getEndCreatTime();
        if (endCreatTime != null && !"".equals(endCreatTime)) {
            querySql.WHERE(" a.creatTime < #{member.endCreatTime}");
        }
        String type = qo.getType();
        if (type != null && !"".equals(type)) {
            querySql.WHERE("a.type = '"+type+"'");
        }
        Integer investment = qo.getIsInvestment();
        if (investment != null) {
            querySql.WHERE("b.isInvestment = "+investment);
        }
        return querySql.toString();
    }

}
