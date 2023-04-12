package com.trx;

import com.trx.controller.AopController;
import com.trx.util.CryptUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemoTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AopController aopController = applicationContext.getBean(AopController.class);
        String question = CryptUtil.AESencode("你三连了吗？");
        String answer = aopController.getAnswer(question);
        System.out.println(answer);
    }
}
