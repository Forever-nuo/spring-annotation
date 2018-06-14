package com.forever.sa.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:42
 */
@Slf4j
public class LogAspect {




    public void beforeMethod (JoinPoint joinPoint){
       log.info("前置通知方法执行************");
    }


    public  void afterMethod(){
        log.info("后置通知方法执行*****************");
    }


    public  void afterReturnMethod(Object result){
        log.info("后置通知返回结果执行的方法");
        log.info(""+result);
    }


    public void  afterThrowing(JoinPoint joinPoint,Exception ex){
        log.info("异常通知方法执行**************");
        Object[] args = joinPoint.getArgs();
        log.info("方法:" +joinPoint.getSignature()+"异常信息:" +ex.toString());
    }

}
