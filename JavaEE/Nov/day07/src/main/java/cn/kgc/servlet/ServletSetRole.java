package cn.kgc.servlet;

import cn.kgc.dao.impl.EmpAndRolDaoImpl;
import cn.kgc.pojo.EmpAndRol;
import cn.kgc.service.impl.ServiceEmpAndRolImpl;

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
 * @date 2020/11/9 2:11
 */
@WebServlet(urlPatterns = "/SetRole.do")
public class ServletSetRole extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceEmpAndRolImpl er =new ServiceEmpAndRolImpl();
        Integer eid = Integer.valueOf(req.getParameter("eid"));
        String[] rids = req.getParameterValues("rid");
        Integer ins=0;
        List<EmpAndRol> empAndRolList = new EmpAndRolDaoImpl().selectAllEmpAndRol();
        for (EmpAndRol empAndRol : empAndRolList) {
            if (empAndRol.getEid().equals(eid)) {
                ins = er.delRoleByEid(eid);
            }else {
                ins=1;
            }
        }
        if (ins>0){
            int count =rids.length;
            Integer[] integers =new Integer[count];
            System.out.println(eid);
            for (int i = 0; i < count; i++) {
                integers[i] = Integer.valueOf(rids[i]);
            }
            Integer integer = er.addEmpAndRol(eid, integers);
            if (integer>0){
                System.out.println("设置成功");
                req.getRequestDispatcher("/login.do").forward(req,resp);
            }else {
                System.out.println("设置失败");
                req.getRequestDispatcher("/login.do").forward(req,resp);
            }
        }else {
            System.out.println("清空失败");
        }
    }
}
