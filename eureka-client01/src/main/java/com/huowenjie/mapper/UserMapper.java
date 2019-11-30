package com.huowenjie.mapper;

import com.huowenjie.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("select * from user")
//    @ResultType(User.class)
    List<User> selectAll();

    int addUser(User user);

}
