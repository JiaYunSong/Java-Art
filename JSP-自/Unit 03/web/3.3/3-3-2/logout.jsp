<%-- 
    Document   : logout
    Created on : 2019-8-7, 15:08:21
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String username=(String) session.getAttribute("username");
    session.removeAttribute(username);
    session.invalidate();
    response.sendRedirect("login.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Logout Page</title>
    </head>
    <body>
    </body>
</html>
