package com.forever.sa.acap;

import com.forever.sa.acap.config.MainConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 15:36
 */
@Slf4j
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
    @Test
    public void testAca() {

    }

}
