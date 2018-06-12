package com.forever;

import com.forever.config.SpringConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.19:51
 */
@Slf4j
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        log.info("注解 方式:" + context.toString());
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            log.info(beanName);
        }
    }
}
