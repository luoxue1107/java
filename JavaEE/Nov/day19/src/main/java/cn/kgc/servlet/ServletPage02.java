package cn.kgc.servlet;


import cn.kgc.pojo.Department;
import cn.kgc.service.impl.DepartmentServiceImpl;
import cn.kgc.util.Character;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 17:32
 */
public class ServletPage02 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException, IOException {
        DepartmentServiceImpl department= new DepartmentServiceImpl();
        List<Department> departmentList = department.getDepartmentList();
        Character.characterEncoding(req,resp,"text/html");
        departmentList.forEach(d-> System.out.println(JSON.toJSONString(d)));
        req.setAttribute("departmentList",departmentList);
        req.getRequestDispatcher("page02.jsp").forward(req, resp);
    }
}
