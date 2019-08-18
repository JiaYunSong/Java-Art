<%-- 
    Document   : validate
    Created on : 2019-8-7, 12:16:30
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
        <meta http-equiv="keywords" content="1,2,3">
        <meta http-equiv="description" content="This is my page">
        <title>success</title>
    </head>
    <%!
        //声明一个用户集合，模拟从数据库中取出用户集
        Map<String,String> map=new HashMap<String,String>();
        //声明验证的标识
        boolean flag=false;
    %>
    <%
        map.put("RSMX", "123456");
        map.put("LYZM", "666666");
    %>
    <%!
        //声明验证方法
        boolean validate(String username,String password){
            String passwd=map.get(username);
            if(passwd!=null && passwd.equals(password))
                return true;
            else
                return false;
        }
    %>
    <%
        //获取页面提交的用户名与密码
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username==null || username=="" || password==null || password=="")
            response.sendRedirect("login.jsp");
        flag=validate(username,password);
        if(flag){
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            response.sendRedirect("class.jsp");
        }
    %>
    <body>
        <div style="text-align: center;">
            <span style="font-size: 26px;">用户登录</span>
            <hr/>
            <%if(!flag){%>
                <form action="login.jsp" method="post">
                    用户名或者密码错误<p/>
                    <input type="submit" value="重新登录系统"/>
                </form>
            <%}%>
        </div>
    </body>
</html>
