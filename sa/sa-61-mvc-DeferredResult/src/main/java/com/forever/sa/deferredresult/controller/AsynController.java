package com.forever.sa.deferredresult.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.UUID;
import java.util.concurrent.Callable;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.11:18
 */
@Slf4j
@Controller
public class AsynController {


    //该方法不能真正的执行
    @ResponseBody
    @RequestMapping("createOrder")
    public DeferredResult<String> createOrder() {
        DeferredResult<String> result = new DeferredResult<>();
        DeferredResultSequence.save(result);
        return result;
    }

    @ResponseBody
    @RequestMapping("order")
    public String order() {
        String uuid = UUID.randomUUID().toString();
        DeferredResult<String> result = DeferredResultSequence.get();
        result.setResult(uuid);
        return uuid;
    }
}
