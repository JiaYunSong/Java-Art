package Servlet;

//引入相关包
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//引入bean
import nqsdata.beans.*;

/**
 * 用于采集用户登入信息进行比对，跳转至指定页面
 * @author 贾云嵩
 */
@WebServlet(name = "Validate", urlPatterns = {"/Validate"})
public class Validate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String UserName=request.getParameter("UserName");
        String PassWord=request.getParameter("PassWord");
        
        //判断登入信息的准确性及用户类型
        Userbean ub=new Userbean();
        String mes=ub.login(UserName, PassWord);

        //登入信息有误时
        if(mes.equals("fail")){
            request.setAttribute("fail", mes);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        
        //数据库连接错误时
        else if(mes.equals("loss")){
            request.setAttribute("fail", mes);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        
        //登入用户为"admin" || "ordin"
        else{
            request.getSession().setAttribute("UserName", UserName);
            request.getSession().setAttribute("UserType", mes);
            response.sendRedirect("userpage.jsp");
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "登入验证";
    }

}
