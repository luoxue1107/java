package cn.kgc.tangcco.day19.forward;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 11:56
 */
@WebServlet(urlPatterns = "/ForwardOuter01")
public class ForwardOuter01 extends HttpServlet {
    private static final long serialVersionUID = 960111556895087531L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("客户端ForwardOuter01");
        req.getRequestDispatcher("/login/Demo.html").forward(req, resp);
        resp.getWriter().println("ForwardOuter01访问成功");
        resp.getWriter().close();
    }
}
