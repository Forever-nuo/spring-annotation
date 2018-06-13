package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Dog;
import com.forever.sa.autowired.model.Person;
import com.forever.sa.autowired.service.PersonService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.19:41
 */
@Controller
@Data
public class PersonController {

    @Autowired
    private Person person;



}
