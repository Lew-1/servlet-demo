<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %>
    </h1>
    <br/>
    <a href="hello-servlet">Hello Servlet</a>
    <form action="http://localhost:8080/servlet_demo/hello" method="post">
        <input type="submit">
    </form>
    <br/>
    
</body>
</html>