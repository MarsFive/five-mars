package com.jk.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.WzmDzDao;
import com.jk.service.WzmDzService;
import com.jk.service.WzmTzService;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wzmDzService")
public class WzmDzServiceImpl implements WzmDzService {

	@Autowired
	private WzmDzDao wzmDzDao;


	@Override
	public JSONObject queryDzPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmDzDao.queryDzTotal(management);
		List<Management> colors = wzmDzDao.queryDzPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public List<Investortype> getyyname() {
		return wzmDzDao.getyyname();
	}

	@Override
	public JSONObject queryZcPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmDzDao.queryZcTotal(management);
		List<Management> colors = wzmDzDao.queryZcPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}

	@Override
	public List<Buyertype> getbtname() {
		return wzmDzDao.getbtname();
	}

	@Override
	public List<Member> getmbname() {
		return wzmDzDao.getmbname();
	}

	/*@Override
	public Integer addTz(Management management) {
		return wzmDzDao.addTz(management);
	}

	@Override
	public Object queryTz(Management management) {
		return wzmDzDao.queryTz(management);
	}

	@Override
	public JSONObject queryHkPage(Management management, int page, int rows) {
		int start =(page-1)*rows;
		Long counts = wzmDzDao.queryHkTotal(management);
		List<Management> colors = wzmDzDao.queryHkPage(management,start,rows);
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
		Long counts = wzmDzDao.queryJqTotal(management);
		List<Management> colors = wzmDzDao.queryJqPage(management,start,rows);
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
		Long counts = wzmDzDao.queryZcTotal(management);
		List<Management> colors = wzmDzDao.queryZcPage(management,start,rows);
		JSONObject json = new JSONObject();
//		总条数的key值必须叫total
		json.put("total", counts);
//		当前页展示数据的key值必须叫rows
		json.put("rows", colors);
		return json;
	}*/


}