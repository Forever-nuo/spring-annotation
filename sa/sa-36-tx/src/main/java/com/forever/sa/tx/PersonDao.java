package com.forever.sa.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-14.22:01
 */
@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertPerson(){
        String sql = "insert person (name,age) values (?,?)";
        jdbcTemplate.update(sql,"张三"+Math.random(),15);
        int i = 10/0;
    }

}
