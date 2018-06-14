package com.forever.sa.tx;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-14.22:00
 */
@ComponentScan("com.forever.sa.tx")
@EnableTransactionManagement
@Configuration
public class MainConfig {

    /**
     * 注册数据源
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new DruidDataSource();
        ((DruidDataSource) dataSource).setUrl("jdbc:mysql://localhost:3306/comtest");
        ((DruidDataSource) dataSource).setPassword("");
        ((DruidDataSource) dataSource).setUsername("root");
        ((DruidDataSource) dataSource).setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    /**
     * 注册jdbcTemplate
     */
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    /**
     * 注册事务管理器
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }





}
