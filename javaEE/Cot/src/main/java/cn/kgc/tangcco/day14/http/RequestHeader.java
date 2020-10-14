package cn.kgc.tangcco.day14.http;

import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 14:09
 */
@WebServlet(urlPatterns = "/header")
public class RequestHeader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Header 里的指定值
        System.out.println(req.getHeader("User-Agent"));
        String header = req.getHeader("User-Agent");
        UserAgent parse = UserAgentUtil.parse(header);
        System.out.println(parse.toString());
        System.out.println("浏览器"+parse.getBrowser().toString());
        System.out.println("浏览器引擎"+parse.getEngine().toString());
        System.out.println("引擎版本"+parse.getEngineVersion());
        System.out.println("操作系统"+parse.getOs().toString());
        System.out.println("操作平台"+parse.getPlatform().toString());
        System.out.println("类"+parse.getClass());
      //判断方式的客户端是否是移动端
        if (parse.isMobile()){
            System.out.println("移动端");
            }else{
            System.out.println("pc端");
        }
        System.out.println("==========================");
//        获取header里的所有值的名字
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s);

        }
        //获取header 所有值
        System.out.println("+++++++++++++++++++++");
        Enumeration<String> headers = req.getHeaders("User-Agent");
        while (headers.hasMoreElements()){
            System.out.println(headers.nextElement());
        }


    }

}
