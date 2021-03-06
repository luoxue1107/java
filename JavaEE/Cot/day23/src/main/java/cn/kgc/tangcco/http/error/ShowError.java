package cn.kgc.tangcco.http.error;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/23 19:47
 */
@WebServlet(urlPatterns = "/error.do")
public class ShowError  extends HttpServlet {
    // 处理 GET 方法请求的方法
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置错误代码和原因
        response.sendError(404, "Need authentication!!!" );
    }
    // 处理 POST 方法请求的方法
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
