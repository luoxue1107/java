package cn.kgc.servlet;

import cn.kgc.pojo.Employee;
import cn.kgc.service.impl.ServiceEmpAndRolImpl;
import cn.kgc.service.impl.ServiceEmployeeImpl;
import cn.kgc.service.impl.ServiceRoleImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 16:57
 */
@WebServlet(urlPatterns = "/AddEmployee")
public class AddEmployee extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceEmployeeImpl serviceEmployee= new ServiceEmployeeImpl();
        Integer integer = serviceEmployee.addEmployee(new Employee(
                req.getParameter("name"),
                Integer.valueOf(req.getParameter("cid"))));
        String contextPath = req.getContextPath();
        if (integer>0){
            System.out.println("添加成功");
            resp.sendRedirect(contextPath+"/login.do");
        }else {
            System.out.println("添加失败");
            resp.sendRedirect(contextPath+"/login.do");
        }
    }
}
