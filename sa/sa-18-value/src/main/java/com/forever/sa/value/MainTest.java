package com.forever.sa.value;

import com.forever.sa.value.config.MainConfig;
import com.forever.sa.value.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:25
 */
@Slf4j
public class MainTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void testBean() {
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }



}
