package com.forever.sx.factorybean;


import com.forever.sx.factorybean.config.SpringConfig;
import com.forever.sx.factorybean.model.Person;
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
    public void testConditional() {
        String[] beans = context.getBeanNamesForType(Person.class);
        for (String bean : beans) {
            log.info(bean);
        }
    }


}
