package com.jk.util;


import com.jk.vo.Management;
import org.apache.ibatis.jdbc.SQL;


import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class DzCustomerRelationProvider {
    public String listByDzAttr(Map<String, Object> params) {//待转让
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename,m.name,b.buyertypename")
                .FROM("t_management t ,t_investortype y,t_member m,t_buyertype b")
                .WHERE("y.id=t.investortypeid and b.id=t.buyerstypeid and m.id=t.buyersid and zt=2");
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

    public String countByDzAttr(Map<String, Object> params){
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_management")
                .WHERE("zt=2");
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

    public String listByZrAttr(Map<String, Object> params) {//转让中
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename,m.name,b.buyertypename")
                .FROM("t_management t ,t_investortype y,t_member m,t_buyertype b")
                .WHERE("y.id=t.investortypeid and b.id=t.buyerstypeid and m.id=t.buyersid and zt=3");
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

    public String countByZrAttr(Map<String, Object> params){
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

    public String listByYzAttr(Map<String, Object> params) {//已转让
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename,m.name,b.buyertypename")
                .FROM("t_management t ,t_investortype y,t_member m,t_buyertype b")
                .WHERE("y.id=t.investortypeid and b.id=t.buyerstypeid and m.id=t.buyersid zt=");
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

    public String countByYzAttr(Map<String, Object> params){
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

    public String listBySbAttr(Map<String, Object> params) {//转让失败
        Management management = (Management) params.get("management");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,y.investortypename,m.name,b.buyertypename")
                .FROM("t_management t ,t_investortype y,t_member m,t_buyertype b")
                .WHERE("y.id=t.investortypeid and b.id=t.buyerstypeid and m.id=t.buyersid");
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

    public String countSbDzAttr(Map<String, Object> params){
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
