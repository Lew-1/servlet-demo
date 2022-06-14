package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author luzhonghe
 * @date 2022/6/14 3:04 PM
 */
@WebServlet(name = "responseTest", value = "/responseTest")
public class ResponseTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
//        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("Content-Type", "text/html; charset=UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("小老弟");
    }
}
