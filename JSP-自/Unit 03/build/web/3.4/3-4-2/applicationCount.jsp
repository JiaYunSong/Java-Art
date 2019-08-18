<%-- 
    Document   : applicationCount
    Created on : 2019-8-7, 15:30:09
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    Integer count=(Integer)application.getAttribute("count");
    if(count==null)
        count=1;
    else
        count++;
    application.setAttribute("count", count);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>网站计数器</title>
    </head>
    <body>
        欢迎访问本网站，您是第<%=count%>位访问客户！
    </body>
</html>
