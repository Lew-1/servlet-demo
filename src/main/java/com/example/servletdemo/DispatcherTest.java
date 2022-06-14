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
        // parameter 由前端传入，比如 ?xx=123 的形式
        System.out.println(request.getParameter("xx"));
        request.setAttribute("tt", "33");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/dispatcherTest2");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/hello.html");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
