<%-- 
    Document   : 2-4-2
    Created on : 2019-7-29, 14:24:45
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP include 指令演示</title>
    </head>
    <body>
        <%@include file="John.html"%>
        <br/>
        <div align="center">JSP include 指令演示</div>
        <%@include file="copyRight.jsp" %>
    </body>
</html>
