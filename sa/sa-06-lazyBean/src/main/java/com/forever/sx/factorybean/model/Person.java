package com.forever.sx.factorybean.model;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.22:01
 */
@Data
@Slf4j
@Accessors(chain=true)
public class Person {
    private String name;
    private Integer age;

    public Person() {
        log.info("不懒加载的Bean");
    }

    public Person(String name) {
        this.name = name;
        log.info("懒加载的Bean");
    }
}
