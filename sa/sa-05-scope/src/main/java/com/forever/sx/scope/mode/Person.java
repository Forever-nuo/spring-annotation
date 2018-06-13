package com.forever.sx.scope.mode;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Forever丶诺
 * @date: 2018/6/12 11:40
 */
@Data
@Slf4j
@Accessors(chain=true)
public class Person {
    private String name;
    private Integer age;

    public Person() {
        log.info("单列");
    }

    public Person(String name) {
        this.name = name;
        log.info("多例");
    }
}
