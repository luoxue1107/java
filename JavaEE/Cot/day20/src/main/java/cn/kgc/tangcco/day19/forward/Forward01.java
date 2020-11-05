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
@WebServlet(urlPatterns = "/Forward01")
public class Forward01 extends HttpServlet {
    private static final long serialVersionUID = 2522966787235878434L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out.println("Forward01");
        req.setAttribute("slogan","落雪无痕");
        req.getRequestDispatcher("/Forward02").forward(req, resp);
    }
}
