package com.forever.sa.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 16:48
 */
@ComponentScan(value = "com.forever.sa.mvc",includeFilters = @ComponentScan.Filter(Controller.class),
        useDefaultFilters = false)
@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 配置视图解析器
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/view/",".jsp");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
