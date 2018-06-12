package com.forever.sa.factorybean.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.22:27
 */
public class WindowsCondition implements Condition {

    /**
     *
     * @param context 判断条件能使用的上下文环境
     * @param metadata 使用了表示注解的,注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //环境对象
        Environment environment = context.getEnvironment();
        //定义的Bean工厂对象
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //bean的注册对象 判断是否注册了bean 然后添加
        BeanDefinitionRegistry registry = context.getRegistry();
        String property = environment.getProperty("os.name");
        if(property.contains("Window")){
            return true;
        }
        return false;
    }
}
