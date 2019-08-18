<%-- 
    Document   : class
    Created on : 2019-8-7, 12:49:29
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String name=(String)session.getAttribute("username");
    if(name==null)
        response.sendRedirect("login.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>My JSP 'score.jsp' starting page</title>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
        <meta http-equiv="keywords" content="keywordx">
        <meta http-equiv="description" content="This is my page">
    </head>
    <body>
        <div style="text-align: center;">
            <span style="font-size: 24px;">班级管理</span>
            <hr/>
            <h3>学生：<%=name%></h3>
            <table>
                <tr>
                    <td>
                        <a href="addClass.jsp">班级录入</a>
                    </td>
                    <td>
                        <a href="modifyClass.jsp">班级修改</a>
                    </td>
                    <td>
                        <a href="queryClass.jsp">班级查询</a>
                    </td>
                    <td>
                        <a href="delClass.jsp">班级删除</a>
                    </td>
                </tr>
            </table>
            <a href="logout.jsp">退出登录</a>
        </div>
    </body>
</html>
