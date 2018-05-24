package com.jk.dao;

import com.jk.util.JkCustomerRelationProvider;
import com.jk.vo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface WzmJkDao {

    @SelectProvider(type = JkCustomerRelationProvider.class, method = "listByJkAttr")
    List<Borrowingmanagement> queryJkPage(@Param("borrowingmanagement") Borrowingmanagement borrowingmanagement, @Param("start") int start, @Param("rows") int rows);

    @SelectProvider(type = JkCustomerRelationProvider.class, method = "countByJkAttr")
    Long queryJkTotal(@Param("borrowingmanagement") Borrowingmanagement borrowingmanagement);

    @Select("select * from t_attributes")
    List<Attributes> getbiaoname();

    @Select("select * from t_identifying")
    List<Identifying> getbsname();

    @Select("select * from t_product")
    List<Product> getcpname();

    @Select("select * from t_repayment")
    List<Repayment> gethkname();

    @Select("select * from t_state")
    List<State> getztname();

    @Select(" select t.*,a.attributesname,b.identifyingname,c.productname,d.repaymentname,e.statename " +
            "from t_borrowingmanagement t ,t_attributes a,t_identifying b,t_product c,t_repayment d,t_state e " +
            "where a.id=t.attributesid and b.id=t.identifyingid and c.id=t.productid and d.id=t.repaymentid and e.id=t.stateid and xuhao=#{xuhao}")
    Borrowingmanagement getXmList(String xuhao);

    //新增投资
    @Insert("insert into t_borrowingmanagement\n" +
            "\t(productid,\n" +
            "\tloanaccount,\n" +
            "\tborrowingtitle,\n" +
            "\tamountloan,\n" +
            "\tattributesid,\n" +
            "\tidentifyingid,\n" +
            "\trepaymentid,\n" +
            "\tpayment) \n" +
            "\tdated) \n" +
            "\tapr) \n" +
            "\ttransactionrate) \n" +
            "\tmanagementrate) \n" +
            "\tlatepenalty) \n" +
            "\tfundraisingdeadline) \n" +
            "\tinvestmentamount) \n" +
            "\tmaxinvestmentamount) \n" +
            "\tactivitymode) \n" +
            "\tinvestmentside) \n" +
            "\tdescribe) \n" +
            "\tvalues\n" +
            "\t(#{productid},#{loanaccount},#{borrowingtitle},#{amountloan},#{attributesid},#{identifyingid},#{repaymentid},#{payment}" +
            "#{dated},#{apr},#{transactionrate},#{managementrate},#{latepenalty},#{fundraisingdeadline},#{investmentamount},#{maxinvestmentamount},#{activitymode},#{investmentside},#{describe})")
    Integer addJk(Borrowingmanagement borrowingmanagement);
}
