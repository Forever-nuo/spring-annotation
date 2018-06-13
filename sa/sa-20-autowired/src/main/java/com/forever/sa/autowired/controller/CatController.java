package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Cat;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.20:15
 */
@Data
@Controller
public class CatController {

    @Qualifier("cat2")
    @Autowired
    private Cat cat1;
}
