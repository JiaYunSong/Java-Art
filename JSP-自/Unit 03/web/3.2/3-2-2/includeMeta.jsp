<%-- 
    Document   : includeMeta
    Created on : 2019-8-5, 15:06:40
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>includeMeta</title>
    </head>
    <body>
        <jsp:include page="/3.2/3-2-2/setMeta.jsp" flush="false"/>
        <%
            response.setHeader("refresh", "1");
        %>
    </body>
</html>
