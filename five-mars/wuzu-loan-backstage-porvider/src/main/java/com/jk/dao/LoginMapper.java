package com.jk.dao;

import com.jk.vo.Member;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liukang on 2018/5/23.
 */
public interface LoginMapper {
    @Select("select * from t_member where name=#{member.name} and pwd = #{member.pwd}")
    List<Member> login(@Param("member") Member member);
}
