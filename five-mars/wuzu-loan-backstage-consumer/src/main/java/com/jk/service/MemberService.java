package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.vo.Company;
import com.jk.vo.Member;
import com.jk.vo.Personal;

import java.util.List;
import java.util.Map;

/**
 * Created by liukang on 2018/5/18.
 */
public interface MemberService {
    JSONObject queryMemberListAll(int page, int rows, Member member);

    void updateMemberType(int id, int flag);

    List<Member> queryMemberList();

    JSONObject queryPersonalListAll(int page, int rows, Personal personal);

    JSONObject queryCompanyListAll(int page, int rows, Company company);

    List<Personal> queryPersonalList();

    List<Company> queryCompanyList();
}
