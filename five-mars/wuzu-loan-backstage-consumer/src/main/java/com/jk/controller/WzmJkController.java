package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.service.WzmJkService;
import com.jk.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/wzmJkController")
public class WzmJkController {

    @Autowired
    private WzmJkService wzmJkService;

    @RequestMapping("/queryJkPage")//查询投资
    @ResponseBody
    public Object queryJkPage(Borrowingmanagement borrowingmanagement, int page, int rows, HttpServletRequest request){
        JSONObject json = wzmJkService.queryJkPage(borrowingmanagement,page,rows);
        System.out.println("******************"+json);
        List<Attributes> attributeslist=wzmJkService.getbiaoname();
        request.setAttribute("attributeslists",attributeslist);
        List<Identifying> identifyinglist=wzmJkService.getbsname();
        request.setAttribute("identifyinglists",identifyinglist);
        List<Product> productlist=wzmJkService.getcpname();
        request.setAttribute("productlists",productlist);
        List<Repayment> repaymentlist=wzmJkService.gethkname();
        request.setAttribute("repaymentlists",repaymentlist);
        List<State> statelist=wzmJkService.getztname();
        request.setAttribute("statelists",statelist);
        return json;
    }

    @RequestMapping("getbiaoname")
    @ResponseBody
    public String getbiaoname(HttpServletRequest request){//获取类型
        List<Attributes> attributeslist=wzmJkService.getbiaoname();
        String biao= JSON.toJSONString(attributeslist);
        request.setAttribute("attributes", biao);
        return biao;
    }

    @RequestMapping("getbsname")
    @ResponseBody
    public String getbsname(HttpServletRequest request){//获取类型
        List<Identifying> identifyinglist=wzmJkService.getbsname();
        String bs= JSON.toJSONString(identifyinglist);
        request.setAttribute("identifying", bs);
        return bs;
    }

    @RequestMapping("getcpname")
    @ResponseBody
    public String getcpname(HttpServletRequest request){//获取类型
        List<Product> productlist=wzmJkService.getcpname();
        String cp= JSON.toJSONString(productlist);
        request.setAttribute("product", cp);
        return cp;
    }

    @RequestMapping("gethkname")
    @ResponseBody
    public String gethkname(HttpServletRequest request){//获取类型
        List<Repayment> repaymentlist=wzmJkService.gethkname();
        String hk= JSON.toJSONString(repaymentlist);
        request.setAttribute("repayment", hk);
        return hk;
    }

    @RequestMapping("getztname")
    @ResponseBody
    public String getztname(HttpServletRequest request){//获取状态
        List<State> statelist=wzmJkService.getztname();
        String zt= JSON.toJSONString(statelist);
        request.setAttribute("state", zt);
        return zt;
    }

    @RequestMapping("getXmList")
    @ResponseBody
    public Object getXmList(String xuhao,HttpServletRequest request){
        Borrowingmanagement borrowingmanagement = new Borrowingmanagement();
        try {
            borrowingmanagement = wzmJkService.getXmList(xuhao);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List list = new ArrayList();
        list.add(borrowingmanagement);
        return list;
    }

    @RequestMapping("/toJk")
    public String toUser(){
        return "wzm/addJk";
    }

    @RequestMapping("/addJk")
    @ResponseBody
    public String addJk(Borrowingmanagement borrowingmanagement){//新增
        Integer count=wzmJkService.addJk(borrowingmanagement);
        if(Integer.valueOf(0).equals(count)){
            return "fail";
        }
        return "success";
    }
}
