package com.forver.sa.ansy.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.jws.WebService;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-16.12:29
 */
@WebServlet(value = "/ansy", asyncSupported = true)
@Slf4j
public class AnsyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("启动主线程" + Thread.currentThread() + System.currentTimeMillis());
        //主线程启动
        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                            log.info("启动线程" + Thread.currentThread() + System.currentTimeMillis());
                            asyncContext.complete();
                            AsyncContext asyncContext1 = req.getAsyncContext();
                            asyncContext1.getResponse().getWriter().write("ansy");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        log.info("启动主线程" + Thread.currentThread() + System.currentTimeMillis());
      //  resp.getWriter().write("not ansy");
    }
}
