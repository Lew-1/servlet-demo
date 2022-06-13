package com.example.servletdemo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet1 implements Servlet {

    public HelloServlet1() {
        System.out.println("servlet constructor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet init...");
        System.out.println("HelloServlet1 的别名是 " + servletConfig.getServletName());
        System.out.println("初始化参数 user_name :" + servletConfig.getInitParameter("user_name"));
        System.out.println("初始化参数 password :" + servletConfig.getInitParameter("password"));
        // 获取 servletContext 对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            System.out.println("get method");
        } else if ("POST".equals(method)) {
            System.out.println("post method");
        }
        System.out.println("servlet service start");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }
}
