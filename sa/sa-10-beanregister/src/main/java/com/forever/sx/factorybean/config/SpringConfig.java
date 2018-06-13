package com.forever.sx.factorybean.config;



import com.forever.sx.factorybean.beanRegister.AnimalRegister;
import com.forever.sx.factorybean.model.Green;
import com.forever.sx.factorybean.model.Person;
import com.forever.sx.factorybean.model.Yellow;
import com.forever.sx.factorybean.selectors.ColorSelectors;
import org.springframework.context.annotation.*;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
//import注解会将第三方类 注册到容器中
@Import({Yellow.class,Green.class,ColorSelectors.class,AnimalRegister.class})
public class SpringConfig {

    @Bean
    public  Person person(){
        return new Person();
    }

}
