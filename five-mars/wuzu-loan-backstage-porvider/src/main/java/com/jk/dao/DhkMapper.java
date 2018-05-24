package com.jk.dao;

import com.alibaba.fastjson.JSONObject;
import com.jk.util.DhkCustomerRelationProvider;
import com.jk.util.XCuiCustomerRelationProvider;
import com.jk.util.YqCustomerRelationProvider;
import com.jk.util.YzCustomerRelationProvider;
import com.jk.vo.ZxyCui;
import com.jk.vo.ZxyDhk;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2018/5/15.
 */

@Repository("DhkMapper")
@Mapper
public interface DhkMapper {

  @SelectProvider(type = DhkCustomerRelationProvider.class, method = "listByDhkAttr")
  List<ZxyDhk> queryDhk(@Param("page") Integer page, @Param("rows") Integer rows, @Param("dhk") ZxyDhk dhk);


   @SelectProvider(type = DhkCustomerRelationProvider.class, method = "countByDhkAttr")
   long queryDhkCount(@Param("dhk") ZxyDhk dhk);

    @SelectProvider(type = YqCustomerRelationProvider.class, method = "listByYqAttr")
    List<ZxyDhk> queryYq(@Param("page") int page, @Param("rows") Integer rows, @Param("dhk") ZxyDhk dhk);

    @SelectProvider(type = YqCustomerRelationProvider.class, method = "countByYqAttr")
    long queryYqCount(@Param("dhk") ZxyDhk dhk);

    @SelectProvider(type = YzCustomerRelationProvider.class, method = "listByYzAttr")
    List<ZxyDhk> queryYz(@Param("page") int page, @Param("rows") Integer rows, @Param("dhk") ZxyDhk dhk);

    @SelectProvider(type = YzCustomerRelationProvider.class, method = "countByYzAttr")
    long queryYzCount(@Param("dhk") ZxyDhk dhk);

    @Select("select * from z_dhk where id = ${id}")
    ZxyDhk queryById(@Param("id") Integer id);

    @Insert("insert into z_cui (id,jid,jname,cfan,cpeople,cdate,jinfo,bzhu) values(#{id},#{jid},#{jname},#{cfan},#{cpeople},#{cdate},#{jinfo},#{bzhu})")
   void addCui(ZxyCui cui);

  @SelectProvider(type = XCuiCustomerRelationProvider.class, method = "listByXCuiAttr")
  List<ZxyCui> queryXCui(@Param("page") int start, @Param("rows") Integer rows, @Param("cui") ZxyCui cui);

    @SelectProvider(type = XCuiCustomerRelationProvider.class, method = "countByXCuiAttr")
    long queryXCuiCount(@Param("cui") ZxyCui cui);

    @Select(" select sum(jkuan) from z_dhk where ydate < 30")
    Integer querydh();

    @Select(" select sum(jkuan) from z_dhk where ydate > 30 and ydate < 60")
    Integer queryyh();

    @Select(" select sum(jkuan) from z_dhk where ydate > 60")
    Integer queryyzh();

    @Select(" select sum(bhuan) from z_dhk where ydate < 30")
    Integer queryyingh();

    @Select(" select sum(shuan) from z_dhk where ydate > 30 and ydate < 60")
    Integer queryshengh();

    @Select("select * from z_cui where id = #{id}")
    ZxyCui Cuixiang(@Param("id") Integer id);


    @Select("select * from z_dhk where ydate < 30")
    List<ZxyDhk> queryDhk2(ZxyDhk dhk);

    @Select("select * from z_dhk where id = ${id}")
    ZxyDhk queryByYqId(@Param("id") Integer id);

    @Select("select  *  from z_cui  where jid = #{jid}")
    List<ZxyCui> queryXCuis(@Param("jid") Integer jid);

    @Select("select * from z_dhk where ydate < 60 and ydate > 30")
    List<ZxyDhk> queryDhk3(ZxyDhk dhk);

    @Select("select * from z_dhk where ydate > 60")
    Object queryDhk4(ZxyDhk dhk);
}
