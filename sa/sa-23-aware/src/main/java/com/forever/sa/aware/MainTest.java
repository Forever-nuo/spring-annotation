package com.forever.sa.aware;

import com.forever.sa.aware.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.22:44
 */
public class MainTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test() {
        System.out.println(11);
    }
}
