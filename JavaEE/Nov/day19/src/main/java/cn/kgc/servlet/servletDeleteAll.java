package cn.kgc.servlet;

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
 * @date 2020/11/23 11:31
 */
@WebServlet(urlPatterns = "/deleteAll")
public class servletDeleteAll  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ins = req.getParameterValues("office");
        Integer[] integers =new Integer[ins.length];
        for (int i = 0; i < ins.length; i++) {
            integers[i]=Integer.parseInt(ins[i]);
            System.out.println(ins[i]);
        }
        DepartmentServiceImpl departmentServiceImpl=new DepartmentServiceImpl();

        Integer integer = departmentServiceImpl.deleteDepartments(integers);

        if (integer > 0){
            System.out.println("ok");
        }else {
            System.out.println("失败");
        }
        resp.sendRedirect(req.getContextPath()+"/page02");

    }
}
