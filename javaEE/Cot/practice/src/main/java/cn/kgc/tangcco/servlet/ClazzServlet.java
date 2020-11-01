package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Page;
import cn.kgc.tangcco.service.ServiceClazzImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 15:29
 */
public class ClazzServlet extends HttpServlet {
    private static final long serialVersionUID = 990231626131019733L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceClazzImpl serviceClazz = new ServiceClazzImpl();
        Page pageClazz = null;
        String page = req.getParameter("page");
        if (page == null) {
            page = "1";
        }
        System.out.println("servlet层clazz");
        pageClazz = serviceClazz.getClazzList(Integer.valueOf(page), 5);
        pageClazz.getClazzList().forEach(clazz -> System.out.println(JSON.toJSONString(clazz)));

        req.setAttribute("pageClazz", pageClazz);
        req.getRequestDispatcher("clazzLogin.jsp").forward(req, resp);
    }
}
