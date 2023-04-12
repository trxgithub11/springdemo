package com.trx;

import com.trx.config.ApplicationConfig;
import com.trx.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Demo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext  app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService = (UserService) app.getBean("userService");
        DataSource dataSource = (DataSource) app.getBean("dataSource");
        System.out.println(userService);
        System.out.println(dataSource);
    }
}
