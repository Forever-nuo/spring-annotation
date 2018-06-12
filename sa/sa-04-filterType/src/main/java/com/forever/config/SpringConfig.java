package com.forever.config;

import com.forever.controller.BookController;
import com.forever.mode.Person;
import com.forever.other.MyTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import static org.springframework.context.annotation.FilterType.ANNOTATION;
import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;
import static org.springframework.context.annotation.FilterType.CUSTOM;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
@ComponentScan(value = "com.forever",useDefaultFilters=false,includeFilters = {@ComponentScan.Filter(type = ASSIGNABLE_TYPE,classes = BookController.class)})
@ComponentScan(value = "com.forever",useDefaultFilters=false,includeFilters = {@ComponentScan.Filter(type = ANNOTATION,value = Service.class)})
@ComponentScan(value = "com.forever",useDefaultFilters=false,includeFilters = {@ComponentScan.Filter(type = CUSTOM,classes = MyTypeFilter.class)})
public class SpringConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
