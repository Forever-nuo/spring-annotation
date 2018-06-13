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


    @Bean
    public Cat cat(Red red){

        return new Cat().setRed(red);
    }


    @Bean
    public Dog dog(@Autowired Yellow yellow){
        return new Dog().setYellow(yellow);
    }
}
