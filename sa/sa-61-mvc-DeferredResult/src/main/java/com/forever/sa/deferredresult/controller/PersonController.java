package com.forever.sa.deferredresult.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
