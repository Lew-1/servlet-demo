package com.example.servletdemo; 

/**
 * 请求转发测试
 * 
 * @author luzhonghe
 * @date 2022/6/13 10:14 AM
 */

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "dispatcherTest", value = "/dispatcherTest")
public class DispatcherTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tt", "33");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/hello-servlet");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
