package com.forever.sa.profile.config;

import com.forever.sa.profile.model.Cat;
import com.forever.sa.profile.model.MyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.23:22
 */
@Profile("dev")
@PropertySource("classpath:c3po.properties")
@Configuration
public class MainConfig2 implements EmbeddedValueResolverAware {

    private  StringValueResolver resolver;

    @Value("${password}")
    String password;


    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Profile("dev")
    @Bean
    public MyDataSource dev(@Value("${driverName}") String driverName){
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setName(resolver.resolveStringValue("${name}"));
        myDataSource.setPassword(password);
        myDataSource.setDriverName(driverName);
        myDataSource.setUrl("localhost:3306/dev");
        return  myDataSource;
    }

    @Profile("test")
    @Bean
    public  MyDataSource test(@Value("${driverName}") String driverName){
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setName(resolver.resolveStringValue("${name}"));
        myDataSource.setPassword(password);
        myDataSource.setDriverName(driverName);
        myDataSource.setUrl("localhost:3306/test");
        return  myDataSource;
    }

    @Profile("run")
    @Bean
    public  MyDataSource run(@Value("${driverName}") String driverName){
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setName(resolver.resolveStringValue("${name}"));
        myDataSource.setPassword(password);
        myDataSource.setDriverName(driverName);
        myDataSource.setUrl("localhost:3306/run");
        return  myDataSource;
    }




    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver=resolver;
    }
}
