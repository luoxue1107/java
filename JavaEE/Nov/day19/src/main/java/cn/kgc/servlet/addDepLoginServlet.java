package cn.kgc.servlet;

import cn.kgc.util.Character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 15:58
 */
@WebServlet(urlPatterns = "/addDepLogin")
public class addDepLoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        req.getRequestDispatcher("page03.jsp").forward(req, resp);
    }
}
