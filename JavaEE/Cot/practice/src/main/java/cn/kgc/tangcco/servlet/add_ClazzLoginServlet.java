package cn.kgc.tangcco.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 17:25
 */
public class add_ClazzLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 238922790748108694L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        req.getRequestDispatcher("add_Clazz.jsp").forward(req,resp);
    }
}
