package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.vo.Buyertype;
import com.jk.vo.Investortype;
import com.jk.vo.Management;
import com.jk.vo.Member;

import java.util.List;

public interface WzmTzService {

	JSONObject queryTzPage(Management management, int page, int rows);

	List<Investortype> getyyname();

    Integer addTz(Management management);

	Object queryTz(Management management);

    JSONObject queryHkPage(Management management, int page, int rows);

	JSONObject queryJqPage(Management management, int page, int rows);

	JSONObject queryZcPage(Management management, int page, int rows);

    List<Buyertype> getbtname();

	List<Member> getmbname();

    List<Management> queryTzList();

	

	/*Integer addZhongZhuan(ZhongZhuan zhongZhuan);

	void deleteZhongZhuan(String ids);

	void deleteZhongZhuans(String id);

	ZhongZhuan selectZhongZhuanById(int id);

	void updateZhongZhuan(ZhongZhuan zhongZhuan);*/

}
