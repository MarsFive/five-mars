package com.jk.service.impl;

import com.jk.dao.TreeMapper;
import com.jk.service.TreeService;
import com.jk.vo.HyMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangjie on 2018/5/23.
 */
@Service("treeService")
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;


    public List<HyMenu> selectTreeList(HyMenu t) {
        return treeMapper.selectTreeList(t);
    }

    @Override
    public List<HyMenu> selectYewuList(HyMenu t) {
        return treeMapper.selectYewuList(t);
    }

    @Override
    public List<HyMenu> selectXuanChuanList(HyMenu t) {
        return treeMapper.selectXuanChuanList(t);
    }

    @Override
    public List<HyMenu> selectXiTongList(HyMenu t) {
        return treeMapper.selectXiTongList(t);
    }
}
