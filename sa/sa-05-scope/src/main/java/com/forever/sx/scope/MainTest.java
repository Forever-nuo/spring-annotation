package com.forever.sx.scope;

import com.forever.sx.scope.config.SpringConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.21:42
 */
@Slf4j
public class MainTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    /**
     * 测试获取单例
     */
    @Test
    public void testGetSingleton() {
        Object singleton1 = context.getBean("personSingleton");
        Object singleton2 = context.getBean("personSingleton");
        if (singleton1==singleton2){
            log.info("2个对象相等");
        }
    }

    /**
     * 测试获取多例
     */
    @Test
    public void testGetPrototype() {
        Object singleton1 = context.getBean("personPrototype");
        Object singleton2 = context.getBean("personPrototype");
        if (singleton1==singleton2){
            log.info("2个对象相等");
        }else{
            log.info("2个对象不相等");
        }
    }
}
