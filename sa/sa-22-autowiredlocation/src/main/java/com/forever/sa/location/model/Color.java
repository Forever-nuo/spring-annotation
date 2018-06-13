package com.forever.sa.location.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.22:09
 */
@Data
@Accessors(chain = true)
@Component
public class Color {


    private  Red red;


    public Color(Red red) {
        this.red = red;
    }
}
