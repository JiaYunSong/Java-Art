<%-- 
    Document   : setMeta
    Created on : 2019-8-5, 14:53:30
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>setMeta</title>
    </head>
    <body>
        <div class="aa" style="text-align: center;">
            <p class="bb">
                现在的时间为:<br/>
                <%
                    out.print(""+new Date());
                    response.setHeader("refresh", "1");
                    response.setHeader("description","实时显示当前时间");
                    response.setHeader("keywords", "实时，显示，显示当前时间");
                    response.setHeader("cache-control", "no-cache");
                %>
                <br/>
                copyright.RSMX.2019-08-05
            </p>
        </div>
    </body>
</html>
