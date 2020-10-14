package cn.kgc.tangcco.day14.http;

import cn.kgc.tangcco.utils.servlet.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 15:36
 */
@WebServlet(urlPatterns = "/response")
public class ResponseTest extends BaseServlet {
    public void test01(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        规定请求信息的字符集
        response.setCharacterEncoding("UTF-8");
//        规定响应信息的字符集
        request.setCharacterEncoding("UTF-8");
//        规定页面文本字符集
        response.setContentType("text/html;charset=UTF-8");

        //        服务器端响应客户端
        PrintWriter writer = response.getWriter();
        writer.println("OK!!!!!");
        writer.flush();
        writer.close();


    }
    public void print(){



    }

}
