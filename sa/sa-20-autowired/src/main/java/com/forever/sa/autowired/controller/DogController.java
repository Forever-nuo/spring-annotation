package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Dog;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.20:05
 */
@Data
@Controller
public class DogController {

    @Autowired
    private Dog dog;
}
