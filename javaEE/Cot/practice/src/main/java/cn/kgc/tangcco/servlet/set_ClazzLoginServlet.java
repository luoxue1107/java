package cn.kgc.tangcco.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/1 14:55
 */
public class set_ClazzLoginServlet extends HttpServlet {
    private static final long serialVersionUID = -474613266977269262L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("id",req.getParameter("id"));
        req.getRequestDispatcher("set_Clazz.jsp").forward(req, resp);
    }
}
