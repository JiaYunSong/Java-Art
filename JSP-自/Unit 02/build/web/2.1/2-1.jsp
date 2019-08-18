<%-- 
    Document   : 2-1
    Created on : 2019-7-28, 23:26:45
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 注释例子</title>
    </head>
    <body>
        <!-- 该注释可以在浏览器文件中看到 -->
        <br/>
        <br/>
        <table align="center">
            <tr>
                <th>
                    <b>JSP注释</b>
                </th>
            </tr>
        </table>
        <br/>
        <table>
        <table align="right">
            <tr>
                <th>
                    <b>JSP 注释</b>
                </th>
            </tr>
        </table>
        <%-- 该注释无法在浏览器中看到 --%>
        <%
            //这是脚本中的JAVA注释
            /*
                这也是脚本中的JAVA注释
            */
        %>
    </body>
</html>
