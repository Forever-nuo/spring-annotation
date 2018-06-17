package com.forever.sa.mvccallable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.11:09
 */
@RestController
public class PersonController {

    @GetMapping("/person")
    public  String person(){
        return "person";
    }
}
