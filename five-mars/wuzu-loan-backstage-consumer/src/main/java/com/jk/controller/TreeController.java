package com.jk.controller;

import com.jk.service.TreeService;
import com.jk.vo.HyMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wangjie on 2018/5/23.
 */
@Controller
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @ResponseBody
    @RequestMapping("/selectTreeList")
    public List<HyMenu> selectTreeList(Integer pid){
            List<HyMenu> list =null;
        try {

            HyMenu t =new HyMenu();
            list =treeService.selectTreeList(t);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }


    @ResponseBody
    @RequestMapping("/selectYewuList")
    public List<HyMenu> selectYewuList(Integer pid){
        List<HyMenu> list =null;
        try {

            HyMenu t =new HyMenu();
            list =treeService.selectYewuList(t);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }




    @ResponseBody
    @RequestMapping("/selectXuanChuanList")
    public List<HyMenu> selectXuanChuanList(Integer pid){
        List<HyMenu> list =null;
        try {

            HyMenu t =new HyMenu();
            list =treeService.selectXuanChuanList(t);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }



    @ResponseBody
    @RequestMapping("/selectXiTongList")
    public List<HyMenu> selectXiTongList(Integer pid){
        List<HyMenu> list =null;
        try {

            HyMenu t =new HyMenu();
            list =treeService.selectXiTongList(t);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }

}
