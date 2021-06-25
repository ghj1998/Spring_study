package com.gao.mapper;

import com.gao.mapper.UserMapper;
import com.gao.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final UserMapper userMapper = context.getBean("UserMapper", UserMapper.class);
        for (User user : userMapper.getUserList()) {
            System.out.println(user);
        }
    }
}
