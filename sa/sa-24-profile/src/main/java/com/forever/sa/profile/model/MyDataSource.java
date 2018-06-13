package com.forever.sa.profile.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.23:23
 */
@Data
@Accessors(chain = true)
public class MyDataSource {
    private String url;
    private String name;
    private String password;
    private String driverName;
}
