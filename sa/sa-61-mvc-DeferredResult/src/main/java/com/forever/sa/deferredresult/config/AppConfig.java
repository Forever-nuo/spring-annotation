package com.forever.sa.deferredresult.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.10:56
 */
@Configuration
@ComponentScan(value = "com.forever.sa.deferredresult",excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
