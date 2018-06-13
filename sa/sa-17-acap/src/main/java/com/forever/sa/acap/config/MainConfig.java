package com.forever.sa.acap.config;

import com.forever.sa.acap.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 15:33
 */
@Configuration
@Import(Person.class)
public class MainConfig {
}
