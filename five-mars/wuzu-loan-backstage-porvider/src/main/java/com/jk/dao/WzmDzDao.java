package com.jk.dao;

import java.util.List;

import com.jk.util.DhkCustomerRelationProvider;
import com.jk.util.DzCustomerRelationProvider;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;
import org.apache.ibatis.annotations.*;

@Mapper
public interface WzmDzDao {
    //投资
	@SelectProvider(type = DzCustomerRelationProvider.class, method = "listByDzAttr")
	List<Management> queryDzPage(@Param("management") Management management, @Param("start") int start, @Param("rows") int rows);

	@SelectProvider(type = DzCustomerRelationProvider.class, method = "countByDzAttr")
	Long queryDzTotal(@Param("management") Management management);

	//类型
	@Select("select * from t_investortype")
	List<Investortype> getyyname();

	//转出
	@SelectProvider(type = DzCustomerRelationProvider.class, method = "listByDzAttr")
	List<Management> queryZcPage(@Param("management") Management management, @Param("start") int start, @Param("rows") int rows);

	@SelectProvider(type = DzCustomerRelationProvider.class, method = "countByDzAttr")
	Long queryZcTotal(@Param("management") Management management);

	@Select("select * from t_buyertype")
	List<Buyertype> getbtname();

	@Select("select * from t_member")
	List<Member> getmbname();

	/*//新增投资
	@Insert("insert into t_management\n" +
			"\t(biaoid,\n" +
			"\tborrowingtitle,\n" +
			"\tinvestor,\n" +
			"\tinvestortypeid,\n" +
			"\tallottedtime,\n" +
			"\tapr,\n" +
			"\tamount,\n" +
			"\tinvestmenttime) \n" +
			"\tvalues\n" +
			"\t(#{biaoid},#{borrowingtitle},#{investor},#{investortypeid},#{allottedtime},#{apr},#{amount},#{investmenttime})")
	Integer addTz(Management management);

	@Select(" select t.*,y.investortypename from t_management t ,t_investortype y where y.id=t.investortypeid\n" +
			"\n" +
			"\t\t\t\n" +

			" limit #{start},#{rows} ")
    Object queryTz(Management management);

	//收款
	@Select(" select t.*,y.investortypename from t_management t ,t_investortype y where y.id=t.investortypeid and zt=2\n" +
			"\n" +
			"\t\t\t\n" +

			" limit #{start},#{rows} ")
	List<Management> queryHkPage(@Param("management")Management management,@Param("start") int start,@Param("rows") int rows);

	@Select("select count(*) from t_management where zt=2")
	Long queryHkTotal(@Param("management")Management management);

	//结清
	@Select(" select t.*,y.investortypename from t_management t ,t_investortype y where y.id=t.investortypeid and zt=3\n" +
			"\n" +
			"\t\t\t\n" +

			" limit #{start},#{rows} ")
	List<Management> queryJqPage(@Param("management")Management management,@Param("start") int start,@Param("rows") int rows);

	@Select("select count(*) from t_management where zt=3")
	Long queryJqTotal(@Param("management")Management management);

	//转出
	@Select(" select t.*,y.investortypename from t_management t ,t_investortype y where y.id=t.investortypeid\n" +
			"\n" +
			"\t\t\t\n" +

			" limit #{start},#{rows} ")
	List<Management> queryZcPage(@Param("management")Management management,@Param("start") int start,@Param("rows") int rows);

	@Select("select count(*) from t_management where 1=1")
	Long queryZcTotal(@Param("management")Management management);*/

	/*@Delete(" delete from t_transfer where id in\n" +
			"        <foreach collection=\"list\" item=\"id\" separator=\",\" open=\"(\" close=\")\">\n" +
			"            #{id}\n" +
			"        </foreach>")
	void deleteZhongZhuan(List<String> list);

	@Delete("delete from t_transfer where id=#{id}")
	void deleteZhongZhuans(String id);

	@Select("select * from t_transfer where id = #{id}")
	ZhongZhuan selectZhongZhuanById(int id);

	@Update("update t_transfer \n" +
			"\tset \n" +
			"\ttransferStation=#{transferStation},\n" +
			"\ttransferCheck=#{transferCheck},\n" +
			"\tcheckTime=#{checkTime},\n" +
			"\tdescription=#{description},\n" +
			"\ttransferCompanyid=#{transferCompanyid},\n" +
			"\ttransferAddr=#{transferAddr},\n" +
			"\ttransferStationTel=#{transferStationTel}\n" +
			"\twhere id = #{id}")
	void updateZhongZhuan(ZhongZhuan zhongZhuan);*/


}
