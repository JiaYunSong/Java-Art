<%-- 
    Document   : copyRight
    Created on : 2019-7-29, 14:32:29
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="UTF-8" %>
<%
    Date d=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
    String t=sdf.format(d);
    String copyRightsMess="RSMX 版权所有 2010-"+t;
%>
<br/>
<div align="center"><%=copyRightsMess%></div>