package com.forever.sa.bdfpp;

import com.forever.sa.bdfpp.config.MainConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 9:51
 */
@Slf4j
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
    @Test
    public void test() {
        log.info("222");

    }
}
