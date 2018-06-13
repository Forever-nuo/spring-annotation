package com.forever.sa.location;

import com.forever.sa.location.compent.Boss;
import com.forever.sa.location.config.MainConfig;
import com.forever.sa.location.model.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.21:43
 */
public class MainTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);



    @Test
    public void testMethod() {

        Boss boss = context.getBean(Boss.class);

        Red red = context.getBean(Red.class);
        System.out.println(red==boss.getRed());
        Yellow yellow = context.getBean(Yellow.class);

        System.out.println(yellow==boss.getYellow());

        //只有一个构造函数 ,省略autowired
        Color color = context.getBean(Color.class);
        System.out.println(color.getRed()==red);

        //@bean+@autowired
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getRed()==red);


        //@bean + 省略autowired
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog.getYellow()==yellow);

    }
}
