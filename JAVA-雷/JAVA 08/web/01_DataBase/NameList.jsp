<%-- 
    Document   : NameList
    Created on : 2019-7-24, 9:12:24
    Author     : 黎夜之梦
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NameList</title>
    </head>
    <body>
        <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception e){
                
            }
            Connection con1;
            String url1;
            try{
                url1="jdbc:mysql://10.3.42.222:3306/mysql?user=root&password=root";
                con1=DriverManager.getConnection(url1);
                con1.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        %>
        <%
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            }catch(Exception e){
                
            }
            Connection con2;
            String url2;
            try{
                url2="jdbc:ucanaccess://data/";
                con2=DriverManager.getConnection(url2);
                con2.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        %>
    </body>
</html>
