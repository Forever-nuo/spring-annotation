package com.forever.sa.factorybean.config;



import com.forever.sa.factorybean.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
public class SpringConfig {

    /**
     * 懒加载的Bean
     *
     * @return
     */
    @Lazy
    @Bean
    public Person lazyPerson(){
        return new Person("懒加载的Bean");
    }

    /**
     *  不懒加载的Bean
     * @return
     */
    @Bean
    public Person notLazyBean(){
        return new Person();
    }
}
