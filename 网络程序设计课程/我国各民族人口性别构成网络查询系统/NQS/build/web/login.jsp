<%-- 
    Document   : login
    Created on : 2019-8-10, 0:43:37
    Author     : 贾云嵩
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>我国各民族人口性别构成网络查询系统</title>
        <meta name="description" content="登录页">
        <link rel="stylesheet" type="text/css" media="screen" href="css/login.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/foot.css" />
    </head>
    <body>
    <header>
        <div>
            <div id="title">
                我国各民族人口性别构成<br/>网络查询系统
            </div>
            <div id="titlebottom">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                本平台实现我国各民族人口性别构成有关信息的实时网络共享，同时提供更便捷的数据查询、修改与保护机制。
                可供政府机构、数据分析机构及社会调查团体实时提供有关我国各民族人口性别构成的有效信息，可以给特定人员以修改权限来进行数据维护与更新。
                <br/><br/><br/>
            </div>
            <div id="login">
                <div>登录以进入查询</div>
                <br/>
                <div>
                    <form action="../NQS/Validate" method="post">
                        <input type="text" name="UserName" placeholder="请输入用户名">
                        <input type="password" name="PassWord" placeholder="请输入密码">
                        <input type="submit" value="登录">
                    </form>
                    <%if(request.getAttribute("fail")!=null){
                        String fail=(String) request.getAttribute("fail");
                        request.removeAttribute("fail");
                        if("fail".equals(fail)){%>
                        <font color="#ff6666" face="黑体" size="5">
                            用户名或密码错误，请重新输入！
                        </font>
                        <%}else if("loss".equals(fail)){%>
                        <font color="#ff6666" face="黑体" size="5">
                            数据库连接错误，请检查数据库配置！
                        </font>
                        <%}
                    }%>
                </div>
            </div>
        </div>
    </header>
    <jsp:include page="adandor/foot.jsp"/>
    </body>
</html>
