package com.forever.sa.beanpostprocessor.config;

import com.forever.sa.beanpostprocessor.model.Cat;
import com.forever.sa.beanpostprocessor.model.Dog;
import com.forever.sa.beanpostprocessor.postprocessor.MyBeanPostProcessor;
import com.forever.sa.beanpostprocessor.postprocessor.MyBeanPostProcessor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 11:37
 */
@Configuration
@Import({Cat.class,Dog.class,MyBeanPostProcessor.class,MyBeanPostProcessor2.class})
public class MainConfig {
}
