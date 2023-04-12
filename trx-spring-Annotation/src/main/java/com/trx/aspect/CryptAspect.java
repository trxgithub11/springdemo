package com.trx.aspect;

import com.trx.util.CryptUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CryptAspect {

    @Pointcut("@annotation(com.trx.annotation.Crypt)")
    public void pt(){

    }

    @Around("pt()")
    public Object  crypt(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        String arg = (String) args[0];
        String s = CryptUtil.AESdecode(arg);
        args[0] = s;
        Object proceed = null;
        String ret = null;
        try {
            proceed = pjp.proceed(args);
            ret = (String) proceed;
//            ret = CryptUtil.AESdecode(ret);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return ret;
    }
}
