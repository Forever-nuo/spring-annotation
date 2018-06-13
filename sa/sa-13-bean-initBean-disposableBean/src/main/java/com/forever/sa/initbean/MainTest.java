package com.forever.sa.initbean;

import com.forever.sa.initbean.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/13 10:46
 */
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void testGetBean() {

    }

    @Test
    public void testDestroy() {
        context.close();
    }
}
