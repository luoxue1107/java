package cn.kgc.servlet;

import cn.kgc.pojo.Employee;
import cn.kgc.service.ServiceRole;
import cn.kgc.service.impl.ServiceCompanyImpl;
import cn.kgc.service.impl.ServiceEmployeeImpl;
import cn.kgc.service.impl.ServiceRoleImpl;

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
 * @date 2020/11/8 13:45
 */
@WebServlet(urlPatterns = "/login.do")
public class ServletLogin  extends HttpServlet {
    private static final long serialVersionUID = -2428488922049007911L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceEmployeeImpl serviceEmployee= new ServiceEmployeeImpl();

        List<Employee> employeeList = serviceEmployee.getEmployee();
        req.setAttribute("employeeList",employeeList);
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }
}
