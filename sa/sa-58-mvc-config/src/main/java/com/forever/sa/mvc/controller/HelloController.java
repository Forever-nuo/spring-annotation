package com.forever.sa.mvc.controller;


import com.forever.sa.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/hello")
    public  String hello (){
        return  "hello";
    }



}
