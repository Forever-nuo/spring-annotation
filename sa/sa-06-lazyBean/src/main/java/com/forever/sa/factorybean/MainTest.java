package com.forever.sa.factorybean;


import com.forever.sa.factorybean.config.SpringConfig;
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
     * 测试懒加载的Bean
     */
    @Test
    public void testGetLazyBean() {
        log.info("懒加载的bean*****************");
        context.getBean("lazyPerson");
    }

    /**
     * 测试不懒加载的Bean
     */
    @Test
    public void testGetBean() {
        log.info("不懒加载的bean*****************");
        context.getBean("notLazyBean");
    }
}
