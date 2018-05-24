package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.jk.service.MemberService;
import com.jk.vo.Company;
import com.jk.vo.Member;
import com.jk.vo.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.jk.util.ExportExcel;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by liukang on 2018/5/18.
 */
@Controller
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("queryMemberListAll")
    @ResponseBody
    public Object queryMemberListAll(int page,int rows,Member member){
        JSONObject map = memberService.queryMemberListAll(page,rows,member);
        return map;
    }
    @RequestMapping("updateMemberType")
    @ResponseBody
    public String updateMemberType(int id,int flag){
        memberService.updateMemberType(id,flag);
        return "success";
    }
    @RequestMapping("exceportExcelMemberAll")
    @ResponseBody
    public void exceportExcelMemberAll(HttpServletResponse response){
        String title = "账号列表";
        String[] rowName= {"序号","用户名","联系电话","邮箱","状态","来源","创建时间","用户类型","业务员工号"};
        List<Object[]> dataList =new ArrayList<Object[]>();
        List<Member> queryUserList = memberService.queryMemberList();
        Object[] obj=null;
        for (int i = 0; i < queryUserList.size(); i++) {
            obj = new Object[rowName.length];
            obj[0]=queryUserList.get(i).getId();
            obj[1]=queryUserList.get(i).getName();
            obj[2]=queryUserList.get(i).getPhone();
            obj[3]=queryUserList.get(i).getEmail();
            obj[4]=queryUserList.get(i).getType();
            obj[5]=queryUserList.get(i).getGo();
            obj[6]=queryUserList.get(i).getCreatTime();
            obj[7]=queryUserList.get(i).getUserType();
            obj[8]=queryUserList.get(i).getEmpNumber();
            dataList.add(obj);
        }
        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @RequestMapping("exceportExcelPersonalAll")
    @ResponseBody
    public void exceportExcelPersonalAll(HttpServletResponse response){
        String title = "个人账号列表";
        String[] rowName= {"序号","用户名","姓名","联系电话","邮箱","状态","来源","创建时间","身份证","用户类型","业务员工号"};
        List<Object[]> dataList =new ArrayList<Object[]>();
        List<Personal> queryUserList = memberService.queryPersonalList();
        Object[] obj=null;
        for (int i = 0; i < queryUserList.size(); i++) {
            obj = new Object[rowName.length];
            obj[0]=queryUserList.get(i).getId();
            obj[1]=queryUserList.get(i).getName();
            obj[2]=queryUserList.get(i).getUserName();
            obj[3]=queryUserList.get(i).getPhone();
            obj[4]=queryUserList.get(i).getEmail();
            obj[5]=queryUserList.get(i).getType();
            obj[6]=queryUserList.get(i).getGo();
            obj[7]=queryUserList.get(i).getCreatTime();
            obj[8]=queryUserList.get(i).getCardID();
            obj[9]=queryUserList.get(i).getUserType();
            obj[10]=queryUserList.get(i).getEmpNumber();
            dataList.add(obj);
        }
        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @RequestMapping("exceportExcelCompanyAll")
    @ResponseBody
    public void exceportExcelCompanyAll(HttpServletResponse response){
        String title = "企业账号列表";
        String[] rowName= {"序号","企业账号","企业名称","联系人姓名","联系人电话","营业执照/社会信用代码","创建时间","状态","是否允许投资"};
        List<Object[]> dataList =new ArrayList<Object[]>();
        List<Company> queryUserList = memberService.queryCompanyList();
        Object[] obj=null;
        for (int i = 0; i < queryUserList.size(); i++) {
            obj = new Object[rowName.length];
            obj[0]=queryUserList.get(i).getId();
            obj[1]=queryUserList.get(i).getName();
            obj[2]=queryUserList.get(i).getCompanyName();
            obj[3]=queryUserList.get(i).getCorporateContacts();
            obj[4]=queryUserList.get(i).getCcPhone();
            obj[5]=queryUserList.get(i).getBusinessLicense();
            obj[6]=queryUserList.get(i).getCreatTime();
            obj[7]=queryUserList.get(i).getType();
            obj[8]=queryUserList.get(i).getIsInvestment();
            dataList.add(obj);
        }
        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @RequestMapping("queryPersonalListAll")
    @ResponseBody
    public Object queryPersonalListAll(int page,int rows,Personal personal){
        JSONObject map = memberService.queryPersonalListAll(page,rows,personal);
        return map;
    }
    @RequestMapping("queryCompanyListAll")
    @ResponseBody
    public Object queryCompanyListAll(int page,int rows,Company company){
        JSONObject map = memberService.queryCompanyListAll(page,rows,company);
        return map;
    }
}
