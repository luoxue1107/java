package cn.kgc.tangcco.error;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description 异常处理
 * @date 2020/11/4 19:08
 */
public class errorHandler extends HttpServlet {
    private static final long serialVersionUID = 2601965720621469584L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取当前状态码
        Integer statusCode = (Integer)req.getAttribute("javax.servlet.error.status_code");
        System.out.println("状态码"+statusCode);
        //异常类型
        Object expectedType =req.getAttribute("javax.servlet.error.exception_type");
        System.out.println("类型"+JSON.toJSONString(expectedType));
        //错误信息
        String message = (String)req.getAttribute("javax.servlet.error.message");
        System.out.println("信息"+message);
        //Url
        String requestUrl = (String)req.getAttribute("javax.servlet.error.request_uri");
        if (requestUrl == null){
            requestUrl="空的";
        }
        System.out.println("url"+requestUrl);
        //异常的产生信息
        Throwable exception = (Throwable)req.getAttribute("javax.servlet.error.exception");
        System.out.println("产生信息"+JSON.toJSONString(exception));
        //Servlet的名字
        String servletName = (String)req.getAttribute("javax.servlet.error.servlet_name");
        if (servletName==null){
            servletName="空的";
        }
        System.out.println("Servlet的名字"+servletName);
        req.setAttribute("statusCode",statusCode);
        req.setAttribute("expectedType",expectedType);
        req.setAttribute("message",message);
        req.setAttribute("requestUrl",requestUrl);

        req.getRequestDispatcher("ErrorHandler.html").forward(req,resp);
    }













}
