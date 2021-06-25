package com.gao.mapper;

import com.gao.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    public List<User> getUserList();
    public void addUser(@Param("id")int id, @Param("name")String  name,@Param("pwd") String pwd);
    public void delete(@Param("id") int id);
}
