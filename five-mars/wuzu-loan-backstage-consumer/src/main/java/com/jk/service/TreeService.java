package com.jk.service;

import com.jk.vo.HyMenu;

import java.util.List;

/**
 * Created by wangjie on 2018/5/23.
 */
public interface TreeService {

    List<HyMenu> selectTreeList(HyMenu t);

    List<HyMenu> selectYewuList(HyMenu t);

    List<HyMenu> selectXuanChuanList(HyMenu t);

    List<HyMenu> selectXiTongList(HyMenu t);
}
