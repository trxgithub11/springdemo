package com.trx.dao.impl;

import com.trx.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class UserDaoImpl implements UserDao {
    public void show() {
        System.out.println("show");
    }
}
