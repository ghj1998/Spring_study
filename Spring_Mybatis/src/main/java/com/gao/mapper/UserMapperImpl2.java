package com.gao.mapper;

import com.gao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUserList() {
        final UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUserList();
    }
}
