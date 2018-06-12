package com.forever.sa.factorybean.config;


import com.forever.sa.factorybean.factory.AnimalFactory;
import com.forever.sa.factorybean.model.Animal;
import com.forever.sa.factorybean.model.Person;
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
