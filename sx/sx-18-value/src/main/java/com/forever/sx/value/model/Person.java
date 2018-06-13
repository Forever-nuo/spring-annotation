package com.forever.sx.value.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 16:35
 */
@Data
public class Person {
    /**
     * 赋值
     * 方式1:直接赋值
     * 方式2: SPEL 表达式
     * 方式2: 配置文件,环境变量中 获取值
     */

    private String name;


    private Integer age;

    private String height;
}
