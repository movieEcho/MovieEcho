package controller;
import Dao.*;
import entity.user;
import entity.user;
import service.UserService;
import  java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String uId=req.getParameter("userId");
        String password=req.getParameter("password");
        if(uId!=null&&password!=null){
            user user=UserService.findUserByUName(uId);
            if(user!=null){
                if(user.getPassword().equals(password)){
                   session.setAttribute("user",user);
                   out.println("<script>");
                   out.println("alert('Welcome');");
                   out.println("window.location.href='...';");
                     out.println("</script>");
            }
            else {
                out.println("<script>");
                out.println("alert('密码错误');");
                out.println("window.location.href='...';");
                out.println("</script>");
            }}
            else{
                out.println("<script>");
                out.println("alert('user doesn't exit');");
                out.println("window.location.href='...';");
                out.println("</script>");
            }
        }
        else {
            if (uId==null){
                out.println("<script>");
                out.println("alert('userName can't be null');");
                out.println("window.location.href='/MovieEcho/login.jsp';");
                out.println("</script>");

            }
            else {
                out.println("<script>");
                out.println("alert('password can't be null');");
                out.println("window.location.href='/MovieEcho/login.jsp';");
                out.println("</script>");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
