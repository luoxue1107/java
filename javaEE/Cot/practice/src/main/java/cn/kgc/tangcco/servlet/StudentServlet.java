package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.pojo.StudentPage;
import cn.kgc.tangcco.service.StudentServiceImpl;
import cn.kgc.tangcco.util.character.Character;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 16:34
 */
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req, resp, "text/html");
        StudentServiceImpl studentService = new StudentServiceImpl();
        StudentPage studentPage;
        String page = null;
        page = req.getParameter("page");
        if (page == null) {
            page="1";
            System.out.println("page空");
        }
        studentPage = studentService.getStudentList(Integer.valueOf(page), 2);
        req.setAttribute("studentPage", studentPage);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
