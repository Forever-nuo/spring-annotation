package com.forever.sa.value.config;

import com.forever.sa.value.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:21
 */
@Configuration
@Import(Person.class)
public class MainConfig {

    /**
     * 在配置类中也可以使用
     * 使用在字段上
     */
    @Value("#{age}")
    private String age;


    /**
     * 使用在参数上
     * @param ages
     * @return
     */
    @Bean
    public  Person person2(@Value("${age}") Integer ages){

        return new Person().setAge(ages);
    }
}
