package com.jk.util;


import com.jk.vo.Borrowingmanagement;
import org.apache.ibatis.jdbc.SQL;


import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/5/16.
 */
public class JkCustomerRelationProvider {
    public String listByJkAttr(Map<String, Object> params) {
        Borrowingmanagement borrowingmanagement = (Borrowingmanagement) params.get("borrowingmanagement");

        SQL querySql = new SQL();
        querySql.SELECT("t.*,a.attributesname,b.identifyingname,c.productname,d.repaymentname,e.statename")
                .FROM("t_borrowingmanagement t ,t_attributes a,t_identifying b,t_product c,t_repayment d,t_state e")
                .WHERE("a.id=t.attributesid and b.id=t.identifyingid and c.id=t.productid and d.id=t.repaymentid and e.id=t.stateid");
        String biaoid = borrowingmanagement.getBiaoid();
        if (biaoid != null && !"".equals(biaoid)) {
            querySql.WHERE("t.biaoid like '%"+biaoid+"%'");
        }
        String productname = borrowingmanagement.getProductname();
        if (productname != null && !"".equals(productname)) {
            querySql.WHERE("t.productname  = '"+productname+"'");
        }
        String borrowingtitle = borrowingmanagement.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("t.borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String loanaccount = borrowingmanagement.getLoanaccount();
        if (loanaccount != null && !"".equals(loanaccount)) {
            querySql.WHERE(" t.loanaccount like '%"+loanaccount+"%'");
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
    public String countByJkAttr(Map<String, Object> params){
        Borrowingmanagement borrowingmanagement = (Borrowingmanagement) params.get("borrowingmanagement");

        SQL querySql = new SQL();
        querySql.SELECT("count(*)")
                .FROM("t_borrowingmanagement")
                .WHERE("1=1");
        String biaoid = borrowingmanagement.getBiaoid();
        if (biaoid != null && !"".equals(biaoid)) {
            querySql.WHERE("biaoid like '%"+biaoid+"%'");
        }
        String productname = borrowingmanagement.getProductname();
        if (productname != null && !"".equals(productname)) {
            querySql.WHERE("productname  = '"+productname+"'");
        }
        String borrowingtitle = borrowingmanagement.getBorrowingtitle();
        if (borrowingtitle != null && !"".equals(borrowingtitle)) {
            querySql.WHERE("borrowingtitle like '%"+borrowingtitle+"%'");
        }
        String loanaccount = borrowingmanagement.getLoanaccount();
        if (loanaccount != null && !"".equals(loanaccount)) {
            querySql.WHERE(" loanaccount like '%"+loanaccount+"%'");
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
