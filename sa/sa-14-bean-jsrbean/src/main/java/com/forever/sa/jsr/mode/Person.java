package com.forever.sa.jsr.mode;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 10:45
 */
@Slf4j
@Data
public class Person  {
    private String name;

    public Person() {
        log.info("构造函数");
    }

    @PreDestroy
    public void destroy() throws Exception {
        log.info("销毁方法");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        log.info("初始化方法");
    }
}
