package cn.kgc.servlet;

import cn.kgc.service.impl.ServiceEmployeeImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 23:31
 */
@WebServlet(urlPatterns = "/deleteEmployee")
public class deleteEmployee extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer integer = new ServiceEmployeeImpl().deleteEmployee(Integer.valueOf(id));
        if (integer>0) {
            System.out.println("删除成功");
            resp.sendRedirect(req.getContextPath()+"/login.do");
        }
            System.out.println("删除失败");
            resp.sendRedirect(req.getContextPath()+"/login.do");

    }
}
