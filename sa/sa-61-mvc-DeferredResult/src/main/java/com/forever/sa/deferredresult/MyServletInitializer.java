package com.forever.sa.deferredresult;


import com.forever.sa.deferredresult.config.AppConfig;
import com.forever.sa.deferredresult.config.MvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.10:54
 */
public class MyServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   //父容器的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
