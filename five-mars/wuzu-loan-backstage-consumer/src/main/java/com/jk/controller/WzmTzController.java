package com.jk.controller;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.service.WzmTzService;
import com.jk.util.ExportExcel;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping(value="/wzmTzController")
public class WzmTzController {

	@Autowired
	private WzmTzService wzmTzService;

	@RequestMapping("/queryTzList")
	private String queryTzList(){
		return "tzlist";
	}

	@RequestMapping("/queryTzPage")//查询投资
	@ResponseBody
	public Object queryTzPage(Management management,int page,int rows,HttpServletRequest request){
		JSONObject json = wzmTzService.queryTzPage(management,page,rows);
		System.out.println("******************"+json);
		List<Investortype> investortypelist=wzmTzService.getyyname();
		for (Investortype investortype : investortypelist) {
			System.out.println(investortype);
		}
		request.setAttribute("investortypelists",investortypelist);
		return json;
	}

	@RequestMapping("getyyname")
	@ResponseBody
	public String getyyname(HttpServletRequest request){//获取类型
		List<Investortype> investortypelist=wzmTzService.getyyname();
		String yy=JSON.toJSONString(investortypelist);
		request.setAttribute("investortype", yy);
		return yy;
	}

	@RequestMapping("getbtname")
	@ResponseBody
	public String getbtname(HttpServletRequest request){//获取
		List<Buyertype> buyertypelist=wzmTzService.getbtname();
		String bt=JSON.toJSONString(buyertypelist);
		request.setAttribute("buyertype", bt);
		return bt;
	}

	@RequestMapping("getmbname")
	@ResponseBody
	public String getmbname(HttpServletRequest request){//获取
		List<Member> memberlist=wzmTzService.getmbname();
		String mb=JSON.toJSONString(memberlist);
		request.setAttribute("member", mb);
		return mb;
	}

	@RequestMapping("/toTz")
	public String toUser(){
		return "wzm/addTz";
	}

	@RequestMapping("/addTz")
	@ResponseBody
	public String addTz(Management management){//新增
		management.setBiaoid("123");
		Integer count=wzmTzService.addTz(management);
		if(Integer.valueOf(0).equals(count)){
			return "fail";
		}
		return "success";
	}

	//导出
	@SuppressWarnings("all")
	@RequestMapping("/exceportExcel")
	@ResponseBody
	public String ExceportExcel(HttpServletResponse response){
		String title = "投资列表";
		String[] rowName= {"序号","标的ID","借款标题","投资人","投资人类型","年化利率","期限","持有债权金额(元)","投资时间"};
		List<Object[]> dataList =new ArrayList<Object[]>();
		List<Management> queryhhList = wzmTzService.queryTzList();
		Object[] obj=null;
		for (int i = 0; i < queryhhList.size(); i++) {
			obj = new Object[rowName.length];
			obj[0]=queryhhList.get(i).getId();
			obj[1]=queryhhList.get(i).getBiaoid();
			obj[2]=queryhhList.get(i).getBorrowingtitle();
			obj[3]=queryhhList.get(i).getInvestor();
			obj[4]=queryhhList.get(i).getInvestortypeid();
			obj[5]=queryhhList.get(i).getApr();
			obj[6]=queryhhList.get(i).getAllottedtime();
			obj[7]=queryhhList.get(i).getAmount();
			obj[8]=queryhhList.get(i).getInvestmenttime();
			dataList.add(obj);
		}
		ExportExcel exportExcel=new ExportExcel(title, rowName, dataList,response);
		try {
			exportExcel.export();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}


	@RequestMapping("/queryHkPage")//查询回款
	@ResponseBody
	public Object queryHkPage(Management management,int page,int rows,HttpServletRequest request){
		JSONObject json = wzmTzService.queryHkPage(management,page,rows);
		System.out.println("******************"+json);
		List<Investortype> investortypelist=wzmTzService.getyyname();
		for (Investortype investortype : investortypelist) {
			System.out.println(investortype);
		}
		request.setAttribute("investortypelists",investortypelist);
		return json;
	}

	@RequestMapping("/queryJqPage")//查询结清
	@ResponseBody
	public Object queryJqPage(Management management,int page,int rows,HttpServletRequest request){
		JSONObject json = wzmTzService.queryJqPage(management,page,rows);
		System.out.println("******************"+json);
		List<Investortype> investortypelist=wzmTzService.getyyname();
		for (Investortype investortype : investortypelist) {
			System.out.println(investortype);
		}
		request.setAttribute("investortypelists",investortypelist);
		return json;
	}

	@RequestMapping("/queryZcPage")//查询转出
	@ResponseBody
	public Object queryZcPage(Management management,int page,int rows,HttpServletRequest request){
		/*management.setBuyersname("wzm");*/
		management.setBuyerstypeid(1);
		management.setTransferprice("10000");
		JSONObject json = wzmTzService.queryZcPage(management,page,rows);
		System.out.println("******************"+json);
		List<Investortype> investortypelist=wzmTzService.getyyname();
		for (Investortype investortype : investortypelist) {
			System.out.println(investortype);
		}
		List<Buyertype> buyertypelist=wzmTzService.getbtname();
		for (Buyertype buyertype : buyertypelist) {
			System.out.println(buyertype);
		}
		List<Member> memberlist=wzmTzService.getmbname();
		for (Member member : memberlist) {
			System.out.println(member);
		}
		request.setAttribute("investortypelists",investortypelist);
		return json;
	}
	
	
}
