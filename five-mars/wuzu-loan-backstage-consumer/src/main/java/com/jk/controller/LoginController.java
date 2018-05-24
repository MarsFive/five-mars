package com.jk.controller;

import com.jk.service.LoginService;
import com.jk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liukang on 2018/5/23.
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("toLogin")
    @ResponseBody
    public int toLogin(Member member, HttpServletRequest request){
        Map map = new HashMap();
        map = loginService.login(member);
        int a = 0;
        String flag = (String) map.get("flag");
        if("success".equals(flag)){
            a=1;
            Member u = (Member) map.get("member");
            request.getSession().setAttribute("member",u);
        }
        return a;
    }
    @RequestMapping("toIndex")
    public String toIndex(HttpServletRequest request){
        Member u = (Member)request.getSession().getAttribute("member");
        request.setAttribute("member",u.getName());
        return "index";
    }
}
