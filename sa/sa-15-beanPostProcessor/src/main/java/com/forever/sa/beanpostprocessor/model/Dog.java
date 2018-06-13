package com.forever.sa.beanpostprocessor.model;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 11:39
 */

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Data
@Slf4j
public class Dog {

    @PostConstruct
    public void init(){
        log.info("dog初始化方法");
    }

    @PreDestroy
    public void destroy(){
        log.info("dog销毁方法");
    }

    public Dog() {
        log.info("dog的构造函数");
    }
}
