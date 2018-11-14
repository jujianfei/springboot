package com.example.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author JuJianFei
 * @date 2018/11/14 10:58
 */
@Component
@Aspect
public class AopClass {

    private long startTime;

    @Pointcut("execution(* com.example.springboot.service.TargetClass.*(..))")
    private void myPointCut(){

    }

    @Before("myPointCut()")
    public void myBefore(){
        startTime = System.currentTimeMillis();
    }

    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        long difference = System.currentTimeMillis() - startTime;
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行的方法为:" + methodName + "," +  "执行时间为:" + difference + "毫秒。");
    }

}
