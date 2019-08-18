<%-- 
    Document   : subPage
    Created on : 2019-7-31, 11:29:23
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String userName=request.getParameter("userName");
    String passwd=request.getParameter("passwd");
    String address=request.getParameter("address");
    System.out.println(address);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>子页面</title>
    </head>
    <body>
        <table align="center">
            <tr>
                <th>子页面：人员信息</th>
            </tr>
        </table>
        <table align="center">
            <tr>
                <td>用户名：<%=userName%></td>
            </tr>
            <tr>
                <td>密 码：<%=passwd%></td>
            </tr>
            <tr>
                <td>用户地址：<%=address%></td>
            </tr>
        </table>
    </body>
</html>
