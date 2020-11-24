package cn.kgc.servlet;

import cn.kgc.pojo.Doctor;
import cn.kgc.service.impl.DoctorServiceImpl;
import cn.kgc.util.Character;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/24 9:37
 */
@WebServlet(urlPatterns = "/setDoc")
public class setDocServlet extends HttpServlet {
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
        if (name != null) {
            doctor.setName(name);
        }
        String birthday = req.getParameter("birthday");
        doctor.setBirthday(birthday);


        String gender = req.getParameter("gender");
        if (gender != null) {
            doctor.setGender(Integer.valueOf(gender));
        }
        String id = req.getParameter("id");
        doctor.setId_Card(id);
        System.out.println(JSON.toJSONString(doctor));
        String uid = req.getParameter("uid");

        doctor.setUid(Integer.valueOf(uid));

        Integer integer = doctorService.setDoctor(doctor);

        if (integer > 0) {
            System.out.println("OK");
        } else {
            System.out.println("失败");
        }
        req.getRequestDispatcher("/page01").forward(req, resp);
    }
}
