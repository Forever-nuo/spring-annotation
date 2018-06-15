package com.forever.sa.sci;

import com.forever.sa.sci.service.HelloService;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
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
    }
}
