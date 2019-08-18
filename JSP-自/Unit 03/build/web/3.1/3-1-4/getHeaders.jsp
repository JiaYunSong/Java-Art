<%-- 
    Document   : getHeaders
    Created on : 2019-8-4, 23:43:21
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>'getHeaders.jsp'</title>
    </head>
    <body>
        <%
            Enumeration<String> enumeration=request.getHeaderNames();
            while(enumeration.hasMoreElements()){
                String name=enumeration.nextElement();
                String value=request.getHeader(name);
                if(value==null||"".equals(value)){
                    value="空字符串";
                }
        %>
        <p>表头名称:<%=name%>&nbsp;&nbsp;对应的值:<%=value%></p>
        <%
            }
        %>
        <p>
            本地机器IP：<%=request.getLocalAddr()%><br/>
            本地机器名称：<%=request.getLocalName()%><br/>
            本地机器端口：<%=request.getLocalPort()%><br/>
        </p>
        <p>
            客户主机IP：<%=request.getRemoteAddr()%><br/>
            客户主机名称：<%=request.getRemoteHost()%><br/>
            客户主机端口：<%=request.getRemotePort()%><br/>
        </p>
        <p>
            服务器IP：<%=request.getServerName()%><br/>
            服务器端口：<%=request.getServerPort()%><br/>
        </p>
    </body>
</html>
