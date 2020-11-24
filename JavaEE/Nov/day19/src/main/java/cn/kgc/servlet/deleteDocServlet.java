package cn.kgc.servlet;

import cn.kgc.service.impl.DoctorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/24 1:13
 */
@WebServlet(urlPatterns = "/deleteDoc")
public class deleteDocServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        DoctorServiceImpl doctorService =new DoctorServiceImpl();
        Integer integer = doctorService.deleteDoctor(Integer.valueOf(id));
        if (integer>0){
            System.out.println("OK");
        }else {
            System.out.println("失败");
        }
        resp.sendRedirect(req.getContextPath()+"/page01");
    }
}
