package com.forever;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.19:51
 */
@Slf4j
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        log.info("xml 方式:"+context.toString());
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            log.info(beanName);
        }
    }
}
