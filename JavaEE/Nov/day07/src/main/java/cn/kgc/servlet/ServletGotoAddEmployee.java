package cn.kgc.servlet;

import cn.kgc.pojo.Company;
import cn.kgc.pojo.Role;
import cn.kgc.service.impl.ServiceCompanyImpl;
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
 * @date 2020/11/8 16:18
 */
@WebServlet(urlPatterns = "/AddEmployee.do")
public class ServletGotoAddEmployee extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceRoleImpl role= new ServiceRoleImpl();
        ServiceCompanyImpl company=new ServiceCompanyImpl();
        List<Role> roleList = role.getRole();
        List<Company> companyList = company.getCompany();
        req.setAttribute("roleList",roleList);
        req.setAttribute("companyList",companyList);
        req.getRequestDispatcher("AddEmployee.jsp").forward(req, resp);
    }
}
