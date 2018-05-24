package com.jk.util;


import com.jk.vo.ZxyCui;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/21.
 */
public class XCuiCustomerRelationProvider {


    public String listByXCuiAttr(Map<String, Object> params) {
        ZxyCui qo = (ZxyCui) params.get("cui");
        String cdate=qo.getCdate();
        SQL querySql = new SQL();
        querySql.SELECT(" *")
                .FROM("z_cui")
                .WHERE(" 1=1");
        String jname = qo.getJname();
        if (jname != null && !"".equals(jname)) {
            querySql.WHERE(" cpeople like '%"+jname+"%'");
        }
        Integer cfan = qo.getCfan();
        if (cfan != null ) {
            querySql.WHERE(" cfan = "+cfan);
        }

        String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" cdate >="+startDate);
        }
        String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" cdate <="+endDate);
        }
        Integer page = (Integer)params.get("page");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+","+rows;
    }


    public String countByXCuiAttr(Map<String, Object> params){
        ZxyCui qo = (ZxyCui) params.get("cui");
        String cdate=qo.getCdate();
        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("z_cui")
                .WHERE(" 1=1 ");
        String cpeople = qo.getCpeople();
        if (cpeople != null && !"".equals(cpeople)) {
            querySql.WHERE(" cpeople like '%"+cpeople+"%'");
        }
        Integer cfan = qo.getCfan();
        if (cfan != null ) {
            querySql.WHERE(" cfan = "+cfan);
        }

        String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" cdate >="+startDate);
        }
        String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" cdate <="+endDate);
        }
        return querySql.toString();
    }
}
