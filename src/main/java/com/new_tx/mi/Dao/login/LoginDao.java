package com.new_tx.mi.Dao.login;

import com.new_tx.mi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginDao {

    @Select("select * from User where userLoginName=#{userLoginName}")
    User finduser(User user) ;
}
