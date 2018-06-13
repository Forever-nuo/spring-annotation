package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Birdie;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.20:42
 */

@Controller
@Data
public class BirdieController {

    @Autowired(required = false)
    private Birdie birdie;

}
