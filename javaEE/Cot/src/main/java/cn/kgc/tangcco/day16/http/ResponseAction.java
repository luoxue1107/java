package cn.kgc.tangcco.day16.http;

import cn.kgc.tangcco.utils.servlet.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/16 15:01
 */
@WebServlet(urlPatterns = "/ResponseAction.do")
public class ResponseAction  extends BaseServlet {
    private static final long serialVersionUID = -1327762062859758939L;
    public void responseDemo01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("我是响应!!!");
        writer.flush();
        writer.close();
    }




}
