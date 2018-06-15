package com.forever.sa.applistener.other;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 11:30
 */
@Component
@Slf4j
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {



    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("打印检测到的事件"+event);
    }
}
