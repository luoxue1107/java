package cn.kgc.servlet;

import cn.kgc.pojo.Department;
import cn.kgc.service.impl.DepartmentServiceImpl;
import cn.kgc.util.Character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 23:13
 */
@WebServlet(urlPatterns = "/addDocLogin")
public class addDocLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        DepartmentServiceImpl department = new DepartmentServiceImpl();
        List<Department> departments = department.getDepartmentList();
        req.setAttribute("departments",departments);
        req.getRequestDispatcher("page04.jsp").forward(req, resp);
    }
}
