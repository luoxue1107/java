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
 * @date 2020/11/24 9:38
 */
@WebServlet(urlPatterns = "/setDep")
public class setDepServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        DepartmentServiceImpl depService=new DepartmentServiceImpl();
        String uid = req.getParameter("uid");
        String depName = req.getParameter("depName");
        if (uid != null||depName != null){
            if (depService.setDepartment(new Department(Integer.parseInt(uid), depName))>0){
                System.out.println("OK");
            }else {
                System.out.println("失败");
            }
        }
        req.getRequestDispatcher("/page02").forward(req,resp);
    }
}
