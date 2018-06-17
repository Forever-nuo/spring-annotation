package com.forever.sa.deferredresult.controller;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.11:55
 */
public class DeferredResultSequence {

    public static Queue<DeferredResult<String>> queue = new ConcurrentLinkedDeque<>();

    public static void save(DeferredResult<String> result){
        queue.add(result);
    }

    public static  DeferredResult<String> get(){
      return   queue.poll();
    }

}
