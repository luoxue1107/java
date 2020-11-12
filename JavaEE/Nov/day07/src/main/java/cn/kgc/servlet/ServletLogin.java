package cn.kgc.servlet;

import cn.kgc.pojo.Employee;

import cn.kgc.pojo.Page;
import cn.kgc.service.impl.ServiceEmployeeImpl;
import cn.kgc.service.impl.ServicePageImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

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
        List<Employee> employeeList = new ServiceEmployeeImpl().getEmployee();
        String page = null;
        page = req.getParameter("page");
        if (page == null) {
            page="1";
            System.out.println("page空");
        }
        Page pages = new ServicePageImpl().getPage(Integer.valueOf(page), 3);
        req.setAttribute("pages",pages);
        req.setAttribute("employeeList",pages.getEmployeeList());
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

}
