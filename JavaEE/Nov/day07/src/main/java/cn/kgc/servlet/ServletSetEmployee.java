package cn.kgc.servlet;

import cn.kgc.pojo.Company;
import cn.kgc.pojo.Employee;
import cn.kgc.service.impl.ServiceCompanyImpl;
import cn.kgc.service.impl.ServiceEmployeeImpl;

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
 * @date 2020/11/8 21:58
 */
@WebServlet(urlPatterns = "/SetEmployee.do")
public class ServletSetEmployee extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = new ServiceEmployeeImpl().getEmployeeById(Integer.valueOf(req.getParameter("id")));
        List<Company> companyList = new ServiceCompanyImpl().getCompany();
        req.setAttribute("employee",employee);
        req.setAttribute("companyList",companyList);
        req.getRequestDispatcher("SetEmployee.jsp").forward(req, resp);
    }
}
