package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author luzhonghe
 * @date 2022/6/14 10:09 AM
 */
@WebServlet(name = "dispatcherTest2", value = "/dispatcherTest2")
public class DispatcherTest2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("xx"));
        System.out.println(req.getAttribute("tt"));
        
    }
}
