package com.forever.sa.smvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 16:48
 */
@ComponentScan(value = "com.forever.sa.smvc",includeFilters = @ComponentScan.Filter(Controller.class),
        useDefaultFilters = false)
@Configuration
public class MvcConfig {
}
