package com.forever.sa.bfpp.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 8:48
 */
@Slf4j
@Data
@Component
public class Red {

    public Red() {
        log.info("构造函数执行");
    }

    @PostConstruct
    public void init(){
        log.info("初始化方法");
    }

    @PreDestroy
    public void destroy(){
        log.info("销毁方法之前执行");
    }
}