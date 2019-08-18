<%-- 
    Document   : title
    Created on : 2019-8-11, 21:00:31
    Author     : 贾云嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<link rel="stylesheet" type="text/css" media="screen" href="../css/title.css" />-->

<header>
    <div>
        欢迎您，<%=session.getAttribute("UserName")%>！
    </div>
    <div>
        <form action="logout" method="post">
            <input type="submit" value="退出登录"/>
        </form>
    </div>
</header>

<section>

</section>