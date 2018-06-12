package com.forever.sa.factorybean.beanRegister;

import com.forever.sa.factorybean.model.Cat;
import com.forever.sa.factorybean.model.Dog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.23:42
 */
public class AnimalRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //根据包含的bean 来注册bean
        boolean b1 = registry.containsBeanDefinition("person");
        if(b1){
            //手动注入需要导入的类
            registry.registerBeanDefinition("cat",new RootBeanDefinition(Cat.class));
            registry.registerBeanDefinition("dog",new RootBeanDefinition(Dog.class));
        }
    }
}
