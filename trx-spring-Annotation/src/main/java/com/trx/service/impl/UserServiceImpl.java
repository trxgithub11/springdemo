package com.trx.service.impl;

import com.trx.dao.UserDao;
import com.trx.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("userService")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao2")
    private UserDao userDao;

    @Value("199")
    private int num;

    @Value("#{19+3}")
    private Integer age;

    public void show() {
        userDao.show();
    }
}
