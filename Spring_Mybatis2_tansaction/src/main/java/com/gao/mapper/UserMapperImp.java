package com.gao.mapper;

import com.gao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

    public class UserMapperImp extends SqlSessionDaoSupport implements UserMapper{
        @Override
        public List<User> getUserList() {
            addUser(7,"高七","1111111");
            delete(7);
            return getSqlSession().getMapper(UserMapper.class).getUserList();
        }

        @Override
        public void addUser(int id, String name, String pwd) {
            getSqlSession().getMapper(UserMapper.class).addUser(id,name,pwd);
        }

        @Override
        public void delete(int id) {
            getSqlSession().getMapper(UserMapper.class).delete(id);
        }

    }
