package cn.kgc.servlet;

import cn.kgc.pojo.Department;
import cn.kgc.pojo.Doctor;
import cn.kgc.service.impl.DepartmentServiceImpl;
import cn.kgc.service.impl.DoctorServiceImpl;
import cn.kgc.util.Character;
import com.alibaba.fastjson.JSON;

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
 * @date 2020/11/24 9:37
 */
@WebServlet(urlPatterns = "/setDocLogin")
public class setDocLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req, resp, "text/html");
        DoctorServiceImpl doctorService = new DoctorServiceImpl();
        DepartmentServiceImpl deploymentService=new DepartmentServiceImpl();
        String id = req.getParameter("id");
        System.out.println(id);
        if (id != null) {
            Doctor doctor = doctorService.getDoctorById(Integer.parseInt(id));
            req.setAttribute("doctor", doctor);
            System.out.println("DOCTOR" + JSON.toJSONString(doctor));
        }
        List<Department> department = deploymentService.getDepartmentList();
        req.setAttribute("department",department);
        req.getRequestDispatcher("page06.jsp").forward(req, resp);
    }
}
