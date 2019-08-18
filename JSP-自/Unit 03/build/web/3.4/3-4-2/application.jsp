<%-- 
    Document   : application
    Created on : 2019-8-7, 15:16:00
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My JSP 'application.jsp' starting page</title>
    </head>
    <body>
        <h3>指定页的实际路径、相对路径和当前应用程序路径</h3>
        <hr/>
        <table border="1" bordercolor="black">
            <tr>
                <td>当前服务器的名称和版本</td>
                <td><%=application.getServerInfo()%></td>
            </tr>
            <tr>
                <td>页面applicatoin.jsp的实际路径</td>
                <td><%=application.getRealPath("3.4/3-4-2/application.jsp")%></td>
            </tr>
            <tr>
                <td>页面application.jsp的URL</td>
                <td><%=application.getResource("3.4/3-4-2/application.jsp")%></td>
            </tr>
            <tr>
                <td>当前Web程序的路径</td>
                <td><%=application.getContextPath()%></td>
            </tr>
        </table>
    </body>
</html>
