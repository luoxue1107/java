package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Clazz;
import cn.kgc.tangcco.service.ServiceClazzImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/1 15:24
 */
public class set_ClazzServlet extends HttpServlet {
    private static final long serialVersionUID = -474613266977269262L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String path = req.getContextPath();
        if ( new ServiceClazzImpl().setOneClazz(new Clazz(Integer.valueOf(id),name)) > 0) {
            System.out.println("clazz修改成功");
        } else {
            resp.getWriter().println("修改失败");
            System.out.println("clazz修改失败");
        }
        resp.sendRedirect(path+"/clazzLogin");
    }
}
