package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.service.DhkService;
import com.jk.util.ExportExcel;
import com.jk.vo.ZxyCui;
import com.jk.vo.ZxyDhk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/5/15.
 */

@Controller
@RequestMapping("dhkController")
public class DhkController {


    @Autowired
    private DhkService dhkService;


    @RequestMapping("queryDhk")
    @ResponseBody
    public Object queryDhk(Integer page, Integer rows, ZxyDhk dhk){

        JSONObject	list = dhkService.queryDhk(page,rows,dhk);
        return list;

    }

    @RequestMapping("queryYq")
    @ResponseBody
    public Object queryYq(Integer page, Integer rows, ZxyDhk dhk){

        JSONObject	list = dhkService.queryYq(page,rows,dhk);

        return list;

    }

    @RequestMapping("queryYz")
    @ResponseBody
    public Object queryYz(Integer page, Integer rows, ZxyDhk dhk){

        JSONObject	list = dhkService.queryYz(page,rows,dhk);

        return list;

    }


    @RequestMapping("queryById")
    public String queryById(Integer id,HttpServletRequest request){

            ZxyDhk dhk = dhkService.queryById(id);
            request.setAttribute("dhk", dhk);

        return "zxy/xiacui";
    }

    @RequestMapping("/addCui")
    @ResponseBody
    public String addCui(ZxyCui cui){//新增


        dhkService.addCui(cui);

        return "success";
    }



    @RequestMapping("queryXCui")
    @ResponseBody
    public Object queryXCui(Integer page, Integer rows,ZxyCui cui){

        JSONObject	list = dhkService.queryXCui(page,rows,cui);
        return list;

    }

    @RequestMapping("querydh")
    @ResponseBody
    public Integer querydh(){

        Integer dh=dhkService.querydh();

        return dh;

    }


    @RequestMapping("queryyh")
    @ResponseBody
    public Integer queryyh(){

        Integer yh=dhkService.queryyh();

        return yh;

    }


    @RequestMapping("queryyzh")
    @ResponseBody
    public Integer queryyzh(){

        Integer yzh=dhkService.queryyzh();

        return yzh;

    }


    @RequestMapping(" queryyingh")
    @ResponseBody
    public Integer  queryyingh(){

        Integer yingh=dhkService. queryyingh();

        return yingh;

    }

    @RequestMapping(" queryshengh")
    @ResponseBody
    public Integer  queryshengh(){

        Integer shengh=dhkService. queryshengh();

        return shengh;

    }

    @RequestMapping("Cuixiang")
    public String Cuixiang(Integer id,HttpServletRequest request){

        ZxyCui cui = dhkService.Cuixiang(id);
        request.setAttribute("cui", cui);

        return "zxy/cxiang";
    }


    @RequestMapping("ExceportExcel")
    public void ExceportExcel(ZxyDhk dhk,HttpServletResponse response){

        String title = "用户列表";
        String[] rowName= {"编号","借款标题","用户名","借款金额(元)","期数","本期应还总额(元)","剩余还总额(元)","距下次还款(天)","下一还款日"};

        List<ZxyDhk>	list = (List<ZxyDhk>)dhkService.queryDhk2(dhk);


        List<Object[]> dataList = new ArrayList<Object[]> ();



        for (ZxyDhk z:list) {

            String st = ","+z.getId()+","+z.getTitle()+","+z.getName()+","+z.getJkuan()+","+z.getQshu()+","+z.getBhuan()+","+z.getShuan()+","+z.getNextdate()+","+z.getNexthdate();
            dataList.add(st.substring(1).split(","));
        }



        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);

        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("queryByYqId")
    public String queryByYqId(Integer id,HttpServletRequest request){

        ZxyDhk dhk = dhkService.queryByYqId(id);
        request.setAttribute("dhk", dhk);

        return "zxy/YqXc";
    }

    @RequestMapping("queryXCuis")
    @ResponseBody
    public Object queryXCuis(Integer jid){

        Object list= dhkService.queryXCuis(jid);

        return  list;

    }

    @RequestMapping("queryByYzId")
    public String queryByYzId(Integer id,HttpServletRequest request){

        ZxyDhk dhk = dhkService.queryByYqId(id);
        request.setAttribute("dhk", dhk);

        return "zxy/YzXc";
    }


    @RequestMapping("qExceportExcel")
    public void qExceportExcel(ZxyDhk dhk,HttpServletResponse response){

        String title = "用户列表";
        String[] rowName= {"编号","借款标题","用户名","借款金额(元)","期数","本期应还总额(元)","剩余还总额(元)","逾期费用","逾期天数","最近催收时间"};

        List<ZxyDhk>	list = (List<ZxyDhk>)dhkService.queryDhk3(dhk);


        List<Object[]> dataList = new ArrayList<Object[]> ();



        for (ZxyDhk z:list) {

            String st = ","+z.getId()+","+z.getTitle()+","+z.getName()+","+z.getJkuan()+","+z.getQshu()+","+z.getBhuan()+","+z.getShuan()+","+z.getYfei()+","+z.getYdate()+","+z.getCdate();
            dataList.add(st.substring(1).split(","));
        }



        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);

        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("zExceportExcel")
    public void zExceportExcel(ZxyDhk dhk,HttpServletResponse response){

        String title = "用户列表";
        String[] rowName= {"编号","借款标题","用户名","借款金额(元)","期数","本期应还总额(元)","剩余还总额(元)","逾期费用","逾期天数","最近催收时间"};

        List<ZxyDhk>	list = (List<ZxyDhk>)dhkService.queryDhk4(dhk);


        List<Object[]> dataList = new ArrayList<Object[]> ();



        for (ZxyDhk z:list) {

            String st = ","+z.getId()+","+z.getTitle()+","+z.getName()+","+z.getJkuan()+","+z.getQshu()+","+z.getBhuan()+","+z.getShuan()+","+z.getYfei()+","+z.getYdate()+","+z.getCdate();
            dataList.add(st.substring(1).split(","));
        }



        ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);

        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
