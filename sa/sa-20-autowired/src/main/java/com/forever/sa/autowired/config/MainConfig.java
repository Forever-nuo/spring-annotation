package com.forever.sa.autowired.config;

import com.forever.sa.autowired.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.19:43
 */
@Configuration
@ComponentScan("com.forever.sa.autowired")
public class MainConfig {

    @Bean
    public Person person(){
        return new Person().setType(1);
    }

    @Bean
    public Person person2(){
        return new Person().setType(2);
    }

    @Bean
    public Cat cat1(){
        return  new Cat().setType(1);
    }

    @Bean
    public Cat cat2(){
        return  new Cat().setType(2);
    }


    @Bean
    public Tiger tiger1(){
        return  new Tiger().setType(1);
    }

    @Primary
    @Bean
    public  Tiger tiger2(){
        return  new Tiger().setType(2);
    }

    @Bean
    public  Tiger tiger3(){
        return  new Tiger().setType(3);
    }


    @Bean
    public Red red1(){
        return new Red().setType(1);
    }

    @Bean
    public Red red2(){
        return new Red().setType(2);
    }



    @Bean
    public Green green1(){
        return  new Green().setType(1);
    }

    @Bean
    public Green green2(){
        return  new Green().setType(2);
    }

    @Primary
    @Bean
    public Green green3(){
        return new Green().setType(3);
    }
}
