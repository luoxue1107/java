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
 * @date 2020/11/23 16:23
 */
@WebServlet(urlPatterns = "/delDep")
public class delDepServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid = req.getParameter("uid");
        DepartmentServiceImpl depService= new DepartmentServiceImpl();
        Integer integer = depService.deleteDepartment(Integer.parseInt(uid));
        if (integer >0 ){
            System.out.println("成功");

        }else {
            System.out.println("失败");
        }
        resp.sendRedirect(req.getContextPath()+"/page02");
    }
}
