package com.jk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.WzmJkDao;
import com.jk.service.WzmJkService;
import com.jk.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wzmJkService")
public class WzmJkServiceImpl implements WzmJkService {

    @Autowired
    private WzmJkDao wzmJkDao;

    @Override
    public JSONObject queryJkPage(Borrowingmanagement borrowingmanagement, int page, int rows) {
        int start =(page-1)*rows;
        Long counts = wzmJkDao.queryJkTotal(borrowingmanagement);
        List<Borrowingmanagement> colors = wzmJkDao.queryJkPage(borrowingmanagement,start,rows);
        JSONObject json = new JSONObject();
//		总条数的key值必须叫total
        json.put("total", counts);
//		当前页展示数据的key值必须叫rows
        json.put("rows", colors);
        return json;
    }

    @Override
    public List<Attributes> getbiaoname() {
        return wzmJkDao.getbiaoname();
    }

    @Override
    public List<Identifying> getbsname() {
        return wzmJkDao.getbsname();
    }

    @Override
    public List<Product> getcpname() {
        return wzmJkDao.getcpname();
    }

    @Override
    public List<Repayment> gethkname() {
        return wzmJkDao.gethkname();
    }

    @Override
    public List<State> getztname() {
        return wzmJkDao.getztname();
    }

    @Override
    public Borrowingmanagement getXmList(String xuhao) {
        return wzmJkDao.getXmList(xuhao);
    }

    @Override
    public Integer addJk(Borrowingmanagement borrowingmanagement) {
        return wzmJkDao.addJk(borrowingmanagement);
    }
}
