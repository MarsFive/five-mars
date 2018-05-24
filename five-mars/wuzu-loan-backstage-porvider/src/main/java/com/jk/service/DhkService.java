package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.vo.ZxyCui;
import com.jk.vo.ZxyDhk;

/**
 * Created by lenovo on 2018/5/15.
 */

public interface DhkService {

    Object queryDhk2(ZxyDhk dhk);

    JSONObject queryDhk(Integer page, Integer rows, ZxyDhk dhk);

    JSONObject queryYq(Integer page, Integer rows, ZxyDhk dhk);

    JSONObject queryYz(Integer page, Integer rows, ZxyDhk dhk);

    ZxyDhk queryById(Integer id);

    void addCui(ZxyCui cui);

    JSONObject queryXCui(Integer page, Integer rows, ZxyCui cui);

    Integer querydh();

    Integer queryyh();

    Integer queryyzh();

    Integer queryyingh();

    Integer queryshengh();

    ZxyCui Cuixiang(Integer id);

    ZxyDhk queryByYqId(Integer id);

    Object queryXCuis(Integer jid);

    Object queryDhk3(ZxyDhk dhk);

    Object queryDhk4(ZxyDhk dhk);
}
