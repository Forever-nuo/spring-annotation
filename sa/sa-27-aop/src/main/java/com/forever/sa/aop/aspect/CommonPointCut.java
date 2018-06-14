package com.forever.sa.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 16:43
 */
public class CommonPointCut {

    @Pointcut("execution (public int com.forever.sa.aop.target.MathDivision.div(..))")
    public void pointCut(){}
}
