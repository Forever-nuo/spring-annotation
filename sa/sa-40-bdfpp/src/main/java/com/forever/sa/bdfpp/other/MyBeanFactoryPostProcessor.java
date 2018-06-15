package com.forever.sa.bdfpp.other;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 8:44
 */
@Component
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        //获取已经定义的Bean
        log.info("已经定义的Bean的名称"+Arrays.asList(beanDefinitionNames));
        log.info(""+"BeanFactoryPostProcessor方法执行");

    }
}
