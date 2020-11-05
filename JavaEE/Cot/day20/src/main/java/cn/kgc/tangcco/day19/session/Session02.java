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
@WebServlet(urlPatterns = "/session02")
public class Session02 extends HttpServlet {
    private static final long serialVersionUID = -6686241132961309851L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        out.println("session02"+req.getSession().getId());
        out.println(req.getAttribute("lo"));
        resp.sendRedirect(req.getContextPath() + "session03");

    }
}
