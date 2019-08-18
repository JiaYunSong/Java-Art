<%-- 
    Document   : ex3_4
    Created on : 2019-8-6, 16:46:38
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My JSP 'ex3_4.jsp' starting page</title>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
    </head>
    <body>
    <%
        String sessionID=session.getId();
        session.setAttribute("author", "LYZM");
        String author=(String)session.getAttribute("author");
        long time=session.getCreationTime();
        Date date=new Date(time);
    %>
    <div style="text-align: center;">
        <p>您访问的是ex3_4.jsp页面<br/>
            <%=author%>,您的session对象的ID为：<br/>
            <%=sessionID%><br/>
            session对象创建时间：<%=date%>
            <br/>
        </p>
        <form action="../../../Unit_03/3.3/3-3-1/ex3_2.jsp" method="post">
            <input type="submit" value="转向ex3_2.jsp"/>
        </form>
    </div>
    </body>
</html>
