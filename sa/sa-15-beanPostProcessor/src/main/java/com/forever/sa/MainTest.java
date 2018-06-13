package com.forever.sa;

import com.forever.sa.beanpostprocessor.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 11:48
 */
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    /**
     * 测试获取单例
     */
    @Test
    public void testGetSingleton() {
    }


    @Test
    public void closeApp(){
        context.close();
    }

    /**
     * 测试获取多例
     */
    @Test
    public void testGetPrototype() {
        context.getBean("protoTypePerson");
        context.getBean("protoTypePerson");
        context.close();

    }
}
