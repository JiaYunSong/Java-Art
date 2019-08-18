<%-- 
    Document   : 2-5-2
    Created on : 2019-7-31, 11:16:55
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String url="";
    int random=(int)(Math.random()*10);
    int m=random%2;
    switch(m){
        case 0:
            url="even.jsp";
            break;
        case 1:
            url="odd.jsp";
            break;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Odd And Even Page</title>
    </head>
    <body>
        <h1>跳转界面</h1>
        <jsp:forward page="<%=url%>"/>
    </body>
</html>
