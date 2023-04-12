package com.trx.dao.impl;

import com.trx.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {

    public void show() {
        System.out.println("查询数据库，展示查询到的数据");
    }
}
