package com.example.servletdemo.file;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author luzhonghe
 * @date 2022/6/14 5:22 PM
 */
@WebServlet(urlPatterns = "/upload")
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletInputStream inputStream = req.getInputStream();
//        byte[] data = new byte[1024000];
//        int read = inputStream.read(data, 0, data.length);
//        System.out.println(read);
//        System.out.println(new String(data, 0, read));
        byte[] bytes = readInputStream(inputStream);
        System.out.println(new String(bytes, 0, bytes.length));

        System.out.println("upload");
    }

    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }
}
