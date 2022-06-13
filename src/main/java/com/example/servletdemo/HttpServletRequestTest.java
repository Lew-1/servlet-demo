package com.example.servletdemo;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author luzhonghe
 * @date 2022/6/13 4:10 PM
 */
@WebServlet(name = "httpServletRequestTest", value = "/http_test")
public class HttpServletRequestTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());        // 请求的资源路径
        System.out.println(req.getRequestURL());        // 请求的统一资源定位符（绝对路径）
        System.out.println(req.getRemoteHost());        // 客户端的 ip 地址
        System.out.println(req.getHeader("Connection"));        // 请求头
        System.out.println(req.getParameter("password"));
        System.out.println(Arrays.toString(req.getParameterValues("hobby")));
        System.out.println(req.getMethod());
        req.setAttribute("tt", "33");
        System.out.println(req.getAttribute("tt"));
//        System.out.println(req.getRequestDispatcher());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 防止中文乱码，要在 req.getParameter() 执行前调用，如果在执行后调用，
        // 后面再去调用 req.getParameter() 获取参数的时候，还是会乱码
        req.setCharacterEncoding("UTF-8");      
        
        System.out.println(req.getRequestURI());        // 请求的资源路径
        System.out.println(req.getRequestURL());        // 请求的统一资源定位符（绝对路径）
        System.out.println(req.getRemoteHost());        // 客户端的 ip 地址
        System.out.println(req.getHeader("Connection"));        // 请求头
        System.out.println(req.getParameter("password"));
        System.out.println(Arrays.toString(req.getParameterValues("hobby")));
        System.out.println(req.getMethod());
        req.setAttribute("tt", "33");
        System.out.println(req.getAttribute("tt"));
        
    }
}
