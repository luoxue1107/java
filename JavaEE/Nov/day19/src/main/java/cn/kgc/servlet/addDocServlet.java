package cn.kgc.servlet;

import cn.kgc.pojo.Doctor;
import cn.kgc.service.impl.DoctorServiceImpl;
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
 * @date 2020/11/24 0:09
 */
@WebServlet(urlPatterns = "/addDoc")
public class addDocServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req, resp, "text/html");
        DoctorServiceImpl doctorService = new DoctorServiceImpl();
        Doctor doctor = new Doctor();
        String did = req.getParameter("did");
        if (did != null) {
            doctor.setDid(Integer.valueOf(did));
        }
        String name = req.getParameter("name");
            doctor.setName(name);
        String birthday = req.getParameter("birthday");
            doctor.setBirthday(birthday);
        String gender = req.getParameter("gender");
        if (gender != null) {
            doctor.setGender(Integer.valueOf(gender));
        }
        String id = req.getParameter("id");
        doctor.setId_Card(id);
        Integer integer = doctorService.addDoctor(doctor);
        if (integer > 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
        resp.sendRedirect(req.getContextPath() + "/page01");
    }
}
