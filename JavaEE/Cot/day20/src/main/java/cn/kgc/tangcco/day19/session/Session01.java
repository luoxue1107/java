package cn.kgc.tangcco.day19.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 15:46
 */
@WebServlet(urlPatterns = "/session01")
public class Session01 extends HttpServlet {
    private static final long serialVersionUID = -8418460858707225876L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        out.println("session01"+req.getSession().getId());
        req.getSession().setAttribute("lo","lo");
        resp.sendRedirect(req.getContextPath()+"session02");

    }
}
