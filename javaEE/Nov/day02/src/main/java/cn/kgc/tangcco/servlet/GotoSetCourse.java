package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GotoSetCourse extends HttpServlet {

    private static final long serialVersionUID = -8844735602425423917L;
    private ServiceCourseImpl serviceCourse = new ServiceCourseImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");
        String id = req.getParameter("id");

        Course course = serviceCourse.getCourseById(Integer.parseInt(id));

        req.setAttribute("course", course);

        req.getRequestDispatcher("set_course.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
