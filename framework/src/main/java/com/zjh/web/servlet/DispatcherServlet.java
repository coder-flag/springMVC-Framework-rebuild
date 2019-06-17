package com.zjh.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @PackageName: com.zjh.web.servlet
 * @ClassName:   DispatcherServlet
 * @Date:        2019/6/17 14:43
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

public class DispatcherServlet implements Servlet {


    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().print("test");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
