<%-- 
    Document   : outclear
    Created on : 2019-8-7, 16:34:26
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Clear Page</title>
    </head>
    <body>
        <h1>HTML 的内容</h1>
        <%
            out.println("<h4>这是out的内容</h4>");
            out.clear();
            out.println("<p>蹭一下</p>");
        %>
        <h1>HTML 的内容二号</h1>
    </body>
</html>
