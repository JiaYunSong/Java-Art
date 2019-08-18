<%-- 
    Document   : setContentType
    Created on : 2019-8-5, 14:34:13
    Author     : ????
--%>

<%
    response.setContentType("text/html;charset=UTF-8");
    String str=new String("??????".getBytes("ISO-8859-1"),"utf-8");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>setContentType</title>
    </head>
    <body>
        <p>????????</p>
        <br/>
        <%=str%>
    </body>
</html>
