package com.gao.mapper;

import com.gao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> getUserList() {
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();

    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
