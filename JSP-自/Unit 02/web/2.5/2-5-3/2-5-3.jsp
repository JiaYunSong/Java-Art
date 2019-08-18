<%-- 
    Document   : 2-5-3
    Created on : 2019-7-31, 11:29:37
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
    <head>
        <title>主页面</title>
    </head>
    <body>
        <table align="center">
            <tr>
                <th>主页面</th>
            </tr>
        </table>
        
        <%-- 可以替换成include，参数传递效果相同 --%>
        <jsp:forward page="subPage.jsp">
            <jsp:param value="RSMX" name="userName"/>
            <jsp:param value="12345" name="passwd"/>
            <jsp:param value="北京海淀" name="address"/>
        </jsp:forward>
    </body>
</html>
