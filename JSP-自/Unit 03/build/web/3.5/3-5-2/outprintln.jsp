<%-- 
    Document   : outprintln
    Created on : 2019-8-7, 15:56:16
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>演示out对象</title>
    </head>
    <body>
        <div style="text-align: center;">
            <hr>
            <h4>以下就是一个表格</h4>
            <%
                out.println("<table border='2' align='center'>");
                out.println("<tr>");
                out.println("<td width='60'>"+"姓名"+"</td>");
                out.println("<td width='40'>"+"性别"+"</td>");
                out.println("<td width='80'>"+"出生年月"+"</td>");
                out.println("<td width='60'>"+"城市"+"</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width='60'>"+"Smith"+"</td>");
                out.println("<td width='60'>"+"Male"+"</td>");
                out.println("<td width='60'>"+"1984.8"+"</td>");
                out.println("<td width='60'>"+"NewYork"+"</td>");
                out.println("</tr>");
                out.println("</table>");
            %>
        </div>
    </body>
</html>
