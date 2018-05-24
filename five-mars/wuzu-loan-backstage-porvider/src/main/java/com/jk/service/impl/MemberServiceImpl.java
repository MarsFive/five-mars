package com.jk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.MemberMapper;
import com.jk.service.MemberService;
import com.jk.vo.Company;
import com.jk.vo.Member;
import com.jk.vo.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liukang on 2018/5/18.
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberDao;
    @Override
    public JSONObject queryMemberListAll(int page, int rows, Member member) {
        JSONObject object = new JSONObject();

        int start = (page-1)*rows;
        //分页查询总条数
        long total=memberDao.queryMemberCount(member);

        List<Member> list=memberDao.queryMemberList(start,rows,member);



        object.put("rows",list);
        object.put("total",total);
        return object;
    }

    @Override
    public void updateMemberType(int id, int flag) {
        memberDao.updateMemberType(id,flag);
    }

    @Override
    public List<Member> queryMemberList() {
        return memberDao.queryMemberListAll();
    }

    @Override
    public JSONObject queryPersonalListAll(int page, int rows, Personal personal) {
        JSONObject object = new JSONObject();
        int start = (page-1)*rows;
        long total=memberDao.queryPersonalCount(personal);
        List<Personal> list=memberDao.queryPersonalList(start,rows,personal);
        object.put("rows",list);
        object.put("total",total);
        return object;
    }

    @Override
    public JSONObject queryCompanyListAll(int page, int rows, Company company) {
        JSONObject object = new JSONObject();
        int start = (page-1)*rows;
        long total=memberDao.queryCompanyCount(company);
        List<Company> list=memberDao.queryCompanylList(start,rows,company);
        object.put("rows",list);
        object.put("total",total);
        return object;
    }

    @Override
    public List<Personal> queryPersonalList() {
        return memberDao.queryPersonalListAll();
    }

    @Override
    public List<Company> queryCompanyList() {
        return memberDao.queryCompanyListAll();
    }
}
