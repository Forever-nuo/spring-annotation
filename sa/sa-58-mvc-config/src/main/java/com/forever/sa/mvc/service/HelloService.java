package com.forever.sa.mvc.service;

import org.springframework.stereotype.Service;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 16:49
 */
@Service
public class HelloService {

    public String say (String name){
        return  "hello"+name;
    }
}
