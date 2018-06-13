package com.forever.sa.jsr.config;

import com.forever.sa.jsr.mode.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 10:45
 */
@Configuration
@Import({Person.class})
public class MainConfig {
}
