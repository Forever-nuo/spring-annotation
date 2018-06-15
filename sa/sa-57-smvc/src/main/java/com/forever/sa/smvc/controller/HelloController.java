package com.forever.sa.smvc.controller;

import com.forever.sa.smvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 16:49
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/say")
    @ResponseBody
    public  String say (){
      return   helloService.say("spring-mvc");
    }

}
