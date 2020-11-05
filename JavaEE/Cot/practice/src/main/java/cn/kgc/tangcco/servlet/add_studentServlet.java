package cn.kgc.tangcco.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 14:35
 */
public class add_studentServlet extends HttpServlet {
    private static final long serialVersionUID = 7896577649884997361L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("add_Student.jsp").forward(req,resp);

    }
}
