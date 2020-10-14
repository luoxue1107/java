package cn.kgc.tangcco.utils.servlet;


import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李庆华
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
    public void excute(HttpServletRequest request, HttpServletResponse response) {
        String methodName = request.getParameter("methodName");
        Class<? extends BaseServlet> clazz = this.getClass();
        try {
            Method method = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.setAccessible(true);
            method.invoke(this,request,response);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public void printObject(HttpServletResponse response,Object obj) throws IOException {
        PrintWriter writer = response.getWriter();
        //把对象解析为字符串
        String string = JSON.toJSONString(obj);
        writer.println(string);
        writer.flush();
        writer.close();
    }
}
