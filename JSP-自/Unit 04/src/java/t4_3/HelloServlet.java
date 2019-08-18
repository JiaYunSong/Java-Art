/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author 黎夜之梦
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {
    
    private static final long serialVersionUID=20190807192350L;

    @Override
    public void init() throws ServletException {
        System.out.println("初始化 init 方法");
    }

    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
        System.out.println("调用 public service 方法");
        response.setContentType("text/html;charset=gbk");
        PrintWriter out=response.getWriter();
        out.println("收到 service 请求");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用 protected service 方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用 doGet() 方法");
        response.setContentType("text/html;charset=gbk");
        PrintWriter out=response.getWriter();
        out.println("收到 HelloServlet doGet() 请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用 doPost() 方法");
        response.setContentType("text/html;charset=gbk");
        PrintWriter out=response.getWriter();
        out.println("收到 HelloServlet doPost() 请求");
    }

    @Override
    public void destroy() {
        System.out.println("调用 destroy() 方法");
    }
    
}
