package com.forever.sa.aop;

import com.forever.sa.aop.config.MainConfig;
import com.forever.sa.aop.target.MathDivision;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:56
 */
public class MainTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void testAop() {
        MathDivision bean = context.getBean(MathDivision.class);
        bean.div(4,2);
    }

    @Test
    public void testAopException() {
        MathDivision bean = context.getBean(MathDivision.class);
        bean.div(4,0);
    }
}
