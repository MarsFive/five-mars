package com.jk.dao;

import com.jk.vo.HyMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wangjie on 2018/5/23.
 */
@Mapper
public interface TreeMapper {

    @Select("select * from t_hy_menu")
    List<HyMenu> selectTreeList(HyMenu t);

    @Select("select * from t_yw_menu")
    List<HyMenu> selectYewuList(HyMenu t);

    @Select("select * from t_xc_menu")
    List<HyMenu> selectXuanChuanList(HyMenu t);

    @Select("select * from t_xt_menu")
    List<HyMenu> selectXiTongList(HyMenu t);
}
