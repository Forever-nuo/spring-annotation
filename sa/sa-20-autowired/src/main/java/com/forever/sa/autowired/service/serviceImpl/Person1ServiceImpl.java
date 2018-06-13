package com.forever.sa.autowired.service.serviceImpl;

import com.forever.sa.autowired.service.PersonService;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.19:42
 */
@Service
@Data
public class Person1ServiceImpl implements PersonService {

    private  Integer type = 1;
}
