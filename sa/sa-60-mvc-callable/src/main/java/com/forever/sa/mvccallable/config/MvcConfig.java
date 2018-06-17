package com.forever.sa.mvccallable.config;

import com.forever.sa.mvccallable.Intercept.MyAsyncHandlerInterceptor;
import com.forever.sa.mvccallable.Intercept.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.10:57
 */
@Configuration
@ComponentScan(value = "com.forever.sa.mvccallable",includeFilters = @ComponentScan.Filter(Controller.class),useDefaultFilters = false)
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new MyAsyncHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


}
