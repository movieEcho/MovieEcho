package controller;
import entity.user;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
public class enrollServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String password = req.getParameter("password");
        String confirm = req.getParameter("confirm");
        String username = req.getParameter("username");
        String gender = req.getParameter("sex");
        String uHobby = req.getParameter("hobby");
        if (password == null || confirm == null || username == null) {
            out.println("<script>");
            out.println("alert('Each space should be completed');");
            out.println("window.location.href='/MovieEcho/login.jsp';");
            out.println("</script>");
        } else {
            //user uN= UserService.findUserByUName(username);


            if (password.equals(confirm)) {
                user u = new user(username, password, gender, uHobby, true);
                UserService.createUser(u);
                user u_2 = UserService.findUserByUName(u.getuName());
                out.println("<script>");
                out.println("alert('enroll Successfully');");
                out.println("window.location.href='/MovieEcho/login.jsp';");
                out.println("</script>");
            } else {
                out.println("<script>");
                out.println("alert('input password not correct twice');");
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
