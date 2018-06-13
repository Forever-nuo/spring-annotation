package com.forever.sa.autowired.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.19:49
 */
@Data
@Accessors(chain = true)
public class Person {
    private Integer type = 1;
}
