package com.forever.sx.beaninitdestroy;

import com.forever.sx.beaninitdestroy.config.MainConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.21:42
 */
@Slf4j
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    /**
     * 测试获取单例
     */
    @Test
    public void testGetSingleton() {
    }


    @Test
    public void closeApp(){
        context.close();
    }

    /**
     * 测试获取多例
     */
    @Test
    public void testGetPrototype() {
       context.getBean("protoTypePerson");
        context.getBean("protoTypePerson");
        context.close();

    }
}
