package com.forever.sa.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-14.22:19
 */
@Service
public class PersonService {
    @Autowired
    private  PersonDao personDao;

    @Transactional
    public void insertPerson(){
        personDao.insertPerson();
    }
}
