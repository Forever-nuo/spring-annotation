package com.forever.config;

import com.forever.mode.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import static org.springframework.context.annotation.FilterType.ANNOTATION;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
//@ComponentScan(value = "com.forever",excludeFilters ={@ComponentScan.Filter(type = ANNOTATION,value = Controller.class)})
//@ComponentScan("com.forever")
//@ComponentScan(value = "com.forever",useDefaultFilters=false,includeFilters ={@ComponentScan.Filter(type = ANNOTATION,classes = {Controller.class})})
//重复配置
//@ComponentScan("com.forever.controller")
//@ComponentScan("com.forever.dao")
@ComponentScans({@ComponentScan("com.forever.controller"),@ComponentScan("com.forever.dao")})
public class SpringConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
