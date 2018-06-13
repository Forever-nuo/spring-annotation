package com.forever.sa.autowired;

import com.forever.sa.autowired.config.MainConfig;
import com.forever.sa.autowired.controller.*;
import com.forever.sa.autowired.model.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.19:44
 */
public class MainTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


    /**
     * 测试结果
     * 注入的Bean 和spring 容器中的Bean是一样的
     */
    @Test
    public void testSameBean() {
        DogController bean = context.getBean(DogController.class);
        Dog dog1 = bean.getDog();
        Dog dog2 = context.getBean(Dog.class);
        System.out.println(dog1==dog2);
    }

    @Test
    public void testTwoBean() {
        PersonController bean = context.getBean(PersonController.class);
        Person person = bean.getPerson();
        System.out.println(person);
    }


    @Test
    public void testQualifier() {

        CatController bean = context.getBean(CatController.class);
        Cat cat1 = bean.getCat1();
        System.out.println(cat1);
    }


    /**
     *
     */
    @Test
    public void testPrimary() {
        TigerController bean = context.getBean(TigerController.class);
        Tiger tiger1 = bean.getTiger1();
        //输出1  优先qualifier
        System.out.println(tiger1);
        Tiger tiger3 = bean.getTiger3();

        //输出2  然后@使用@primary的注解bean
        System.out.println(tiger3);
    }


    @Test
    public void testRequired() {
        BirdieController bean = context.getBean(BirdieController.class);
    }


    @Test
    public void testResource() {
        RedController bean = context.getBean(RedController.class);
        //是type =1
        System.out.println( bean.getRed1());
        //也是type =1
        System.out.println( bean.getRed2());
    }


    @Test
    public void testInject() {
        GreenController bean = context.getBean(GreenController.class);
        System.out.println(bean.getGreen1());
        System.out.println(bean.getGreen2());
        System.out.println(bean.getGreen3());
    }


}
