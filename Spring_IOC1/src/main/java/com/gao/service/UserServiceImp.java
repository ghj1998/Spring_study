package com.gao.service;

import com.gao.dao.UserDao;
import com.gao.dao.UserDaoMysqlImpl;

public class UserServiceImp implements UserService{

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUser() {
        userDao.getUser();
    }
}
