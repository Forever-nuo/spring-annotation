package com.forever.sa.factorybean.config;



import com.forever.sa.factorybean.condition.LinuxCondition;
import com.forever.sa.factorybean.condition.WindowsCondition;
import com.forever.sa.factorybean.model.Person;
import org.springframework.context.annotation.*;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.20:12
 */
@Configuration
public class SpringConfig {

    /**
     * bill
     *
     * @return
     */
    @Conditional({WindowsCondition.class})
    @Bean
    public Person bill(){
        return new Person("bill");
    }

    /**
     * linus
     * @return
     */
    @Conditional({LinuxCondition.class})
    @Bean
    public Person linus(){
        return new Person("linus");
    }
}
