package com.jk.dao;

import com.jk.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wangjie on 2018/5/17.
 */
@Mapper
public interface IndexMapper {

    @Select("select count(*) from t_member")
    Integer selectUser();


/*    List<User> selectUser();*/

/*    @Select(" select * from t_user ")
    User selectUser(User user);*/
}
