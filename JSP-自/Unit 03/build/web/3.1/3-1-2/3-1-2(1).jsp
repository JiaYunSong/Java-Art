<%-- 
    Document   : 3-1-2
    Created on : 2019-7-31, 11:55:56
    Author     : 黎夜之梦

    网页输入：
    http://localhost:8084/Unit_03/3.1/3-1-2/3-1-2(1).jsp?name=RSMX&city=Beijing
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); //防止中文乱码%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>'getParameter.jsp'</title>
    </head>
    <body style="text-align:center;">
        <%
            String name=request.getParameter("name");
            String city=request.getParameter("city");
            if(name!=null&&city!=null)
            {           %>
                <p>Welcome <%=name%>,您所在的城市是<%=city%>。</p>
        <%  }else{      %>
                <p>欢迎访问本页面！</p>
        <%  }           %>
    </body>
</html>
