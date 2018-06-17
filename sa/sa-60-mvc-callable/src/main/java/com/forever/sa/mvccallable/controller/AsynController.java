package com.forever.sa.mvccallable.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.concurrent.Callable;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.11:18
 */
@Slf4j
@RestController
public class AsynController {

    @GetMapping("asyn1")
    public Callable<String> asyn1(){
       log.info("当前线程:"+Thread.currentThread()+"时间:"+System.currentTimeMillis());
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("当前线程:"+Thread.currentThread()+"时间:"+System.currentTimeMillis());
                Thread.sleep(6000);
                log.info("当前线程:"+Thread.currentThread()+"时间:"+System.currentTimeMillis());
                return "异步请求的返回结果";
            }
        };
        log.info("当前线程:"+Thread.currentThread()+"时间:"+System.currentTimeMillis());
        return callable;
    }
}
