package cn.kgc.servlet;

import cn.kgc.pojo.Department;
import cn.kgc.service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/24 9:38
 */
@WebServlet(urlPatterns = "/setDepLogin")
public class setDepLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid = req.getParameter("uid");
        DepartmentServiceImpl departmentServiceImpl = new DepartmentServiceImpl();
        if (uid != null) {
            Department department = departmentServiceImpl.getDepartmentById(Integer.valueOf(uid));
            req.setAttribute("department", department);
        }
        req.getRequestDispatcher("page05.jsp").forward(req, resp);

    }
}
