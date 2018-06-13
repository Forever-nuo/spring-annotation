package com.forever.sa.beanpostprocessor.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 11:41
 */
@Slf4j
public class MyBeanPostProcessor2 implements BeanPostProcessor {

    /**
     * 初始化方法之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("***MyBeanPostProcessor2 **********初始化方法之前"+beanName);
        //可以对bean 对象进行处理返回 处理之后的bean
        return bean;
    }

    /**
     * 初始化方法之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("****MyBeanPostProcessor2 *********初始化方法之后"+beanName);
        //可以对bean 对象进行处理返回 处理之后的bean
        return bean;
    }
}
