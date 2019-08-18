<%-- 
    Document   : 3-1-2
    Created on : 2019-7-31, 12:17:02
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>'ex3_1.jsp'</title>
    </head>
    <body>
        <form action="./3.1/3-1-2/3-1-2(1).jsp" method="post">
            <table align="center">
                <tr>
                    <td>姓名</td>
                    <td><input type="text" name="name" value=""/></td>
                </tr>
                <tr>
                    <td>城市</td>
                    <td><input type="text" name="city" value=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交"/></td>
                    <td><input type="reset" value="重置"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
