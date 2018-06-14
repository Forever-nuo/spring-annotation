package com.forever.sa.location.config;

import com.forever.sa.location.compent.Boss;
import com.forever.sa.location.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.21:42
 */
@Configuration
@ComponentScan("com.forever.sa.location")
public class MainConfig {

    /**
     * 将容器中的bean 作为参数 注入
     * @param red
     * @return
     */
    @Bean
    public Cat cat(Red red){
        return new Cat().setRed(red);
    }

    @Bean
    public Book book(){
        return  new Book();
    }


    /**
     * 调用容器中的Bean 的方法注入Bean
     * spring会对特殊处理,不会每次都调用方法
     * @return
     */
    @Bean
    public  Person person(){
        return  new Person().setBook(new Book());
    }


    @Bean
    public Dog dog(@Autowired Yellow yellow){
        return new Dog().setYellow(yellow);
    }
}
