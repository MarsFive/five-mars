package com.jk.util;


import com.jk.vo.Management;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class TzCustomerRelationProvider {
    public String listByTzAttr(Map<String, Object> params) {//投资中
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename")
                .FROM("t_management t ,t_investortype y")
                .WHERE("y.id=t.investortypeid and t.zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("t.investor like '%"+investor+"%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("t.borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" t.investortypename = #{investortypename}");
        }
      /*  String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
       /* String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate > #{dhk.startDate}");
        }*/
       /* String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate < #{dhk.endDate}");
        }*/
        Integer page = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+", "+rows;
    }
    public String countByTzAttr(Map<String, Object> params){
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_management")
                .WHERE("zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("investor like '%${investor}%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" investortypename = #{investortypename}");
        }
       /* String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
      /*  String startDate = management.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" investmenttime > #{startDate}");
        }*/
       /* String endDate = management.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" investmenttime < #{endDate}");
        }*/
        return querySql.toString();
    }

    public String listByHkAttr(Map<String, Object> params) {//回款中
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename")
                .FROM("t_management t ,t_investortype y")
                .WHERE("y.id=t.investortypeid and t.zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("t.investor like '%"+investor+"%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("t.borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" t.investortypename = #{investortypename}");
        }
      /*  String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
       /* String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate > #{dhk.startDate}");
        }*/
       /* String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate < #{dhk.endDate}");
        }*/
        Integer page = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+", "+rows;
    }
    public String countByHkAttr(Map<String, Object> params){
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_management")
                .WHERE("zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("investor like '%${investor}%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" investortypename = #{investortypename}");
        }
       /* String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
      /*  String startDate = management.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" investmenttime > #{startDate}");
        }*/
       /* String endDate = management.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" investmenttime < #{endDate}");
        }*/
        return querySql.toString();
    }

    public String listByJqAttr(Map<String, Object> params) {//已结清
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename")
                .FROM("t_management t ,t_investortype y")
                .WHERE("y.id=t.investortypeid and t.zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("t.investor like '%"+investor+"%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("t.borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" t.investortypename = #{investortypename}");
        }
      /*  String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
       /* String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate > #{dhk.startDate}");
        }*/
       /* String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate < #{dhk.endDate}");
        }*/
        Integer page = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+", "+rows;
    }
    public String countByJqAttr(Map<String, Object> params){
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_management")
                .WHERE("zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("investor like '%${investor}%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" investortypename = #{investortypename}");
        }
       /* String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
      /*  String startDate = management.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" investmenttime > #{startDate}");
        }*/
       /* String endDate = management.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" investmenttime < #{endDate}");
        }*/
        return querySql.toString();
    }

    public String listByZcAttr(Map<String, Object> params) {//已转出
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename")
                .FROM("t_management t ,t_investortype y")
                .WHERE("y.id=t.investortypeid and t.zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("t.investor like '%"+investor+"%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("t.borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" t.investortypename = #{investortypename}");
        }
      /*  String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
       /* String startDate = qo.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" nexthdate > #{dhk.startDate}");
        }*/
       /* String endDate = qo.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" nexthdate < #{dhk.endDate}");
        }*/
        Integer page = (Integer)params.get("start");
        Integer rows = (Integer)params.get("rows");
        return querySql.toString()+" limit "+page+", "+rows;
    }
    public String countByZcAttr(Map<String, Object> params){
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_management")
                .WHERE("zt=1");
        String investor = management.getInvestor();
        if (investor != null && !"".equals(investor)) {
            querySql.WHERE("investor like '%${investor}%'");
        }
        String borrowingtitle = management.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String investortypename = management.getInvestortypename();
        if (investortypename != null && !"".equals(investortypename)) {
            querySql.WHERE(" investortypename = #{investortypename}");
        }
       /* String title = qo.getTitle();
        if (title != null && !"".equals(title)) {
            querySql.WHERE("title like '%${dhk.title}%'");
        }*/
      /*  String startDate = management.getStartDate();
        if (startDate != null && !"".equals(startDate)) {
            querySql.WHERE(" investmenttime > #{startDate}");
        }*/
       /* String endDate = management.getEndDate();
        if (endDate != null && !"".equals(endDate)) {
            querySql.WHERE(" investmenttime < #{endDate}");
        }*/
        return querySql.toString();
    }

}
