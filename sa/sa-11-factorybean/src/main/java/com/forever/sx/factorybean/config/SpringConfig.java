package com.forever.sx.factorybean.config;


import com.forever.sx.factorybean.factory.AnimalFactory;
import com.forever.sx.factorybean.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
public class SpringConfig {

    @Bean
    public  Person person(){
        return new Person();
    }

    @Bean
    public AnimalFactory animalFactory(){
        return new AnimalFactory("dog");
    }

}
