package com.forever.sa.beanpostprocessor.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 11:37
 */
@Slf4j
@Data
public class Cat {

    public Cat() {
        log.info("cat构造函数");
    }

    @PostConstruct
    public void init(){
        log.info("cat初始化方法");
    }

    @PreDestroy
    public void destroy(){
        log.info("cat销毁方法");
    }
}
