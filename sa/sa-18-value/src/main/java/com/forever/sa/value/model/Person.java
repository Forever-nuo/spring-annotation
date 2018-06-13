package com.forever.sa.value.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:21
 */
@Data
@Slf4j
public class Person {

    /**
     * 赋值
     * 方式1:直接赋值
     * 方式2: SPEL 表达式
     * 方式2: 配置文件,环境变量中 获取值
     */
    @Value("张三")
    private String name;

    @Value("#{20-3}")
    private Integer age;

    @Value("${height}")
    private String height;

}
