package com.trx.service;
import com.trx.aspect.InvokeLog;
import org.springframework.stereotype.Service;
@Service
public class PhoneService {

    @InvokeLog
    public void deleteAll(){

        System.out.println("PhoneService中deleteAll的核心代码");
//        System.out.println(1/0);
    }
}
