package com.jk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.DhkMapper;
import com.jk.service.DhkService;
import com.jk.vo.ZxyCui;
import com.jk.vo.ZxyDhk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/5/15.
 */

@Service("dhkService")
public class DhkServiceImpl implements DhkService{

    @Autowired
    private DhkMapper dhkDao;

    @Override
    public Object queryDhk2(ZxyDhk dhk) {


        return dhkDao.queryDhk2(dhk);
    }

    @Override
    public JSONObject queryDhk(Integer page, Integer rows, ZxyDhk dhk) {

        JSONObject object = new JSONObject();

        int start = (page-1)*rows;

        List<ZxyDhk> list=dhkDao.queryDhk(start,rows,dhk);

        //分页查询总条数
        long total=dhkDao.queryDhkCount(dhk);

        object.put("rows",list);
        object.put("total",total);

        return object;
    }



    @Override
    public JSONObject queryYq(Integer page, Integer rows, ZxyDhk dhk) {


        JSONObject object = new JSONObject();

        int start = (page-1)*rows;

        List<ZxyDhk> list=dhkDao.queryYq(start,rows,dhk);

        //分页查询总条数
        long total=dhkDao.queryYqCount(dhk);

        object.put("rows",list);
        object.put("total",total);

        return object;

    }

    @Override
    public JSONObject queryYz(Integer page, Integer rows, ZxyDhk dhk) {

        JSONObject object = new JSONObject();

        int start = (page-1)*rows;

        List<ZxyDhk> list=dhkDao.queryYz(start,rows,dhk);

        //分页查询总条数
        long total=dhkDao.queryYzCount(dhk);

        object.put("rows",list);
        object.put("total",total);

        return object;

    }

    @Override
    public ZxyDhk queryById(Integer id) {

        return dhkDao.queryById(id);
    }

    @Override
    public void addCui(ZxyCui cui) {

         dhkDao.addCui(cui) ;
    }

    @Override
    public JSONObject queryXCui(Integer page, Integer rows,ZxyCui cui) {

        JSONObject object = new JSONObject();

        int start = (page-1)*rows;

        List<ZxyCui> list=dhkDao.queryXCui(start,rows,cui);

        //分页查询总条数
        long total=dhkDao.queryXCuiCount(cui);

        object.put("rows",list);
        object.put("total",total);

        return object;
    }

    @Override
    public Integer querydh() {

        return dhkDao.querydh();
    }

    @Override
    public Integer queryyh() {

        return dhkDao.queryyh();
    }

    @Override
    public Integer queryyzh() {

        return dhkDao.queryyzh();
    }

    @Override
    public Integer queryyingh() {

        return dhkDao.queryyingh();
    }

    @Override
    public Integer queryshengh() {

        return dhkDao.queryshengh();
    }

    @Override
    public ZxyCui Cuixiang(Integer id) {

        return dhkDao.Cuixiang(id);
    }

    @Override
    public ZxyDhk queryByYqId(Integer id) {

        return dhkDao.queryByYqId(id);
    }

    @Override
    public Object queryXCuis(Integer jid) {

        return dhkDao.queryXCuis(jid);
    }

    @Override
    public Object queryDhk3(ZxyDhk dhk) {

        return dhkDao.queryDhk3(dhk);
    }

    @Override
    public Object queryDhk4(ZxyDhk dhk) {

        return dhkDao.queryDhk4(dhk);
    }


}
