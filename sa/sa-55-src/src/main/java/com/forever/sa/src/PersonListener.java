package com.forever.sa.src;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 15:55
 */
@Slf4j
public class PersonListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("userServlet", UserServlet.class);
        dynamic.addMapping("/user");
        log.info("PersonListener的contextInitialized方法");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("PersonListener的contextDestroyed方法");
    }
}
