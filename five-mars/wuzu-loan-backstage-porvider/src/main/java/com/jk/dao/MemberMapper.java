package com.jk.dao;

import com.jk.util.MemberCustomerRelationProvider;
import com.jk.util.PersonalCustomerRelationProvider;
import com.jk.util.companyCustomerRelationProvider;
import com.jk.vo.Company;
import com.jk.vo.Member;
import com.jk.vo.Personal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liukang on 2018/5/18.
 */
@Repository
@Mapper
public interface MemberMapper {
    @SelectProvider(type = MemberCustomerRelationProvider.class, method = "listByMemberAttr")
    List<Member> queryMemberList(@Param("start") int start, @Param("rows") int rows, @Param("member") Member member);
    @SelectProvider(type = MemberCustomerRelationProvider.class, method = "countByMemberAttr")
    long queryMemberCount(@Param("member") Member member);
    @SelectProvider(type = MemberCustomerRelationProvider.class, method = "updateMemberType")
    void updateMemberType(@Param("id") int id, @Param("flag") int flag);
    @Select(" select * from t_member ")
    List<Member> queryMemberListAll();
    @SelectProvider(type = PersonalCustomerRelationProvider.class, method = "countByPersonalAttr")
    long queryPersonalCount(@Param("personal") Personal personal);
    @SelectProvider(type = PersonalCustomerRelationProvider.class, method = "listByPersonalAttr")
    List<Personal> queryPersonalList(@Param("start") int start, @Param("rows") int rows, @Param("personal") Personal personal);
    @SelectProvider(type = companyCustomerRelationProvider.class, method = "countByCompanyAttr")
    long queryCompanyCount(@Param("company") Company company);
    @SelectProvider(type = companyCustomerRelationProvider.class, method = "listByCompanyAttr")
    List<Company> queryCompanylList(@Param("start") int start, @Param("rows") int rows, @Param("company") Company company);
    @Select(" select a.*,b.cardID,b.userName,b.riskAssessment,b.riskCount from t_member a,t_personal b where  a.id=b.id and a.userType='GR' ")
    List<Personal> queryPersonalListAll();
    @Select(" select b.*,a.name,a.pwd,a.phone,a.email,a.type,a.go,a.creatTime,a.userType,a.empNumber from company b,t_member a where a.id=b.id and a.userType='QY' ")
    List<Company> queryCompanyListAll();
}
