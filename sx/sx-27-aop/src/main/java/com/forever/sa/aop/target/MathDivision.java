package com.forever.sa.aop.target;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: Forever丶诺
 * @date: 2018/6/14 9:41
 */
@Slf4j
public class MathDivision {

    public int div(int i, int j) {
        log.info("目标方法执行");
        return i / j;
    }

}
