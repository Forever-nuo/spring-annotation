package com.forever.sx.factorybean;


import com.forever.sx.factorybean.config.SpringConfig;
import com.forever.sx.factorybean.model.Animal;
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
     * 获得工厂创建的bean
     */
    @Test
    public void testFactoryBean() {
        String[] beans = context.getBeanDefinitionNames();

        for (String bean : beans) {
            log.info(bean);
        }
        Animal animal = (Animal)context.getBean("animalFactory");
        System.out.println(animal);

    }

    /**
     * 获得工厂对象本身 &+id
     *
     * {@link org.springframework.beans.factory.BeanFactory}
     */
    @Test
    public void testGetFactory() {
        Object bean = context.getBean("&animalFactory");
        System.out.println(bean);
    }


}
