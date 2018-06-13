package com.forever.sx;

import com.forever.sx.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:41
 */
@Slf4j
public class MainTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    @Test
    public void test() {
        Person bean = context.getBean(Person.class);

        System.out.println(bean);
    }
}
