package cn.kgc.servlet;

import cn.kgc.pojo.Role;
import cn.kgc.service.impl.ServiceEmpAndRolImpl;
import cn.kgc.service.impl.ServiceRoleImpl;
import cn.kgc.util.character.Character;

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
 * @date 2020/11/8 20:32
 */
@WebServlet(urlPatterns = "/SetRolesLogin")
public class SetRolesLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceRoleImpl serviceRole = new ServiceRoleImpl();
        ServiceEmpAndRolImpl er = new ServiceEmpAndRolImpl();
        Character.characterEncoding(req,resp,"text/html");
        String id = req.getParameter("id");
        List<Integer> ridList = er.getRidsByEid(Integer.valueOf(id));
        List<Role> roleList = serviceRole.getRole();
        req.setAttribute("id",Integer.valueOf(id));
        req.setAttribute("roleList",roleList);
        req.setAttribute("ridList",ridList);
        req.getRequestDispatcher("/SetRoles.jsp").forward(req, resp);
    }
}
