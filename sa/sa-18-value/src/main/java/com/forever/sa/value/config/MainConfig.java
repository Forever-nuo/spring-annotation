package com.forever.sa.value.config;

import com.forever.sa.value.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:21
 */
@Configuration
@Import(Person.class)
public class MainConfig {
}
