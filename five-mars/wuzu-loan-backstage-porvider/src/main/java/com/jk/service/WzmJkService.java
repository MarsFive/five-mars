package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.vo.*;

import java.util.List;

public interface WzmJkService {
    JSONObject queryJkPage(Borrowingmanagement borrowingmanagement, int page, int rows);

    List<Attributes> getbiaoname();

    List<Identifying> getbsname();

    List<Product> getcpname();

    List<Repayment> gethkname();

    List<State> getztname();

    Borrowingmanagement getXmList(String xuhao);

    Integer addJk(Borrowingmanagement borrowingmanagement);
}
