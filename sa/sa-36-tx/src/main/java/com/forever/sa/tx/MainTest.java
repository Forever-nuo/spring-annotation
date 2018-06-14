package com.forever.sa.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-14.22:20
 */

public class MainTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        personService.insertPerson();
    }
}
