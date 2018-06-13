package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Green;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.21:08
 */
@Controller
@Data
public class GreenController {

    @Inject
    private Green green1;


    @Inject
    private Green green2;

    @Qualifier("green2")
    @Inject
    private Green green3;
}
