package cn.kgc.tangcco.day19.forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 9:17
 */
@WebServlet(urlPatterns = "/Forward02")
public class Forward02 extends HttpServlet {

    private static final long serialVersionUID = 4950362870630418397L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out.println("Forward02");
        Object slogan = req.getAttribute("slogan");
        out.println(slogan);
        req.getRequestDispatcher("/Forward03").forward(req, resp);
    }
}
