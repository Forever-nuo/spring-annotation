package com.forever.sa.src;

import lombok.extern.log4j.Log4j;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * HandlesTypes 会将HelloService及其所有子类加载容器中
 * @author: Forever丶诺
 * @date: 2018/6/15 15:29
 */
@Log4j
@HandlesTypes(HelloService.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        log.info(""+set);

        //注册servlet 添加映射
        ServletRegistration.Dynamic servletDynamic = servletContext.addServlet("personServlet", PersonServlet.class);
        servletDynamic.addMapping("/person");

        //注册监听器
        servletContext.addListener("com.forever.sa.src.PersonListener");

        //注册过滤器
        FilterRegistration.Dynamic personFilterDynamic = servletContext.addFilter("personFilter", new PersonFilter());
        personFilterDynamic.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }
}
