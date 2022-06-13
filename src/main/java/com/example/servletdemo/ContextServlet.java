package com.example.servletdemo; /**
 * @author luzhonghe
 * @date 2022/6/13 10:13 AM
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String namespace = servletContext.getInitParameter("namespace");
        System.out.println(namespace);
        System.out.println("当前工程路径：" + servletContext.getContextPath());
        // 斜杠被服务器解析地址为 http://ip:port/工程名/
        System.out.println("当前工程绝对路径：" + servletContext.getRealPath("/"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
