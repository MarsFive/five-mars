package com.jk.service.impl;



import com.jk.dao.IndexMapper;
import com.jk.service.IndexService;
import com.jk.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by wangjie on 2018/5/17.
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService{

    @Autowired
    private IndexMapper indexMapper;


    @Override
    public Integer selectUser() {
        return indexMapper.selectUser();
    }
}
