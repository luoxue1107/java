package cn.kgc.tangcco.day19.lifecycle;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 17:17
 */
@WebServlet(urlPatterns = "/lifeCycle01")
public class LifeCycle01 extends HttpServlet {
    private static final long serialVersionUID = 1407074383786202762L;

    @Override
    public void init() throws ServletException {
        System.out.println("servlet初始化");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("执行servive");

    }

    @Override
    public void destroy() {
        System.out.println("结束服务器servlet销毁");

    }
}
