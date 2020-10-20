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
 * @date 2020/10/19 11:56
 */
@WebServlet(urlPatterns = "/ForwardOuter")
public class ForwardOuter extends HttpServlet {
    private static final long serialVersionUID = 960111556895087531L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out.println("客户端ForwardOuter");
        req.getRequestDispatcher("https://www.baidu.com/").forward(req, resp);
        resp.getWriter().println("ForwardOuter访问成功");
    }
}
