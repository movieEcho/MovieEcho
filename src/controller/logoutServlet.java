package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class logoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        out.println("<script>");//输出script标签
        out.println("alert('推出成功');");//js语句：输出alert语句
        out.println("window.location.href='...';");//js语句：输出网页回退语句
        out.println("</script>");//输出script结尾标签
    }
}
