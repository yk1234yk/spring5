package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao .....");
    }
}
