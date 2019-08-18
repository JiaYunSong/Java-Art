<%-- 
    Document   : page
    Created on : 2019-8-7, 16:45:24
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>演示page对象</title>
    </head>
    <body>
        <%
            int code=page.hashCode();
            String str=page.toString();
            out.println("page对象的hash码："+code+"<p/>");
            out.println("page对象的值："+str);
        %>
    </body>
</html>
