package cn.kgc.tangcco.day16.contrtoller.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 12:08
 */
@WebServlet(urlPatterns = "/RequestLine.do")
public class RequestLine extends HttpServlet {
    private static final long serialVersionUID = -4703872105570773976L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(
//                请求方式
                "请求类型:\t" + request.getMethod() + "\n" +
                        "请求url:\t" + request.getRequestURL() + "\n" +
                        "请求uri:\t" + request.getRequestURI() + "\n" +
                        "获取使用协议:\t" + request.getProtocol() + "\n" +
                        "获取协议名称:\t" + request.getScheme() + "\n" +
                        "请求的上下文路径：\t" + request.getContextPath() + "\n" +
                        "请求的查询字符串：" + request.getQueryString());
        parsQueryString(request.getQueryString()).forEach( (k,v) -> System.out.println(k+"="+v));

    }
    public Map<String, String>  parsQueryString(String queryString){
        Map<String, String>  map= new HashMap<>();
        String[] splits = queryString.split("&");
        for (String split:splits) {
            String[] strip = split.split("=");
            map.put(strip[0],strip[1]);
        }
        return map;
    }

}
