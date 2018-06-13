package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Red;
import lombok.Data;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.20:59
 */
@Controller
@Data
public class RedController {

    @Resource
    private Red red1;

    @Resource(name = "red1")
    private Red red2;
}
