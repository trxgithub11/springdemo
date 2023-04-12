package com.trx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(2)
public class PrintLogAspect {

    @Pointcut("execution(* com.trx.controller..*.*(..))")
    public void pt(){

    }

    @Before("pt()")
    public void printLog(JoinPoint joinPoint){

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(className+"=="+methodName+"====="+ Arrays.toString(args));
    }
}
