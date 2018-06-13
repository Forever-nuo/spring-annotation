package com.forever.sx.beaninitdestroy.config;

import com.forever.sx.beaninitdestroy.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 9:40
 */
@Configuration
public class MainConfig {

    /**
     * 单例对象
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        return  new Person();
    }

    /**
     * 多例对象
     * @return
     */
    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person protoTypePerson(){
        return new Person("多例对象");
    }


}
