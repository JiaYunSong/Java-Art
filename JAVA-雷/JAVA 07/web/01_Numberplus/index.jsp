<%-- 
    Document   : index
    Created on : 2019-7-23, 14:15:05
    Author     : 黎夜之梦
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>表单使用</title>
    </head>
    <body>
    <center>
        <h2>数学运算</h2>
        <hr style="width: 400px;color: #ccccff">
        <form action="Number.jsp" method="get" name="forml">
            数字1=
            <input type="text" name="num1" value="0"><br>
            数字2=
            <input type="text" name="num2" value="0"><br>
            数字3=
            <input type="text" name="num3" value="0"><br><br>
            <input type="submit" name="ok" value="计算">
            <input type="reset" name="reset" value="清除">
        </form>
    </center>
    </body>
</html>
