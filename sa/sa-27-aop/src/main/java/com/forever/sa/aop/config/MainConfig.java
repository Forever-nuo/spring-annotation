package com.forever.sa.aop.config;

import com.forever.sa.aop.aspect.LogAspect;
import com.forever.sa.aop.target.MathDivision;
import org.junit.Test;
import org.springframework.context.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:56
 */
@Configuration
@EnableAspectJAutoProxy
@Import({LogAspect.class,MathDivision.class})
public class MainConfig {

 /*   @Bean
    public  LogAspect logAspect(){
        return new LogAspect();
    }

    @Bean
    public  MathDivision mathDivision(){
        return  new MathDivision();
    }*/

}
