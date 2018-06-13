package com.forever.sx.beaninitdestroy.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 9:42
 */
@Slf4j
@Data
public class Person {
    private String name;
    private Integer age;

    public Person() {
        log.info("单例对象的创建....");
    }

    public Person(String name) {
        this.name = name;
        log.info("多例对象的创建......");
    }

    /**
     * 需要初始化大量数据
     * 连接数据库
     */
    public void init() {
        log.info("初始化方法");
    }

    /**
     * 数据源资源的释放
     */
    public void destroy(){
        log.info("销毁方法"+this.name);
    }

}