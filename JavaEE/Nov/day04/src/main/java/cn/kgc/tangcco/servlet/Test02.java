package cn.kgc.tangcco.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/6 8:56
 */
@WebServlet(urlPatterns = "/Test02")
public class Test02 extends HttpServlet {

    private static final long serialVersionUID = 2891399516235427667L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        //设置状态码
        resp.setStatus(resp.SC_MOVED_TEMPORARILY);
//        resp.setHeader("Location",contextPath+"/Test.html");
        resp.sendRedirect(contextPath+"/Test.html");

    }
}
