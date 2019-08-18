<%-- 
    Document   : newjsp
    Created on : 2019-7-23, 15:57:25
    Author     : 黎夜之梦
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String num1,num2,num3;
    num1=request.getParameter("num1");
    num2=request.getParameter("num2");
    num3=request.getParameter("num3");
    double ave,sum,n1,n2,n3;
    n1=Double.parseDouble(num1);
    n2=Double.parseDouble(num2);
    n3=Double.parseDouble(num3);
    sum=n1+n2+n3;
    ave=sum/3.0;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>数字运算</title>
    </head>
    <body>
    <center>
        <h2>运算结果</h2>
        <hr style="width: 400px;color: #ccccff">
        SUM is <%=sum%>.<br>
        AVE is <%=ave%>.<br>
    </center>
    </body>
</html>
