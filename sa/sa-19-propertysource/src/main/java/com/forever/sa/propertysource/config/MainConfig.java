package com.forever.sa.propertysource.config;

import com.forever.sa.propertysource.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:21
 */
@Configuration
@PropertySource("classpath:person.properties")
@Import(Person.class)
public class MainConfig {
}
