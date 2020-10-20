package cn.kgc.tangcco.day19.forward;

import cn.kgc.tangcco.utils.CharacterEncoding;

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
@WebServlet(urlPatterns = "/Forward03")
public class Forward03 extends HttpServlet {
    private static final long serialVersionUID = -3422646991383007669L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CharacterEncoding.CharacterEncoding(req,resp);
        out.println("Forward03");
        Object slogan = req.getAttribute("slogan");
        out.println(slogan);
        resp.getWriter().println("访问Forward03成功");
        resp.getWriter().close();

    }
}
