package com.forever.sa.autowired.controller;

import com.forever.sa.autowired.model.Tiger;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.20:24
 */
@Controller
@Data
public class TigerController {

    @Qualifier("tiger1")
    @Autowired
    private Tiger tiger1;

    @Autowired
    private Tiger tiger3;
}
