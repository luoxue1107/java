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

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 15:53
 */
@WebServlet(urlPatterns = "/addDep")
public class AddDepServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        String depName = req.getParameter("depName");
        Department department = new Department();
        if (depName != null) {
            department.setName(depName);
        }
        DepartmentServiceImpl departmentServiceImpl = new DepartmentServiceImpl();
        Integer integer = departmentServiceImpl.addDepartment(department);
        if (integer < 0) {
            System.out.println("失败");
        } else {
            System.out.println("成功");
        }
        resp.sendRedirect(req.getContextPath()+"/addDepLogin");
    }
}
