package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/5 15:14
 */
@WebServlet(urlPatterns = {"/cat.do", "/Test",})
public class Test extends HttpServlet {

    private static final long serialVersionUID = -5303692762087945471L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        Cookie cookie = new Cookie("id", "password");
        cookie.setDomain("");
        cookie.setComment("idAndPassword");
        cookie.setMaxAge(60);
        cookie.setValue("newValue");

        resp.addCookie(cookie);

        PrintWriter out = resp.getWriter();
        String title = "设置 Cookie 实例";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名：</b>："
                + req.getParameter("name") + "\n</li>" +
                "  <li><b>站点 URL：</b>："
                + req.getParameter("url") + "\n</li>" +
                "</ul>\n" +
                "</body></html>");
    }
}
