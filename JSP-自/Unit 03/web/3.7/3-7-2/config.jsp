<%-- 
    Document   : config
    Created on : 2019-8-7, 17:07:51
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>演示config对象</title>
    </head>
    <body>
        <%
            String url=config.getInitParameter("url");
            String str=config.toString();
            out.println("config对象的initParameter方法："+url+"</br>");
            out.println("config对象的toString方法："+str);
        %>
    </body>
</html>
