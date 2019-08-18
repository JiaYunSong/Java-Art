<%-- 
    Document   : 2-2
    Created on : 2019-7-28, 23:48:02
    Author     : 黎夜之梦
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 声明例子</title>
    </head>
    <%!
        int x,y=60,z;
        String name="RSMX";
        Date date=new Date();
    %>
    <%!
        int add(int m,int n){
            int result=0;
            result=m+n;
            return result;
        }
    %>
    <%!
        int chengji(int m,int n){
            int result=0;
            result=m*n;
            return result;
        }
    %>
    <%!
        class Circle{
            double r;
            Circle(double r){
                super();
                this.r=r;
            }
            double area(){
                return Math.floor(Math.PI*r*r);
            }
        }
    %>
    <body>
        <%
            out.println("我的名字："+name);
            out.println("<br/><br/>");
            out.println("x的值为："+x);
            out.println("<br/><br/>");
            out.println("y的值为："+y);
            out.println("<br/><br/>");
            out.println("z的值为："+z);
            out.println("<br/><br/>");
            out.println("现在的时间为："+date);
            out.println("<br/><br/>");
            out.println("10与20的和为："+add(10,20));
            out.println("<br/><br/>");
            out.println("10与20的积为："+chengji(10,20));
            out.println("<br/><br/>");
        %>
        <br/>
        <br/>
        <%
            Circle c=new Circle(6);
            out.println("半径为6的圆的面积为："+c.area());
        %>
    </body>
</html>
