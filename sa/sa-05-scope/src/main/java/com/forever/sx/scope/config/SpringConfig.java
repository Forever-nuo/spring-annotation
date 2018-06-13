package com.forever.sx.scope.config;


import com.forever.sx.scope.mode.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
public class SpringConfig {

    /**
     * 单例bean
     * @return
     */
    @Scope("singleton")
    @Bean
    public Person personSingleton(){
        return new Person();
    }

    /**
     * 多例bean
     * @return
     */
    @Scope("prototype")
    @Bean
    public Person personPrototype(){
        return new Person("多例");
    }
}
