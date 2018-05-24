package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.service.WzmDzService;
import com.jk.service.WzmTzService;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="/wzmDzController")
public class WzmDzController {

    @Autowired
    private WzmDzService wzmDzService;

    @RequestMapping("/queryDzPage")//查询投资
    @ResponseBody
    public Object queryDzPage(Management management, int page, int rows, HttpServletRequest request){
        JSONObject json = wzmDzService.queryDzPage(management,page,rows);
        System.out.println("******************"+json);
        List<Investortype> investortypelist=wzmDzService.getyyname();
        for (Investortype investortype : investortypelist) {
            System.out.println(investortype);
        }
        request.setAttribute("investortypelists",investortypelist);
        return json;
    }

    @RequestMapping("getyyname")
    @ResponseBody
    public String getyyname(HttpServletRequest request){//获取类型
        List<Investortype> investortypelist=wzmDzService.getyyname();
        String yy= JSON.toJSONString(investortypelist);
        request.setAttribute("investortype", yy);
        return yy;
    }

    @RequestMapping("/queryZcPage")//查询转出
    @ResponseBody
    public Object queryZcPage(Management management,int page,int rows,HttpServletRequest request){
		/*management.setBuyersname("wzm");*/
        management.setBuyerstypeid(1);
        management.setTransferprice("10000");
        JSONObject json = wzmDzService.queryZcPage(management,page,rows);
        System.out.println("******************"+json);
        List<Investortype> investortypelist=wzmDzService.getyyname();
        for (Investortype investortype : investortypelist) {
            System.out.println(investortype);
        }
        List<Buyertype> buyertypelist=wzmDzService.getbtname();
        for (Buyertype buyertype : buyertypelist) {
            System.out.println(buyertype);
        }
        List<Member> memberlist=wzmDzService.getmbname();
        for (Member member : memberlist) {
            System.out.println(member);
        }
        request.setAttribute("investortypelists",investortypelist);
        return json;
    }

}
