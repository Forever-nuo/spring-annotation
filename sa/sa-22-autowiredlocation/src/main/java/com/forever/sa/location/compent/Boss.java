package com.forever.sa.location.compent;

import com.forever.sa.location.model.Black;
import com.forever.sa.location.model.Red;
import com.forever.sa.location.model.Yellow;
import lombok.Data;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.21:44
 */
@Component
@Data
public class Boss {

    private Red red;


    private Yellow yellow;

    /**
     * 使用在构造骑上
     * @param yellow
     */
    @Autowired
    public Boss(Yellow yellow) {
        this.yellow = yellow;
    }

    /**
     * 默认无参构造器
     * @param red
     */


    /**
     * 使用在方法上
     * @param red
     */
    @Autowired
    public void initRed(Red red){
        this.red = red;
    }

}
