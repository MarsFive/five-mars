package com.jk.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jk.service.WzmTzService;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.WzmTzDao;

@Service("wzmTzService")
public class WzmTzServiceImpl implements WzmTzService {

	@Autowired
	private WzmTzDao wzmTzDao;


	@Override
	public JSONObject queryTzPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmTzDao.queryTzTotal(management);
		List<Management> colors = wzmTzDao.queryTzPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public List<Investortype> getyyname() {
		return wzmTzDao.getyyname();
	}

	@Override
	public Integer addTz(Management management) {
		return wzmTzDao.addTz(management);
	}

	@Override
	public Object queryTz(Management management) {
		return wzmTzDao.queryTz(management);
	}

	@Override
	public JSONObject queryHkPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmTzDao.queryHkTotal(management);
		List<Management> colors = wzmTzDao.queryHkPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public JSONObject queryJqPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmTzDao.queryJqTotal(management);
		List<Management> colors = wzmTzDao.queryJqPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public JSONObject queryZcPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmTzDao.queryZcTotal(management);
		List<Management> colors = wzmTzDao.queryZcPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public List<Buyertype> getbtname() {
		return wzmTzDao.getbtname();
	}

	@Override
	public List<Member> getmbname() {
		return wzmTzDao.getmbname();
	}

	@Override
	public List<Management> queryTzList() {
		return wzmTzDao.queryTzList();
	}


}