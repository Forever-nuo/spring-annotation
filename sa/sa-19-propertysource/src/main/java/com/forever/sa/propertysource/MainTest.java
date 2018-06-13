package com.forever.sa.propertysource;


import com.forever.sa.propertysource.config.MainConfig;
import com.forever.sa.propertysource.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:25
 */
@Slf4j
public class MainTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void testBean() {
        /**
         * 获取配置环境中的值
         */
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("person.height");
        System.out.println(property);

        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }



}
