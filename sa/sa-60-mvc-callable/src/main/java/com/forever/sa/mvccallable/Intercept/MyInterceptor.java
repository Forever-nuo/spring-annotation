package com.forever.sa.mvccallable.Intercept;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.11:02
 */
@Component
@Slf4j
public class MyInterceptor implements WebRequestInterceptor {
    @Override
    public void preHandle(WebRequest request) throws Exception {
        log.info("拦截器方法之前");
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        log.info("拦截器方法postHandle");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
        log.info("拦截器方法afterCompletion");
    }
}
