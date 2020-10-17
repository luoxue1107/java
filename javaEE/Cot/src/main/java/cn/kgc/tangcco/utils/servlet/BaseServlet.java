package cn.kgc.tangcco.utils.servlet;


import cn.hutool.http.server.HttpServerResponse;
import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李昊哲
 * @Description
 * @create 2020/10/13 下午3:49
 */
public class BaseServlet extends HttpServlet {
    private static final long serialVersionUID = -1154008772874594781L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected long getLastModified(HttpServletRequest request) {
        return super.getLastModified(request);
    }

    @Override
    protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        excute(request,response);
    }

    /**
     * 执行真实方法
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    public void excute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
        // 处理中文乱码
        // 处理post请求的中文乱码
        request.setCharacterEncoding("utf-8");
        // 处理响应的字符集中文乱码
        response.setCharacterEncoding("utf-8");
        // 处理浏览器字符集中文乱码
        response.setContentType("text/html;charset=utf-8");
        System.out.println("请求方式:" + request.getMethod());



        String methodName = request.getParameter("methodName");
        Class<? extends BaseServlet> clazz = this.getClass();
        try {
            Method declaredMethod = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, request, response);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 向页面响应字符串
     * @param response  HttpServletResponse
     * @param Text  向页面响应的字符串
     * @throws IOException  IOException
     */
    public static void printText(HttpServletResponse response ,String Text) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print(Text);
        writer.flush();
        writer.close();
    }
    /**
     * 向页面响应json字符串
     * @param response  HttpServletResponse
     * @param object  向页面响应的对象
     * @throws IOException  IOException
     */
    public static void printJsonObject(HttpServletResponse response ,Object object) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print(JSON.toJSONString(object));
        writer.flush();
        writer.close();
    }
}
