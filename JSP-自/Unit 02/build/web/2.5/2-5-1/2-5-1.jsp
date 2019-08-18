<%-- 
    Document   : 2-5-1
    Created on : 2019-7-30, 11:18:19
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>新闻摘要</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <br/>
        <table align="center">
            <tr>
                <th>中华新闻网</th>
            </tr>
        </table>
        <br/>
        <p>
            最新新闻摘要
            <ul>
                <li><jsp:include page="news1.html"/></li>
                <li><jsp:include page="news2.html"/></li>
                <li><jsp:include page="news3.html"/></li>
            </ul>
    </body>
</html>
