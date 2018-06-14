package com.forever.sa.aop;

import com.forever.sa.aop.target.MathDivision;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:56
 */
public class MainTest {

  public  static ClassPathXmlApplicationContext context =   new ClassPathXmlApplicationContext("spring-context.xml");

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
