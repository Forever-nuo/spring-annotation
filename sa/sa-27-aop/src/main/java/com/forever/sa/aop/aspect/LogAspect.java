package com.forever.sa.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:42
 */
@Slf4j
@Aspect
public class LogAspect {

    /**
     * 抽取公共切入点表达式
     */
    @Pointcut("execution (public int com.forever.sa.aop.target.MathDivision.div(..))")
    public void pointCut(){}

    /***
     * 前置通知 方法执行之前执行
     */
    @Before("execution (public int com.forever.sa.aop.target.MathDivision.div(..))")
    public void beforeMethod (JoinPoint joinPoint){
       log.info("前置通知方法执行************");
    }

    /**
     * 后置通知
     * 使用公共切入点表达式
     * @param
     */
    @After("pointCut()")
    public  void afterMethod(){
        log.info("后置通知方法执行*****************");
    }

    /**
     * 后置通知异常照样执行的方法
     * 获取返回的结果
     */
    @AfterReturning(value = "CommonPointCut.pointCut()",returning = "result")
    public  void afterReturnMethod(Object result){
        log.info("后置通知返回结果执行的方法");
        log.info(""+result);
    }

    /**
     * 异常通知方法
     *JoinPoint 获取目标方法 的信息
     *Exception 获取异常的信息
     */
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void  afterThrowing(JoinPoint joinPoint,Exception ex){
        log.info("异常通知方法执行**************");
        Object[] args = joinPoint.getArgs();
        log.info("方法:" +joinPoint.getSignature()+"异常信息:" +ex.toString());
    }

}
