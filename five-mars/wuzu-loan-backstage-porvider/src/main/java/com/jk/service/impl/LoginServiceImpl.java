package com.jk.service.impl;

import com.jk.dao.LoginMapper;
import com.jk.service.LoginService;
import com.jk.vo.Member;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liukang on 2018/5/23.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginDao;
    @Override
    public Map login(Member member) {
        List<Member> list = new ArrayList<Member>();
        Map map = new HashMap();
        String flag = "error";
        list = loginDao.login(member);
        if (list.size()>0){
            Member u = list.get(0);
            map.put("member",u);
            flag = "success";
        }
        map.put("flag",flag);
        return map;
    }
}
