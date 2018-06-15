package com.forever.sa.src;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: Forever丶诺
 * @date: 2018/6/15 15:52
 */
@Slf4j
public class PersonFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      log.info("PersonFilter的init方法");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        log.info("PersonFilter的doFilter方法");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.info("PersonFilter的destroy方法");
    }
}
