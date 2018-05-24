package com.jk.controller;

import com.jk.service.IndexService;
import com.jk.vo.User;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wangjie on 2018/5/17.
 */
@Controller
@RequestMapping("/index")
public class IndexController {


    @Autowired
    private IndexService indexService;


    @RequestMapping("user")
    @ResponseBody
    public Integer selectUser(HttpServletRequest request){

        Integer lang =indexService.selectUser();
        System.out.println(lang);


        request.setAttribute("lang", lang);

        return lang;

     }


}
