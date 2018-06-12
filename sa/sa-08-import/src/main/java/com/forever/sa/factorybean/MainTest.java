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

    @Test
    public void testImport() {
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            log.info(bean);
        }
    }


}
