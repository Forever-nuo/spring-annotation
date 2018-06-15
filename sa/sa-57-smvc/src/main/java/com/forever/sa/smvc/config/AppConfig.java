package com.forever.sa.smvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * 父容器 排除controller层
 * @author: Forever丶诺
 * @date: 2018/6/15 16:48
 */
@ComponentScan(value = "com.forever.sa.smvc",excludeFilters =@ComponentScan.Filter(Controller.class) )
@Configuration
public class AppConfig {
}
